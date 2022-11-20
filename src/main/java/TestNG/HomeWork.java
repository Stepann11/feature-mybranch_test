package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeWork {



    @Test
    public void catalogProductAscending() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/admin/");

        WebElement userName = driver.findElement(By.id("input-username"));
        userName.sendKeys("demo");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("demo");

        WebElement login = driver.findElement(By.xpath("//button"));
        login.click();
        Thread.sleep(3000);

        WebElement xButton = driver.findElement(By.cssSelector(".btn-close"));
        xButton.click();

        WebElement catalogButton = driver.findElement(By.xpath("//a[contains(text(),' Catalog')]"));
        catalogButton.click();

        WebElement productButton = driver.findElement(By.xpath("//a[contains(text(),'Products')]"));
        productButton.click();

        WebElement productName = driver.findElement(By.xpath("//a[contains(text(),'Product Name')]"));
        productName.click();//descending order

        Thread.sleep(2000);
        WebElement productName1 = driver.findElement(By.xpath("//a[contains(text(),'Product Name')]"));
        productName1.click(); //ascending order

        Thread.sleep(2000);
        List<WebElement> allBrands = driver.findElements(By.xpath("//td[@class='text-start']")); //11
        List<String> actualBrands = new ArrayList<>();
        List<String> expectedBrands = new ArrayList<>();
        for (int i = 1; i < allBrands.size(); i++) {
            Thread.sleep(2000);
            actualBrands.add(allBrands.get(i).getText().toLowerCase().trim());
            expectedBrands.add(allBrands.get(i).getText().toLowerCase().trim());
        }
        Collections.sort(expectedBrands);
        Collections.reverse(expectedBrands);
        System.out.println(actualBrands);
        System.out.println(expectedBrands);

    }

    @Test
    public void selectedBox() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/admin/");

        WebElement userName = driver.findElement(By.id("input-username"));
        userName.sendKeys("demo");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("demo");

        WebElement login = driver.findElement(By.xpath("//button"));
        login.click();
        Thread.sleep(3000);

        WebElement xButton = driver.findElement(By.cssSelector(".btn-close"));
        xButton.click();

        WebElement catalogButton = driver.findElement(By.xpath("//a[contains(text(),' Catalog')]"));
        catalogButton.click();

        WebElement productButton = driver.findElement(By.xpath("//a[contains(text(),'Products')]"));
        productButton.click();

       List <WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
         checkBox.get(0).click();
        Thread.sleep(2000);
        for (int i = 0; i < checkBox.size(); i++) {
            Assert.assertTrue(checkBox.get(i).isSelected());
        }

        checkBox.get(0).click();
        Thread.sleep(2000);
        for (int i = 0; i < checkBox.size(); i++) {
            Assert.assertTrue(!checkBox.get(i).isSelected());
        }


    }
}

