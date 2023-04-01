import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;



public class pageTitleTest {

    WebDriver driver = new ChromeDriver();
    @Test(priority = 3)
    public void captureTitle() {
        driver.get("http://www.google.com/");
        String googleTitle = driver.getTitle();
        System.out.println("The Page Title of Google is : " + googleTitle);
        driver.manage().window().maximize();
        driver.quit();
    }

    @Test(priority = 4)
    public void captureAmazonTitle(){
        driver.get("https://www.amazon.com/");
        String amazonTitle = driver.getTitle();
        System.out.println("The Page Title for Amazon is :" + amazonTitle);
        driver.manage().window().maximize();
        driver.quit();

    }
    @Test(priority = 5)
    public void captureExpediaTitle(){

        driver.get("https://www.expedia.com/");
        String getExpediaTitle = driver.getTitle();
        System.out.println("The Title of Expedia is :" + getExpediaTitle);
        driver.manage().window().maximize();
        driver.quit();
    }

    @Test(priority = 2)
    public void captureBookingTitle(){

        driver.get("https://www.booking.com/");
        String getBookingitle = driver.getTitle();
        System.out.println("The Booking.com page title is :" + getBookingitle);
        driver.manage().window().maximize();
        driver.quit();
    }

    @Test(priority = 1)
    public void captureBestBuyTitle(){

        driver.get("https://www.bestbuy.com/");
        String getBestbuyTitle = driver.getTitle();
        System.out.println("The Bestbuy Page Title is : " + getBestbuyTitle);
        driver.manage().window().maximize();
        driver.quit();
    }
}