package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice4 {
    /*
    go https://testpages.herokuapp.com/styled/index.html
    click on calculator
    type any number2
    click on calculate
    get result
    print result
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver");
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.manage().deleteAllCookies();
        WebElement Calculator = driver.findElement(By.xpath("//a[@id='calculatetest']"));
        Calculator.click();
       // Calculator.sendKeys(Keys.PAGE_DOWN);


        driver.findElement(By.xpath("//input[@id='number1']")).sendKeys("2");
        driver.findElement(By.xpath("//input[@id='number2']")).sendKeys("45");

        driver.findElement(By.id("function")).click();
        WebElement dropdown = driver.findElement(By.id("function"));
        dropdown.findElement(By.xpath("//option[@value='times']")).click();

        driver.findElement(By.id("calculate")).click();


   WebElement AnswerElementi = driver.findElement((By.xpath("//span[@id='answer']")));
        System.out.println("sonuc :" + AnswerElementi.getText());

        //System.out.println("tag name " + Answer);
    //if (Answer.equals("90"));
       // System.out.println("ok");*/








    }
}
