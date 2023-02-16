package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ilkTest {

    public static void main(String[] args) {
      /*
      Gerekli ayarlamali yapip amazon anasayfaya gidin
      sayfa baligi amazon kelimesi icermeli
      sayfa url sinde amazon kelimesi olmali
       */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        driver.manage().window().maximize();

        String expectedTitleIcerik="amazon";
        String expectedUrlIcerik = "Amazon";

        String actualUrl= driver.getCurrentUrl();
        String actualTitle= driver.getTitle();

        //testi yapiyoruz

        if(actualUrl.contains(expectedUrlIcerik)) {
            System.out.println("url test passed");
        } else {

            System.out.println( "url test failed");
            System.out.println( " actual url: " +  actualUrl);
            System.out.println("actual url aranan " +  expectedUrlIcerik + " kelimesini icermiyor");

        }

         if (actualTitle.contains(expectedUrlIcerik)){
             System.out.println("tittle test passed");


         }else {
             System.out.println("title test failed");
             System.out.println("actual title" + actualTitle);
             System.out.println("actual title aranan " +  expectedTitleIcerik + " kelimesini icermiyor");
         }

         driver.quit();

         /*
         dricer-close sadece acik olani kapatir
         driver.quit test acilan tum browseerlari kapatir
          */

    }


}
