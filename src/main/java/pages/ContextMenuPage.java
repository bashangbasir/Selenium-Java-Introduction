package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By box = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void rightClickBox(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(box)).contextClick().perform();
    }

    public String alert_getAlertContent(){
        return driver.switchTo().alert().getText();
    }

    public void alert_acceptAlert(){
        driver.switchTo().alert().accept();
    }




}
