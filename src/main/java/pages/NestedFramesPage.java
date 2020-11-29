package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;
    private String frameTop = "frame-top";
    private String frameBottom = "frame-bottom";
    private String frameLeft = "frame-left";
    private String frameRight = "frame-right";
    private String frameMiddle = "frame-middle";
    //text in the body of frame
    private By bodyFrame = By.tagName("body");


    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }

    public String getTextFromLeftFrame(){
        switchToFrame(frameTop);
        switchToFrame(frameLeft);
        String content = getTextFromFrame();
        exitToMainFrameFromLMRFrame();
        return content;
    }

    public String getTextFromRightFrame(){
        switchToFrame(frameTop);
        switchToFrame(frameRight);
        String content = getTextFromFrame();
        exitToMainFrameFromLMRFrame();
        return content;
    }

    public String getTextFromMiddleFrame(){
        switchToFrame(frameTop);
        switchToFrame(frameMiddle);
        String content = getTextFromFrame();
        exitToMainFrameFromLMRFrame();
        return content;
    }
    public String getTextFromBottomFrame(){
        switchToFrame(frameBottom);
        String content = getTextFromFrame();
        exitToMainFrameFromBottomFrom();
        return content;
    }

    private void switchToFrame(String frameName){
        driver.switchTo().frame(frameName);
    }

    /**
     * Method to exit to main frame after switch to LMR(Left-Middle-Right) frame
     */
    private void exitToMainFrameFromLMRFrame(){
        driver.switchTo().parentFrame().switchTo().parentFrame();
    }

    private void exitToMainFrameFromBottomFrom(){
        driver.switchTo().parentFrame();
    }

    private String getTextFromFrame(){
        return driver.findElement(bodyFrame).getText();
    }

}
