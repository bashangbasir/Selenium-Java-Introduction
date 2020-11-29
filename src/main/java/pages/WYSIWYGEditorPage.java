package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {

    private WebDriver driver;
    private By OkBtn = By.id("mceu_34");
    private String editorFrameId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentationBtn = By.id("mceu_11");
    private By decreaseIndentationBtn = By.id("mceu_12");

    public WYSIWYGEditorPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOkBtn(){
        driver.findElement(OkBtn).click();
    }

    public void clearTextEditor(){
        switchToEditorArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text){
        switchToEditorArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public String getTextfromEditor(){
        switchToEditorArea();
        String content = driver.findElement(textArea).getText();
        switchToMainArea();
        return content;
    }

    public void increaseIndentation(){
        driver.findElement(increaseIndentationBtn).click();
    }

    public void decreaseIndentation(){
        driver.findElement(decreaseIndentationBtn).click();
    }


    private void switchToEditorArea(){
        driver.switchTo().frame(editorFrameId);
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }


}
