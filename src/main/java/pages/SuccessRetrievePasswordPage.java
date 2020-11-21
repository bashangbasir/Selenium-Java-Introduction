package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessRetrievePasswordPage {

    private WebDriver driver;
    private By msg_loc = By.id("content");

    public SuccessRetrievePasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public String getSuccessMsg(){
        return driver.findElement(msg_loc).getText();
    }
}
