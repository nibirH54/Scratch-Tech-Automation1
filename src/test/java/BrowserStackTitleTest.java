import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserStackTitleTest {

    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void openBrowser(){
        driver.get("https://www.browserstack.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void captureTitle(){
        String browserStackTitle= driver.getTitle();
        System.out.println("The title for browserstack is :" + browserStackTitle);
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
