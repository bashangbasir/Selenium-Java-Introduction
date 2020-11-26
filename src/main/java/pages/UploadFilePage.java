package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadFilePage {

    private WebDriver driver;
    private By uploadBtn = By.id("file-submit");
    private By inputField = By.id("file-upload");
    private By uploadedFile = By.id("uploaded-files");

    public UploadFilePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickUploadButton(){
        driver.findElement(uploadBtn).click();
    }

    /**
     *Provide path of file to the form then click upload btn
     * @param absPath the complete path of the file.
     */
    public void uploadFile(String absPath){
        driver.findElement(inputField).sendKeys(absPath);
        clickUploadButton();
    }

    public String getUploadedFile(){
        return driver.findElement(uploadedFile).getText();
    }


}
