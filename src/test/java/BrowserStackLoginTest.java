import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserStackLoginTest {

    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void openBrowser(){
        driver.get("https://www.browserstack.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void logInTest(){
        driver.findElement(By.xpath("//a[@title='Sign In'][1] ")).click();
        driver.findElement(By.id("user_email_login")).sendKeys("info@scratchtechsolutions.com");
        driver.findElement(By.name("user[password]")).sendKeys("Surma2009?");
        driver.findElement(By.xpath("//input[@id='user_submit']")).click();
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
