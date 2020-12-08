package javascript;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class JavaScriptTest extends BaseTests {

    @Test
    public void testScrollToTable(){
        var LargeAndDeepDOMPage = homePage.clickLargeAndDeepDOMPage();
        LargeAndDeepDOMPage.scrollToTable();
        Assert.assertTrue(LargeAndDeepDOMPage.isTableDisplayed(),"Table is not displayed.");
    }

    @Test
    public void testScrollToParagraph(){
        var InfiniteScrollPage = homePage.clickInfiniteScrollPage();
        InfiniteScrollPage.scrollToParagraph(5);
        Assert.assertTrue(InfiniteScrollPage.isParagraphDisplayed(),"Paragraph is not displayed.");
    }

    @Test
    public void testAddMultipleAttributeToDropdown(){
        var dropDownPage = homePage.clickDropDownPage();
        dropDownPage.addMultipleAttribute();

        var optionToSelect = List.of("Option 1","Option 2");
        optionToSelect.forEach(dropDownPage::selectFromDropDown);

        var selectedOption = dropDownPage.getSelectedOption();
        Assert.assertTrue(selectedOption.containsAll(optionToSelect),"All options is not selected.");
        Assert.assertEquals(selectedOption.size(),optionToSelect.size(),"Number of selected option is incorrect.");
    }
}
