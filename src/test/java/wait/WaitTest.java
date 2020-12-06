package wait;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitTest extends BaseTests {

    @Test
    public void testWaitUntilInvisible(){
        var DynamicLoadingPage = homePage.clickDynamicLoadingPage();
        var DynamicLoadExample1Page = DynamicLoadingPage.clickLinkExample1();
        DynamicLoadExample1Page.clickStartButton();
        Assert.assertEquals(DynamicLoadExample1Page.getLoadedText(),"Hello World!","Incorrect loaded text.");
    }

    @Test
    public void testWaitUntilVisible(){
        var DynamicLoadingPage = homePage.clickDynamicLoadingPage();
        var DynamicLoadExample2Page = DynamicLoadingPage.clickLinkExample2();
        DynamicLoadExample2Page.clickStartButton();
        Assert.assertEquals(DynamicLoadExample2Page.getLoadedText(),"Hello World!","Incorrect loaded text.");
    }

    @Test
    public void testFluentWaitUntilInvisible(){
        var DynamicLoadExample1Page = homePage.clickDynamicLoadingPage().clickLinkExample1();
        DynamicLoadExample1Page.clickStartButtonFluentWait();
        Assert.assertEquals(DynamicLoadExample1Page.getLoadedText(),"Hello World!","Incorrect loaded text.");
    }

    @Test
    public void testFluentWaitUntilVisible(){
        var DynamicLoadExample2Page = homePage.clickDynamicLoadingPage().clickLinkExample2();
        DynamicLoadExample2Page.clickStartButtonFluentWait();
        Assert.assertEquals(DynamicLoadExample2Page.getLoadedText(),"Hello World!","Incorrect loaded text.");
    }

}
