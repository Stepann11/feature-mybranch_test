package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class YoutubeInterviewQuestion {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");

        WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
        search.sendKeys("Justin Bieber");
        WebElement click = driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']"));
        click.click();
        Thread.sleep(3000);

       List<WebElement> songs  = driver.findElements(By.xpath("//a[@id='video-title']"));

        for  (WebElement song : songs){
            if (song.getAttribute("title").equals("Justin Bieber - One Time (Official Music Video)")){
                song.click();
            }
        }



    }
}
