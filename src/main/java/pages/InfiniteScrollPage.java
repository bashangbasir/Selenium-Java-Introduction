package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InfiniteScrollPage {

    private WebDriver driver;
    private By textBlocks = By.className("jscroll-added");
    private int index;

    public InfiniteScrollPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Scroll paragraph with index scpecified is in the view
     * @param index - 1-based index
     */
    public void scrollToParagraph(int index){
        this.index = index;
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor)driver;
        while(getNumberOfParagraphPresent()< index){
            jsExecutor.executeScript(script);
        }
    }

    public boolean isParagraphDisplayed(){
        return driver.findElements(textBlocks).get(index-1).isDisplayed();
    }

    private int  getNumberOfParagraphPresent(){
        return driver.findElements(textBlocks).size();
    }
}
