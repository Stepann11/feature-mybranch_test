package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class FindelemetnsPractice1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        List<WebElement> allElements = driver.findElements(By.xpath("//li"));

        for (WebElement box : allElements){
            System.out.println( box.getText().trim());

            }
        System.out.println("==================================");


        int counter = 0;
        for (WebElement link : allElements){
            if (link.getText().length() < 12){
                System.out.println(link.getText().trim());
                counter++;
            }
        }
        System.out.println(counter);
        }
         // TASK 2:
    // 1- I want you print out the links length less tha 12
    // Print out how many links do you have less than 12





    }

