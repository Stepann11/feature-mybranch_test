package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice_1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/");

        WebElement java = driver.findElement(By.linkText("Horizontal Slider"));
        java.click();
        WebElement javaHeader = driver.findElement(By.tagName("h3"));
        System.out.println(javaHeader.getText().trim());
        WebElement javaHeader1 = driver.findElement(By.tagName("h4"));
        System.out.println(javaHeader1.getText().trim());

        WebElement Selenium = driver.findElement(By.linkText("Elemental Selenium"));
        Selenium.click();

        driver.quit();




    }

}
