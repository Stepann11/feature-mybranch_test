package SelecClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserUtils;

import java.time.Duration;
import java.util.List;

public class DreamCar {

     /*
NOTE: Please use browser utils for the select classes if it is needed.
1-Navigate to the website
2-Choose the "New Cars" from the New/used option
3-Choose "Lexus" for Make part
4-Choose "RX-350"
5-Validate the Price is selected "No max price"-->getFirstSelectedOption
6-Choose the distance 40 mil
7-Put your Zip code-->Before that Clear it.60056
8-Click Search Button
9-Validate the header "New Lexus RX 350 for sale"
10-Click Sort by and choose the Lowest Price
11-Validate the all titles has Lexus RX-350
      */


    @Test
    public void options() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.cars.com/");

        WebElement newUsed = driver.findElement(By.xpath("//select[@name='stock_type']"));
        BrowserUtils.selectBy(newUsed, "2","index");
        Thread.sleep(1000);

        WebElement make  = driver.findElement(By.xpath("//select[@id='makes']"));
        BrowserUtils.selectBy(make, "lexus","value");
        Thread.sleep(1000);

        WebElement model  = driver.findElement(By.xpath("//select[@id='models']"));
        BrowserUtils.selectBy(model, "lexus-rx_350","value");

        WebElement price = driver.findElement(By.xpath("//select[@id='make-model-max-price']"));
        Select priceBox = new Select(price);
        WebElement maxPrice = priceBox.getFirstSelectedOption();
        Assert.assertEquals(BrowserUtils.getText(maxPrice), "No max price");

        Thread.sleep(1000);

        WebElement distance  = driver.findElement(By.xpath("//select[@id='make-model-maximum-distance']"));
        BrowserUtils.selectBy(distance, "40","value");

        WebElement zipCode  = driver.findElement(By.xpath("//input[@id='make-model-zip']"));
        zipCode.clear();
        zipCode.sendKeys("60056");

        WebElement button  = driver.findElement(By.xpath("//button[contains(text(),'Search')and @ data-searchtype='make']"));
        button.click();

        Thread.sleep(1000);

        WebElement headerText = driver.findElement(By.xpath("//h1"));
        Assert.assertEquals(BrowserUtils.getText(headerText), "New Lexus RX 350 for sale");

        Thread.sleep(3000);

        WebElement sort  = driver.findElement(By.xpath("//select[@id='sort-dropdown']"));
        BrowserUtils.selectBy(sort, "Lowest price","text");

        List<WebElement> allTitles = driver.findElements(By.xpath("//h2[@class='title']"));
        for (WebElement title1 : allTitles){
            Thread.sleep(3000);
            System.out.println(BrowserUtils.getText(title1));
            Assert.assertTrue(title1.getText().contains("Lexus RX 350"));
            Assert.assertEquals(title1.getText().trim().contains("Lexus RX 350"),true);

        }
        
















    }
}
