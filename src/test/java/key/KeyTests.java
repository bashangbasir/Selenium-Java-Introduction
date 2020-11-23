package key;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.Key;

public class KeyTests extends BaseTests {

    @Test
    public void testBackSpaceKey(){
        var keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.sendKeyPress("A" + Keys.BACK_SPACE);
        Assert.assertEquals(keyPressesPage.getResultText(),"You entered: BACK_SPACE");
    }

    @Test
    public void testTabKey(){
        var keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.sendKeyPress("B"+Keys.TAB);
        Assert.assertEquals(keyPressesPage.getResultText(),"You entered: TAB");
    }

    @Test
    public void testPi(){
        var keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterPi();
        //don't finish it
    }
}
