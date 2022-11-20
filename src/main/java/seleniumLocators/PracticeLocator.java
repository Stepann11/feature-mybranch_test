package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PracticeLocator {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("http://tutorialsninja.com/demo/index.php?route=account/register");

        WebElement userName = driver.findElement(By.xpath("//input[@id='input-firstname']"));
        userName.sendKeys("Stepan");

        WebElement lastName = driver.findElement(By.cssSelector("#input-lastname"));
        lastName.sendKeys("Pastukh");

        WebElement email = driver.findElement(By.xpath("//input[@id='input-email']"));
        email.sendKeys("stiopa111.pa@gmail.com");

        WebElement phone = driver.findElement(By.xpath("//input[@id='input-telephone']"));
        phone.sendKeys("937-999-92");

        WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
        password.sendKeys("Stiopa123");

        WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='input-confirm']"));
        confirmPassword.sendKeys("Stiopa123");

        WebElement privacyLink = driver.findElement(By.linkText("Privacy Policy"));
        privacyLink.click();

        WebElement privacyText = driver.findElement(By.cssSelector(".modal-title"));
        String actualText = privacyText.getText().trim();
        String expectedText = "Privacy Policy";

        if (actualText.equals(expectedText)){
            System.out.println("text is correct");
        }else{
            System.out.println("text is not correct");
        }

        WebElement close = driver.findElement(By.cssSelector(".close"));
        close.click();

        WebElement privacy = driver.findElement(By.xpath("//input[@type='checkbox']"));
        if (!privacy.isSelected()){
            privacy.click();
        }

        WebElement continue1 = driver.findElement(By.xpath("//input[@value='Continue']"));
        continue1.click();

        WebElement validateHeader = driver.findElement(By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]"));
        String actualHeader = validateHeader.getText().trim();
        String excpectedheader = "Your Account Has Been Created!";
        if (actualHeader.equals(excpectedheader)){
            System.out.println("Account is created");
        }else {
            System.out.println("Account is not created");
        }






    }
}
  /*
1-Navigate to the website http://tutorialsninja.com/demo/index.php?route=account/register
2-Fill all the boxes
3-Click privacy button
4-Print out the text and close the tab
5-CLick privacy button if it is not selected
4-Click continue button
5-Validate Account is created header

NOTE:To be able get see account is created for you last run make sure you have a different email
just add ahmet1,ahmet2 like that everytime for validation.
}
     */