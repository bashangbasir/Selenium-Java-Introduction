package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private WebDriver driver;
    private By statusMessage = By.id("flash");

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    public String getStatusMessage(){
        return driver.findElement(statusMessage).getText();
    }
}
