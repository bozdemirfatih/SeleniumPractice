package day03_webElements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_LocatorTest {
    public static void main(String[] args) {
        /*
        main maethot olusturun
        web saygfasina gidin
        searc ara
        city bike


         */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement searchButton = driver.findElement(By.id("twotabsearchtextbox"));
        searchButton.click();
        searchButton.sendKeys("city bike" + Keys.ENTER);
        //searchButton.submit(); bu sekilde de tiklanabilir

        //amazonde goruntulenen ilgili sonuclarin sayisini yazdirin
        List<WebElement> sonucWebElementList = driver.findElements(By.className("sg-col-inner"));
        System.out.println(sonucWebElementList.get(0).getText());

        System.out.println(sonucWebElementList.size());

        //bu listenin 1. elementi bulunan sonuc girisi

        //sonra karsiniza cikan ilk sonucun resmine tiklayin
        driver.findElement(By.className("s-image")).click();

        /*
        eger bir locate ile birden fazla element bulunuyorsa
        selenium ilk elementi kullanir
         */



        driver.close();




    }

}
