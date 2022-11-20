package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RealAutomationForXpath {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");

        WebElement ABTesting = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));

        ABTesting.click();

        WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
        user.sendKeys("John Doe");

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement logIn = driver.findElement(By.xpath("//button[@id='btn-login']"));
        logIn.click();

        WebElement facility = driver.findElement(By.xpath("//select[@id='combo_facility']"));
        facility.sendKeys("Hongkong CURA Healthcare Center");

        WebElement applyBox = driver.findElement(By.xpath("//input[@id='chk_hospotal_readmission']"));
        if (applyBox.isDisplayed()&&!applyBox.isSelected()){
            applyBox.click();
        }
        System.out.println(applyBox.isSelected()); //true
        WebElement medicaid  = driver.findElement(By.xpath("//input[@value='Medicaid']"));
        medicaid.click();
        WebElement date = driver.findElement(By.xpath("//input[@class='form-control']"));
        date.sendKeys("02/11/2022");
        WebElement comment = driver.findElement(By.xpath("//textarea[@id='txt_comment']"));
        comment.sendKeys("Hello this is my first appoitment");
        WebElement submitButton = driver.findElement(By.xpath("//button[@id='btn-book-appointment']"));
        submitButton.click();

        WebElement confirmationTitle = driver.findElement(By.tagName("h2"));
        System.out.println(confirmationTitle.getText().trim());

        WebElement confirmation1 = driver.findElement(By.xpath("//p[@id='facility']"));
        System.out.println("Facility: "+ confirmation1.getText().trim());

        WebElement confirmation2 = driver.findElement(By.xpath("//p[@id='hospital_readmission']"));
        System.out.println("Apply for hospital readmission: "+ confirmation2.getText().trim());

        WebElement confirmation3 = driver.findElement(By.xpath("//p[@id='program']"));
        System.out.println("Healthcare Program: "+ confirmation3.getText().trim());

        WebElement confirmation4 = driver.findElement(By.xpath("//p[@id='visit_date']"));
        System.out.println("Visit Date "+ confirmation4.getText().trim());

        WebElement confirmation5 = driver.findElement(By.xpath("//p[@id='comment']"));
        System.out.println("Comment "+ confirmation5.getText().trim());

        WebElement homePage = driver.findElement(By.xpath("//a[@class='btn btn-default']"));
        homePage.click();

        System.out.println("URL: "+driver.getCurrentUrl());
        driver.quit();


    }
}
