package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice9 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://zero.webappsecurity.com");

        driver.findElement(By.id("signin_button")).click();
       WebElement username=  driver.findElement(By.id("user_login"));
       username.sendKeys("username");

        WebElement password=  driver.findElement(By.id("user_password"));
        password.sendKeys("password"+ Keys.ENTER);

        driver.navigate().back();
        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
        driver.findElement(By.xpath("//span[text()='Pay Bills']")).click();

        //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        WebElement amauntKutusu= driver.findElement(By.id("sp_amount"));
        amauntKutusu.sendKeys("100");
        Thread.sleep(1000);

        //8. tarih kismina “2021-10-10” yazdirin\
        WebElement tarihKutusu= driver.findElement(By.id("sp_date"));
        tarihKutusu.sendKeys("2021-10-10");
        Thread.sleep(1000);

        //9. Pay buttonuna tiklayin
        WebElement payButonu= driver.findElement(By.id("pay_saved_payees"));
        payButonu.click();

        //10. “The payment was successfully submitted.” mesajinin ciktigini test edin
        WebElement basariliYazisiElementi= driver.findElement(By.id("alert_content"));
        String actualYazi=basariliYazisiElementi.getText();
        String beklenenYazi = "The payment was successfully submitted.";

        if (beklenenYazi.equals(actualYazi)) System.out.println("test PASSEd");
        else System.out.println("test not PASSED");

        driver.close();



    }

}
