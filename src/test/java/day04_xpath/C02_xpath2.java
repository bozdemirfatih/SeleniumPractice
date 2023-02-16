package day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_xpath2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //1 https://the-internet.herokuapp.com/add_remove_elements/ e git
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

      //  2- add element tusuna bas
        WebElement addElement = driver.findElement(By.tagName("button"));
        addElement.click();




        // 3 delete bitonunu GÖRÜNÜR oldugunu test et

        WebElement DeleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));

        System.out.println(DeleteButton.isDisplayed());


        // 4 delete tusuna bas
        DeleteButton.click();

        // 5 add/remove elements yazisinin gorunur oldugunu test et
        WebElement AddRemove = driver.findElement(By.xpath("//h3"));
        if (AddRemove.isDisplayed()){
            System.out.println("Add Remove yazisi gorunur TEST PASSED");
        }else{
            System.out.println("add remove yazisi gorunmuyor test not passed");
        }

        System.out.println(AddRemove.isDisplayed());


        Thread.sleep(6000);
        driver.close();
    }
}
