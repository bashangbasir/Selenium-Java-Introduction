package slider;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTests extends BaseTests {

    @Test
    public void testHorizontalSlider(){
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        String expectedValue = "4";
        horizontalSliderPage.setSliderValue(expectedValue);
        Assert.assertEquals(horizontalSliderPage.getSliderValue(),expectedValue,"Slider value is incorrect.");
    }
}
