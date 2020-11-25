package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerAlert();
        String content = alertsPage.alert_getText();
        alertsPage.alert_acceptAlert();
        Assert.assertEquals(content,"I am a JS Alert","Incorrect alert's content.");
        Assert.assertEquals(alertsPage.getResult(),"You successfuly clicked an alert","Incorrect result.");
    }

    @Test
    public void testDismissAlert(){
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerConfirm();
        String content = alertsPage.alert_getText();
        alertsPage.alert_dismissAlert();
        Assert.assertEquals(content,"I am a JS Confirm","Incorrect alert's content.");
        Assert.assertEquals(alertsPage.getResult(),"You clicked: Cancel");
    }

    @Test
    public void testPromptAlert(){
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerPrompt();
        String text = "Lorem Ipsum";
        alertsPage.alert_sendText(text);
        String content = alertsPage.alert_getText();
        alertsPage.alert_acceptAlert();
        Assert.assertEquals(content,"I am a JS prompt", "Incorrect alert's content");
        Assert.assertEquals(alertsPage.getResult(),"You entered: " + text,"Incorrect entered text.");
    }



}
