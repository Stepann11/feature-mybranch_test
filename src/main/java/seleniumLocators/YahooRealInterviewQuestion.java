package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class YahooRealInterviewQuestion {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.yahoo.com/");

        WebElement news = driver.findElement(By.xpath("//a[contains(text(),'News')]")); //a[@id='blabla']
        news.click();
        List<WebElement> allHeaders = driver.findElements(By.xpath("//h3"));
        for (WebElement header : allHeaders){
            System.out.println(header.getText().trim());
        }

    }
}