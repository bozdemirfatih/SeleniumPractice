package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice3 {
    public static void main(String[] args) throws InterruptedException {

        /*
        go to url https://www.techlistic.com/p/selenium-practice-form.html
        fill the first name
        fill the last nae
        ceck gender
        check the expreience
        fill the date
        choose yoru profession autamation tester
        choose your tool
        choose your continent
        choose your command
        click submit button
         */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        driver.findElement(By.name("firstname")).sendKeys("Fatih");
        driver.findElement(By.name("lastname")).sendKeys("Bozdemir");

        driver.manage().deleteAllCookies();
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='ez-accept-all']")).click();
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//span [@class='ezmob-footer-close']")).click();
        //Thread.sleep(3000);

        driver.findElement(By.xpath("//a[@id='cookieChoiceDismiss']")).click();

        WebElement genderRadioButton = driver.findElement(By.id("sex-0"));
        genderRadioButton.click();
        genderRadioButton.sendKeys(Keys.PAGE_DOWN);

        driver.findElement(By.id("exp-0")).click();
        driver.findElement(By.id("datepicker")).sendKeys("21.07.1988");

                driver.findElement(By.id("profession-1")).click();
                driver.findElement(By.xpath("//input[@id='tool-2']")).click();

                driver.findElement(By.xpath("//select[@class='input-xlarge']"))
                        .sendKeys("Europe" + Keys.ENTER+Keys.ENTER);


            //driver.findElement(By.id("continents")).click();

            //WebElement dropdown = driver.findElement(By.id("continents"));
        //dropdown.findElement(By.xpath("//option[. = 'Europe']")).click();

        //driver.findElement(By.xpath("//select[@class='selenium_commands']"))
        //.sendKeys("Browser Commands" + Keys.ENTER+Keys.ENTER);

        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();

        Thread.sleep(3);
        driver.quit();









        Thread.sleep(7000);


       // driver.findElement(By.name("controlgroup")).click();




       // driver.quit();




    }
}
