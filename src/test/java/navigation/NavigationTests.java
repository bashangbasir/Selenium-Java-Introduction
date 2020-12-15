package navigation;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator(){
        homePage.clickDynamicLoadingPage().clickLinkExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
        Assert.assertEquals(getWindowManager().getTittle(),"Google","Incorrect title window.");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindowsPage().clickLink();
        getWindowManager().switchToTab("New Window");
        Assert.assertEquals(getWindowManager().getTittle(),"New Window", "Incorrect title window");
    }

    @Test
    public void testSwitchToNewTab(){
        var Page = homePage.clickDynamicLoadingPage().rightClickOnExample1Link();
        getWindowManager().switchToNewTab();
        Assert.assertTrue(Page.isStartButtonDisplayed(),"Start button is not displayed.");
    }

}
