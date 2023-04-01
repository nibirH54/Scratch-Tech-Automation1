import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchGoogleTest {
    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void openBrowser(){
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
    }

    @Test
    public void testSearch1(){
        WebElement t = driver.findElement(By.name("q"));
        t.sendKeys("CNBC Office Address");
        t.sendKeys(Keys.ENTER);
        driver.close();

    }
    @Test
    public void testSearch2(){
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        WebElement x = driver.findElement(By.xpath("//input[@name='q']"));
        x.sendKeys("Where is Apple Headquarter located?");
        x.sendKeys(Keys.ENTER);


    }

    @Test
    public void testSearch3(){
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        WebElement y = driver.findElement(By.xpath("//input[@class='gLFyf']"));
        y.sendKeys("How old is Elon Mask?");
        y.sendKeys(Keys.ENTER);

    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}
