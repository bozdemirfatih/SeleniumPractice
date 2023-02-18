package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice5 {
    /*
    navigate to web site https://testpages.herokuapp.com/styled/index.html
    under the original contents
    click on alerts
    print url
    navigate back
    print the url
    click on basic ajax
    print url
    enter value 20 enter
    and then verify sbmitted values is displayed open page
    close driver
     */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.xpath("//a[@id='alert']")).click();
        //System.out.println(driver.getCurrentUrl());
        String UrlAlert = driver.getCurrentUrl();
        System.out.println("Alert URL :" + UrlAlert);
        //System.out.println(driver.getCurrentUrl());

        driver.navigate().back();
        String Url2 = driver.getCurrentUrl();
        System.out.println("url2= "+ Url2);
        //System.out.println(driver.getCurrentUrl());

        driver.findElement(By.xpath("//a[@id='basicajax']")).click();
        String Url3 = driver.getCurrentUrl();
        System.out.println("url3= "+ Url3);
        //System.out.println(driver.getCurrentUrl());

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("20" + Keys.ENTER);
           String expectedText = "Submitted Values";
           String actualText = driver.findElement(By.xpath("//p[text()='Submitted Values']")).getText();

           if (expectedText.equals(actualText)) System.out.println("Test Passed");
           else System.out.println("Test Failed");

        //input[@type='text']



        Thread.sleep(5000);
        driver.quit();

    }
}
