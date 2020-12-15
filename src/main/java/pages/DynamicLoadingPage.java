package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

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

    public DynamicLoadExample1Page rightClickOnExample1Link(){
        driver.findElement(example1Link).sendKeys(Keys.CONTROL,Keys.RETURN);
        return new DynamicLoadExample1Page(driver);
    }

    public DynamicLoadExample2Page rightClickOnExample2Link(){
        driver.findElement(example2Link).sendKeys(Keys.CONTROL,Keys.RETURN);
        return new DynamicLoadExample2Page(driver);
    }

}
