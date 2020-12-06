package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver;
    private By example1Link = By.xpath(".//a[contains(text(),'Example 1')]");
    private By example2Link = By.xpath(".//a[contains(text(),'Example 2')]");

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadExample1Page clickLinkExample1(){
        driver.findElement(example1Link).click();
        return new DynamicLoadExample1Page(driver);
    }

    public DynamicLoadExample2Page clickLinkExample2(){
        driver.findElement(example2Link).click();
        return new DynamicLoadExample2Page(driver);
    }


}
