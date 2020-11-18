package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By usernameElem = By.id("username");
    private By passwordElem = By.id("password");
    private By loginBtn = By.cssSelector("#login button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(usernameElem).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordElem).sendKeys(password);
    }

    public SecureAreaPage clickLoginBtn(){
        driver.findElement(loginBtn).click();
        return new SecureAreaPage(driver);
    }

}
