package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locator2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("file:///Users/user/Desktop/Techtorialhtml.html");

        //LOCATOR: LinkText
        WebElement java = driver.findElement(By.linkText("Java"));
        java.click();
        WebElement javaHeader = driver.findElement(By.tagName("h1"));
        System.out.println(javaHeader.getText().trim());
        driver.navigate().back();
        Thread.sleep(2000);

        System.out.println("========================");

        WebElement Selenium = driver.findElement(By.linkText("Selenium"));
        Selenium.click();
        WebElement SeleniumHeader = driver.findElement(By.tagName("h1"));
        System.out.println(SeleniumHeader.getText().trim());
        driver.navigate().back();
        Thread.sleep(2000);

        System.out.println("=============================");

        WebElement Cucumber = driver.findElement(By.linkText("Cucumber"));
        Cucumber.click();
        WebElement CucumberHeader = driver.findElement(By.tagName("h1"));
        System.out.println(CucumberHeader.getText().trim());
        driver.navigate().back();
        Thread.sleep(2000);

        System.out.println("==============================");

        WebElement TestNG = driver.findElement(By.linkText("TestNG"));
        TestNG.click();
        WebElement TestNGHeader = driver.findElement(By.tagName("h2"));
        System.out.println(TestNGHeader.getText().trim());
        driver.navigate().back();


     // driver.close();

    // LOCATOR: PartialLinkText

        WebElement restApi = driver.findElement(By.partialLinkText("Rest"));
        restApi.click();
        System.out.println(driver.getTitle());
        driver.navigate().back();

       java = driver.findElement(By.linkText("Java")); // to click it again we need to reaasign it
       java.click();


    }
}
