package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {
    public static void main(String[] args) {
        //We are setting up our automation
        System.setProperty("webdriver.chrome.driver","chromedriver");
        //window user should put exe at the end
        WebDriver driver = new ChromeDriver();
        // this is the example of polymorphism . We are creating chromedriver from WebDriver
        driver.manage().window().maximize();// this maximizes your screen
        driver.get("https://www.techtorialacademy.com/");
        System.out.println(driver.getTitle());
        String actualTitle = driver.getTitle();
        String expectedTitle= "Home Page - Techtorial";
                if(actualTitle.equals(expectedTitle)){
                    System.out.println("Your test is passed");
                }else {
                    System.out.println("Your test is faild");
                }
                String actualUrl = driver.getCurrentUrl();
                String expectedUrl = "https://www.techtorialacademy.com/";
                if (actualUrl.equals(expectedUrl)){
                    System.out.println("Your URL test is passed");
                }else {
                    System.out.println("Your URL test is faild");
                }

        System.out.println("=============================================");

        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        String actualTitle1 = driver.getTitle();
        String expectedTitle1= "Home Page - YouTube";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Your test is passed");
        }else {
            System.out.println("Your test is faild");
        }
        String actualUrl1 = driver.getCurrentUrl();
        String expectedUrl1 = "https://www.youtube.com/";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Your URL test is passed");
        }else {
            System.out.println("Your URL test is faild");
        }

        System.out.println("=============================================");

        driver.get("https://www.amazon.com/");
        System.out.println(driver.getTitle());
        String actualTitle2 = driver.getTitle();
        String expectedTitle2= "Home Page - Amazon";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Your test is passed");
        }else {
            System.out.println("Your test is faild");
        }
        String actualUrl2 = driver.getCurrentUrl();
        String expectedUrl2 = "https://www.amazon.com/";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Your URL test is passed");
        }else {
            System.out.println("Your URL test is faild");
        }

        System.out.println("==============================================");

        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        String actualTitle3 = driver.getTitle();
        String expectedTitle3= "Facebook";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Your test is passed");
        }else {
            System.out.println("Your test is faild");
        }
        String actualUrl3 = driver.getCurrentUrl();
        String expectedUrl3 = "https://www.facebook.com/";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Your URL test is passed");
        }else {
            System.out.println("Your URL test is faild");
        }


    }
}
