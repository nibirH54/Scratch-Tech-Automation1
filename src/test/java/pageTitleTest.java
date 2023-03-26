import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class pageTitleTest {
    @Test(priority = 3)
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

    @Test(priority = 4)
    public void captureAmazonTitle(){
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        WebDriverManager.chromedriver().setup();

        driver.get("https://www.amazon.com/");
        String amazonTitle = driver.getTitle();
        System.out.println("The Page Title for Amazon is :" + amazonTitle);
        driver.manage().window().maximize();
        driver.quit();

    }
    @Test(priority = 5)
    public void captureExpediaTitle(){
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        WebDriverManager.chromedriver().setup();

        driver.get("https://www.expedia.com/");
        String getExpediaTitle = driver.getTitle();
        System.out.println("The Title of Expedia is :" + getExpediaTitle);
        driver.manage().window().maximize();
        driver.quit();
    }

    @Test(priority = 2)
    public void captureBookingTitle(){
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        WebDriverManager.chromedriver().setup();

        driver.get("https://www.booking.com/");
        String getBookingitle = driver.getTitle();
        System.out.println("The Booking.com page title is :" + getBookingitle);
        driver.manage().window().maximize();
        driver.quit();
    }

    @Test(priority = 1)
    public void captureBestBuyTitle(){
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        WebDriverManager.chromedriver().setup();

        driver.get("https://www.bestbuy.com/");
        String getBestbuyTitle = driver.getTitle();
        System.out.println("The Bestbuy Page Title is : " + getBestbuyTitle);
        driver.manage().window().maximize();
        driver.quit();
    }
}