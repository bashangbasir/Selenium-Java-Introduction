package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private By formAuthLink = By.linkText("Form Authentication");
    private WebDriver driver;

    public  HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuth(){
        driver.findElement(formAuthLink).click();
        return new LoginPage(driver);
    }
}
