package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;
    private By email_loc = By.id("email");
    private By retrieveBtn_loc = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String email){
        driver.findElement(email_loc).sendKeys(email);
    }

    public SuccessRetrievePasswordPage clickRetrieveBtn(){
        driver.findElement(retrieveBtn_loc).click();
        return new SuccessRetrievePasswordPage(driver);
    }

}
