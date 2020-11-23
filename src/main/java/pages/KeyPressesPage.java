package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    private WebDriver driver;
    private By textBox = By.id("target");
    private By resultText = By.id("result");

    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }

    public void sendKeyPress(String inputText){
        driver.findElement(textBox).sendKeys(inputText);
    }

    public void enterPi(){
        sendKeyPress(Keys.chord(Keys.ALT,"p") + "=3.141");
    }

    public String getResultText(){
        return driver.findElement(resultText).getText();
    }

}
