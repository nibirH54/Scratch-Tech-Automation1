import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class pageTitleTest {
    @Test(priority = 1)
    public void captureTitle() {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        WebDriverManager.chromedriver().setup();

        driver.get("http://www.google.com/");
        String googleTitle = driver.getTitle();
        System.out.println("The Page Title of Google is : " + googleTitle);
        driver.manage().window().maximize();
        driver.quit();
    }
}