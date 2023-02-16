package day04_xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_xpath {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");

        /*
           su ana kadar ogrendigimiz 6 adet locator HTML koduna baglidir.
        xpath ve cssSelector sadece bir attribute veya tage baimli olmadan her web eleenti locate etmemizi saglar

        her html element"de
        1- tag
        2- attribute
        3- attribute value

        xpath ve cssselector bu 3 maddenin kombinasyonundan olusur
        //tagIsmi[@attributeismi='isim']

         */
    }
}
