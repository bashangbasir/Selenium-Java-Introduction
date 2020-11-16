package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Chapter3Excercise {

    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement shiftingContent_elem = driver.findElement(By.linkText("Shifting Content"));
        shiftingContent_elem.click();

        WebElement example1_elem = driver.findElement(By.linkText("Example 1: Menu Element"));
        example1_elem.click();

        List<WebElement> menus = driver.findElements(By.tagName("li"));
        System.out.println(menus.size());

        driver.quit();

    }

    public static void main(String[] args) {
        Chapter3Excercise test = new Chapter3Excercise();
        test.setUp();

    }

}
