
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class pageTitleTest {

    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void openBrowser(){
        driver.get("http://www.google.com");
        driver.manage().window().maximize();

    }
    @Test
    public void captureTitle() {
        driver.get("http://www.google.com");
        String googleTitle = driver.getTitle();
        System.out.println("The Page Title of Google is : " + googleTitle);

    }

    @Test
    public void captureAmazonTitle(){
        driver.get("https://www.amazon.com/");
        String amazonTitle = driver.getTitle();
        System.out.println("The Page Title for Amazon is :" + amazonTitle);


    }
    @Test
    public void captureExpediaTitle(){

        driver.get("https://www.expedia.com/");
        String getExpediaTitle = driver.getTitle();
        System.out.println("The Title of Expedia is :" + getExpediaTitle);

    }

    @Test
    public void captureBookingTitle(){
        driver.get("https://www.booking.com/");
        String getBookingitle = driver.getTitle();
        System.out.println("The Booking.com page title is :" + getBookingitle);

    }

    @Test
    public void captureBestBuyTitle(){
        driver.get("https://www.bestbuy.com/");
        String getBestbuyTitle = driver.getTitle();
        System.out.println("The Bestbuy Page Title is : " + getBestbuyTitle);

    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}