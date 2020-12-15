package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WindowManager;

public class MultipleWindowsPage {

    private WebDriver driver;
    private By link = By.linkText("Click Here");

    public MultipleWindowsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickLink(){
        driver.findElement(link).click();
    }
}
