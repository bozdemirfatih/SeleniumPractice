package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.WatchEvent;
import java.time.Duration;
import java.util.List;

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

        aramakutusuelementi.sendKeys("apple airpods"+ Keys.ENTER);



        // bulunan sonuc sayisi
      WebElement bulunanSonucSayisi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small'][1]"));

        System.out.println( bulunanSonucSayisi.getText());
        //1-16 von 41 Ergebnissen oder Vorschlägen für "apple airpods
        String sonucSayisi=bulunanSonucSayisi.getText();

        sonucSayisi=sonucSayisi.substring(
                ( sonucSayisi.indexOf("von")+4) ,
                ( sonucSayisi.indexOf("Ergebnissen")-1)
        );

        System.out.println(sonucSayisi);
        //sonuc sayisinin 100 den fazla oldugunu test edin
        if (Integer.parseInt(sonucSayisi)>100){
            System.out.println("sonuc sayisi 100'den fazla test PASSED");
        } else {
            System.out.println("sonuc sayisi 100'den fazla degil, test FAILED");
        }




        WebElement ilkurunelementi = driver.findElement(By.xpath("//img[@class='s-image'][1]"));
        ilkurunelementi.click();

        driver.navigate().back();
        // tum sayfadaki basliklari yazdiralim
        List <WebElement> baslikElementleriList=driver.findElements(By.xpath("//span[@class='a-size-base a-color-base']"));

        for (WebElement eachelement: baslikElementleriList) {
            System.out.println(eachelement.getText());

        }
        driver.close();







    }
}
