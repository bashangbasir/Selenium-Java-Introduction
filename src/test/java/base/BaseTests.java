package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {

    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        //fullscreen the browser
        driver.manage().window().maximize();
        //same as above
        //driver.manage().window().fullscreen();
        //set custom size
        //driver.manage().window().setSize(new Dimension(375,812));

        //find the elements
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        //find the element
        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        //click the element
        inputsLink.click();

        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
