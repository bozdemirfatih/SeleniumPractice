package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverGetMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver");

        WebDriver driver = new ChromeDriver();

        System.out.println(driver.getWindowHandles());

        /*
        birdem fazla pencere acilirsa acilan tum pencerelerin degerlerini bir set olarak dondurur

        windowlar arasi gecisi bu handle degerleri ile yapariz

         */

        driver.get("https:/www.amazon.com");

        System.out.println(driver.getPageSource());
        driver.close();



    }
}
