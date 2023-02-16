package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_DriverManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*

        Implicitly wait ilerde daha genis ele alinacak
        her classin basina konulacak dendi,.
        droverin girdigi elementleri bulabilmesi icin kedinsine verdigimiz arastirma suresidir o sure icinde
        aradigi elementi bulamazsa hata verir.

         */

        driver.manage().window().fullscreen();

        System.out.println("full screen pos " + driver.manage().window().getPosition());

        System.out.println("full screen size " +driver.manage().window().getSize());

        Thread.sleep(2000);

        driver.manage().window().maximize();

        System.out.println("fmax pos "+ driver.manage().window().getPosition());

        System.out.println("max size "+ driver.manage().window().getSize());

        Thread.sleep(2000);

        driver.manage().window().minimize();

        System.out.println("min pos "+ driver.manage().window().getPosition());

        System.out.println(" min size "+ driver.manage().window().getSize());

        driver.manage().window().maximize();


        driver.close();


    }
}
