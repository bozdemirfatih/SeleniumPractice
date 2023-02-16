package day03_webElements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_WebELementMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");

        WebElement searchButtonn = driver.findElement(By.id("twotabsearchtextbox"));
        searchButtonn.sendKeys("nutella");
        searchButtonn.clear();
        searchButtonn.sendKeys("elma");
        System.out.println(searchButtonn.getTagName());

        System.out.println(searchButtonn.getAttribute("name"));
        System.out.println(searchButtonn.getRect().getX());

        System.out.println(searchButtonn.isDisplayed());

        System.out.println(searchButtonn.isEnabled());

        System.out.println(searchButtonn.isSelected());


        driver.close();
    }

}
