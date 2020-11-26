package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadFileTests extends BaseTests {

    @Test
    public void testUploadFile(){
        var uploadFilePage = homePage.clickUploadFilePage();
        uploadFilePage.uploadFile("F:\\Java-Project\\webdriver_java\\resources\\chromedriver.exe");
        Assert.assertEquals(uploadFilePage.getUploadedFile(),"chromedriver.exe", "Incorrect file.");
    }
}
