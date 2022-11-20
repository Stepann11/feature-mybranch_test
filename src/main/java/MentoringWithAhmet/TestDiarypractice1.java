package MentoringWithAhmet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestDiarypractice1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("http://www.testdiary.com/training/selenium/selenium-test-page/");

        WebElement title = driver.findElement(By.xpath("//h1[@class='title']"));
        System.out.println(title.getText().trim());

        WebElement paragraph = driver.findElement(By.xpath("//p//strong"));
        System.out.println(paragraph.getText().trim());

        WebElement box = driver.findElement(By.xpath("//input[@id='seleniumbox']"));
        if (box.isDisplayed()){
            box.click();

        WebElement box1 = driver.findElement(By.xpath("//input[@id='java1']"));
        if (box1.isDisplayed()){
            box1.click();

        WebElement save = driver.findElement(By.xpath("//button[@id='demo']"));
        save.click();
        }

            /*
TASK 2:HyperLink Task:
1-Click the Test Dairy link with linktext
2-print out the header,title and currentUrl of Test Dairy from opening page
3-Navigate back to main page
4-Click Test Diary Selenium learning with PartialLinkText
5-print out the header,title and currentUrl of Test Dairy from opening page
 */

        WebElement testDairy = driver.findElement(By.linkText("Test Diary"));
        testDairy.click();

        WebElement headerTest = driver.findElement(By.xpath("//h1"));
            System.out.println(headerTest.getText().trim());
            System.out.println(driver.getTitle().trim());
            System.out.println(driver.getCurrentUrl().trim());
            driver.navigate().back();

         WebElement dairySelenium = driver.findElement(By.partialLinkText("Selenium Learning"));
         dairySelenium.click();
         WebElement headerDiarySelenium = driver.findElement(By.tagName("h1"));
            System.out.println(headerDiarySelenium.getText().trim());
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());
            driver.navigate().back();

            /*
TASK 3:Contact Form
1-Fill the all the boxes (yourname,youremail,subject and your message)
2-Click save button
3-Validate (IF CONDITION) message "Your message was sent successfully.Thanks."
 */

            WebElement userName = driver.findElement(By.name("your-name"));
            userName.sendKeys("Ahmet");
            WebElement email = driver.findElement(By.name("your-email"));
            email.sendKeys("ahmet@gmail.com");
            WebElement subject = driver. findElement(By.xpath("//input[@name='your-subject']"));
            subject.sendKeys("Information Technology");
            WebElement textArea=driver.findElement(By.name("your-message"));
            textArea.sendKeys("Hello from Outside -->Adele");
            WebElement sendButton=driver.findElement(By.xpath("//input[@value='Send']"));
            sendButton.click();
            WebElement message=driver.findElement(By.xpath("//div[@style='display: block;']"));
            String actualMessage=message.getText().trim();
            String expectedMessage="Your message was sent successfully. Thanks.";
            if(actualMessage.equals(expectedMessage)){
                System.out.println("your message is correct");
            }else{
                System.out.println("your message is incorrect");
            }
        }
    }

}



    /*
NOTE:You can use any locator you want(id,classname,xpath,tagname....)
TASK 1:
1-Navigate to the website http://www.testdiary.com/training/selenium/selenium-test-page/
2-print out selenium test page from website
3-print out the paragraph from the  page
4-Check the selenium box is displayed or not, if it is displayed and not selected then click
5-Click java radio button
6-Click Save
 */

      /*
TASK 2:HyperLink Task:
1-Click the Test Dairy link with linktext
2-print out the header,title and currentUrl of Test Dairy from opening page
3-Navigate back to main page
4-Click Test Diary Selenium learning with PartialLinkText
5-print out the header,title and currentUrl of Test Dairy from opening page
 */

/*
TASK 3:Contact Form
1-Fill the all the boxes (yourname,youremail,subject and your message)
2-Click save button
3-Validate (IF CONDITION) message "Your message was sent successfully.Thanks."
 */

