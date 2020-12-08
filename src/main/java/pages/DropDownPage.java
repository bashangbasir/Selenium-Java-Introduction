package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {

    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropDownPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectFromDropDown(String option) {
        findDropDownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOption(){
        List<WebElement> selectedElems = findDropDownElement().getAllSelectedOptions();
        return selectedElems.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    public void addMultipleAttribute(){
        String script = "arguments[0].setAttribute('multiple','')";
        var jsExecutor = (JavascriptExecutor)driver;
        jsExecutor.executeScript(script,findDropDownElement());
    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(dropdown));
    }
}
