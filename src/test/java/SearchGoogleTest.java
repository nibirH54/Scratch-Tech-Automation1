import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.Callable;

public class SearchGoogleTest {

    @Test(priority = 3)
    public void testSearch1(){
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        WebDriverManager.chromedriver().setup();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement t = driver.findElement(By.name("q"));
        t.sendKeys("CNBC Office Address");
        t.sendKeys(Keys.ENTER);
        driver.navigate().back();
        driver.quit();
    }
    @Test(priority = 2)
    public void testSearch2(){
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        WebDriverManager.chromedriver().setup();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement x = driver.findElement(By.xpath("//input[@name='q']"));
        x.sendKeys("Where is Apple Headquarter located?");
        x.sendKeys(Keys.ENTER);
        driver.navigate().back();
        driver.quit();
    }

    @Test(priority = 1)
    public void testSearch3(){
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        WebDriverManager.chromedriver().setup();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement y = driver.findElement(By.xpath("//input[@class='gLFyf']"));
        y.sendKeys("How old is Elon Mask?");
        y.sendKeys(Keys.ENTER);
        driver.navigate().back();
        driver.quit();
    }

}
