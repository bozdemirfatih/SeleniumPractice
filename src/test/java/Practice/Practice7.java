package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.WatchEvent;
import java.time.Duration;

public class Practice7 {
    public static void main(String[] args) {
     /*
     amazona git
     aramayi locate et
     airpods ara
     ilk ürüne tikla
     tüm basliklari yazdir

      */

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.de");

        driver.findElement(By.xpath("//span[@class='a-button a-button-primary']")).click();
        WebElement aramakutusuelementi = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        aramakutusuelementi.sendKeys("apple airpots"+ Keys.ENTER);



        // bulunan sonuc sayisi
      WebElement bulunanSonucSayisi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small'][1]"));

        System.out.println( bulunanSonucSayisi);
        //1-16 von 41 Ergebnissen oder Vorschlägen für "apple airpods
        String sonucSayisi=bulunanSonucSayisi.getText();

        sonucSayisi=sonucSayisi.substring(
                ( sonucSayisi.indexOf("von")+3) ,
                ( sonucSayisi.indexOf("oder")-1)
        );
        System.out.println(sonucSayisi);




        WebElement ilkurunelementi = driver.findElement(By.xpath("//img[@class='s-image'][1]"));
        ilkurunelementi.click();






    }
}
