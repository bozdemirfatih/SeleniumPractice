package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        //interfaceden obje olusturulmaz.cünkü conslari yok
        // interfacelerde construktur bulunmaz bu sebeple obje olusturulmaz
        // bu sebeple baska bir construktar

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //selenium kutuphanesinden gelir
        //5 saniye boyunca yapmaya calis yaparsan devam ed

       Thread.sleep(1000);
        // java kutuphanesinden gelir
        driver.get("https://www.google.com");
        Thread.sleep(1000);
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        System.out.println("ok olmustur");

        driver.quit();
    }
}
