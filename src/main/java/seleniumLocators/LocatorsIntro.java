package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorsIntro {
    public static void main(String[] args) {
// ID LOCATOR
        System.setProperty("webdriver.chrome.driver","chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("file:///Users/user/Desktop/Techtorialhtml.html");
        WebElement header = driver.findElement(By.id("techtorial1"));
        System.out.println(header.getText());
        String actualHeader = header.getText().trim();
        String expectedHeader = "Techtorial Academy";
        if (actualHeader.equals(expectedHeader)){
            System.out.println("Your header is passed");
        }else {
            System.out.println("Your header is failed");
        }

        WebElement header1 = driver.findElement(By.id("details2"));
        System.out.println(header1.getText());

        // LOCATOR: NAME
       WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.sendKeys("Stiopa");

        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.sendKeys("Pastukh");

        WebElement email = driver.findElement(By.name("userName"));
        email.sendKeys("stiop.pas@gmail.com");


        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("937-99-92");

        WebElement adress = driver.findElement(By.name("address1"));
        adress.sendKeys("391 h ave");

        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("Chicago");

        WebElement state = driver.findElement(By.name("state"));
        state.sendKeys("IL");

        WebElement postalCode = driver.findElement(By.name("postalCode"));
        postalCode.sendKeys("60634");

        WebElement userName = driver.findElement(By.name("email"));
        userName.sendKeys("Bars");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("123");

        WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
        confirmPassword.sendKeys("123");



        // CLASS LOCATOR:

        WebElement checkboxes = driver.findElement(By.className("checkboxes"));
        System.out.println(checkboxes.getText());

        WebElement javaBox = driver.findElement(By.id("cond1"));
        if (javaBox.isDisplayed()){
            javaBox.click();
        }

        WebElement seleniumBox = driver.findElement(By.id("cond2"));
        System.out.println(seleniumBox.isDisplayed()); // true
        System.out.println(seleniumBox.isSelected()); // true
        seleniumBox.click();
        System.out.println(seleniumBox.isSelected()); // false


        //LOCATOR: TagName
        WebElement javaVersion = driver.findElement(By.tagName("u"));
        String actualVersion = javaVersion.getText().trim();
        String expectedVersion = "Use Java Version";
        if (actualVersion.equals(expectedVersion)){
            System.out.println("The version is correct");
        }else {
            System.out.println("The version is Not correct");
        }
    }
}
