package SelecClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SeletPractice {

    /*
    1- Navigate to the html techtorial website
    2- Get all the options and print them out
    3- Validate (assert) the default value of box is "UNITED STATES"
     */


    @Test
    public void options() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("file:///Users/user/Desktop/Techtorialhtml.html");

        WebElement country1 = driver.findElement(By.xpath("//select[@name='country']"));
        Select countries = new Select(country1);
        List<WebElement> allTheCountries = countries.getOptions();
        System.out.println("The size is: " + allTheCountries.size());
        for (WebElement country : allTheCountries) {
            System.out.println(country.getText().trim());
        }
        WebElement firstSelected = countries.getFirstSelectedOption();
        Assert.assertEquals(firstSelected.getText().trim(), "UNITED STATES");

        /*
        1- I want you choose your country any method you want
         */
        countries.selectByVisibleText("UKRAINE");





    }
}