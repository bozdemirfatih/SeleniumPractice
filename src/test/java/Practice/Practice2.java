package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.otto.de");

        // web sayfasinin sayfa url sini ve titile ini alalim
        String actOttoTitle = driver.getTitle();
        System.out.println("actotitle= " + actOttoTitle);

        String OttoUrl = driver.getCurrentUrl();
        System.out.println("actOttoUrl" + OttoUrl);

        /*
        tittle ve urlnin otto kelimesinin icerip icermedigini kontorl et
        wisequarter.com a git
        onceki web sayfasina geri don
        sayfayi yenile
        tekrar don ve son adimda hepsini kapat

         */
            if
            (actOttoTitle.contains("OTTO"))
        System.out.println("title test passed");
            else
            System.out.println(" title test failed");


        if
        (OttoUrl.contains("OTTO"))
            System.out.println("url test passed");
        else
            System.out.println("url test failed");

        driver.navigate().to("https://wisequarter.com");

        boolean isTrue = driver.getTitle().contains("Quarter");

            if (isTrue)
                System.out.println("wise quarter passed");
            else
                System.out.println("wise quarter title failed");

            String WiseUrl = driver.getCurrentUrl();
        System.out.println(WiseUrl.contains("quarter")? "WQ URL TEST PASSED" : "WQ URL TEST FAILED");

            String Wisetitle = driver.getTitle();
        System.out.println(Wisetitle.contains("Quarter")? "WQ TITLE TEST PASSED" : "WQ TITLE TEST FAILED");


            driver.navigate().back();
            driver.navigate().refresh();



        driver.quit();


    }

}
