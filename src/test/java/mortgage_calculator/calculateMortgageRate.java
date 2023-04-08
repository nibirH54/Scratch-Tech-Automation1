package mortgage_calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class calculateMortgageRate {

    WebDriver driver = new ChromeDriver();
    Select select;

    @BeforeMethod
    public void openBrowser(){
        driver.get("https://www.mortgagecalculator.org/");
        driver.manage().window().maximize();
    }

    private void enterData(){

        //Enter home-value as 300000
        driver.findElement(By.id("homeval")).clear();
        driver.findElement(By.id("homeval")).sendKeys("300000");

        //Enter down-payment as $60000
        driver.findElement(By.id("downpayment")).clear();
        driver.findElement(By.id("downpayment")).sendKeys("60000");

        //Click on $ radio button
        driver.findElement(By.name("param[downpayment_type]")).click();

        //Enter loan amount as $24000
        driver.findElement(By.id("loanamt")).clear();
        driver.findElement(By.id("loanamt")).sendKeys("24000");

        //Enter interest rate as 3%
        driver.findElement(By.id("intrstsrate")).clear();
        driver.findElement(By.id("intrstsrate")).sendKeys("3");

        //Enter Loan Term as 30
        driver.findElement(By.id("loanterm")).clear();
        driver.findElement(By.id("loanterm")).sendKeys("30");

        //Select the start Month as April
        select= new Select(driver.findElement(By.name("param[start_month]")));
        select.selectByVisibleText("Apr");

        //Enter Year as 2023
        driver.findElement(By.id("start_year")).clear();
        driver.findElement(By.id("start_year")).sendKeys("2023");

        //Enter Property tax as $5000
        driver.findElement(By.id("pptytax")).clear();
        driver.findElement(By.id("pptytax")).sendKeys("5000");

        //Enter PMI as 0.5
        driver.findElement(By.id("pmi")).clear();
        driver.findElement(By.id("pmi")).sendKeys("0.5");

        //Enter HOI as $1000
        driver.findElement(By.id("hoi")).clear();
        driver.findElement(By.id("hoi")).sendKeys("1000");

        //Enter HOA as $100
        driver.findElement(By.id("hoa")).clear();
        driver.findElement(By.id("hoa")).sendKeys("100");

        //Select Loan type as FHA
        select = new Select(driver.findElement(By.name("param[milserve]")));
        select.selectByVisibleText("FHA");

        //Select Buy option from dropdown
        select = new Select(driver.findElement(By.name("param[refiorbuy]")));
        select.selectByVisibleText("Buy");

    }

    @Test
    public void calculateMonthlyPayment(){
        enterData();

        //click on calculate button
        driver.findElement(By.name("cal")).click();

        String expectedTotalMonthlyPayment = "701.18";
        String formattedXpath = String.format("//h3[text()='$701.18']",expectedTotalMonthlyPayment);

        boolean present = driver.findElement(By.xpath(formattedXpath)).isDisplayed();
        Assert.assertTrue(present, "Total Monthly Payment is not Presented");


    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
