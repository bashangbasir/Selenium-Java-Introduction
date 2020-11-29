package frame;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameTest extends BaseTests {


    @Test
    public void testIFrame(){
        var wysiwygEditorPage = homePage.clickWYSIWYGEditorPage();
        wysiwygEditorPage.clickOkBtn();
        wysiwygEditorPage.clearTextEditor();

        String text1 = "Hello ";
        String text2 = "World!";

        wysiwygEditorPage.setTextArea(text1);
        wysiwygEditorPage.setTextArea(text2);
        wysiwygEditorPage.increaseIndentation();
        wysiwygEditorPage.decreaseIndentation();
        Assert.assertEquals(wysiwygEditorPage.getTextfromEditor(),text1+text2, "Incorrent text in text area.");
    }

}
