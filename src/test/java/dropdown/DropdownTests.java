package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;
import pages.LoginPage;

import java.util.List;

public class DropdownTests extends BaseTests {

    @Test
    public void testDropdown(){
        var dropDownPage =  homePage.clickDropDownPage();
        String option = "Option 1";
        dropDownPage.selectFromDropDown("Option 1");
        var opts = dropDownPage.getSelectedOption();
        Assert.assertEquals(opts.size(),1,"The options selected is not 1");
        Assert.assertTrue(opts.contains(option),"The option selected is wrong");
    }
}
