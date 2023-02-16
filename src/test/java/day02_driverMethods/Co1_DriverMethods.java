package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Co1_DriverMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        driver.manage().window().maximize();

        //eger kodlarimizi belirli sure bekletmek istersek

        Thread.sleep(5000);
        System.out.println("sayfa urlsi   " + driver.getCurrentUrl());

        System.out.println("Sayfanin title i  " + driver.getTitle());

        driver.close();

    }
}
