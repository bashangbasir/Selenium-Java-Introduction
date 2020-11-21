package forgotpassword;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testForgotPassword(){

        var forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("test1@xxxx.com");
        var successMsgPage = forgotPasswordPage.clickRetrieveBtn();
        Assert.assertTrue(successMsgPage.getSuccessMsg().contains("Your e-mail's been sent!"),"The message shown is wrong");

    }
}
