package frame;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NestedFrameTest extends BaseTests {

    @Test
    public void testNestedFrame_left(){
        var framePage = homePage.clickFramesPage();
        var nestedFramePage = framePage.clickNestedFramesPage();
        String content = nestedFramePage.getTextFromLeftFrame();
        Assert.assertEquals(content,"LEFT","Incorrect frame content.");
    }

    @Test
    public void testNestedFrame_middle(){
        var framePage = homePage.clickFramesPage();
        var nestedFramePage = framePage.clickNestedFramesPage();
        String content = nestedFramePage.getTextFromMiddleFrame();
        Assert.assertEquals(content,"MIDDLE","Incorrect frame content.");
    }

    @Test
    public void testNestedFrame_right(){
        var framePage = homePage.clickFramesPage();
        var nestedFramePage = framePage.clickNestedFramesPage();
        String content = nestedFramePage.getTextFromRightFrame();
        Assert.assertEquals(content,"RIGHT","Incorrect frame content.");
    }

    @Test
    public void testNestedFrame_bottom(){
        var framePage = homePage.clickFramesPage();
        var nestedFramePage = framePage.clickNestedFramesPage();
        String content = nestedFramePage.getTextFromBottomFrame();
        Assert.assertEquals(content,"BOTTOM","Incorrect frame content.");
    }
}
