package day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_exercise {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");

        driver.navigate().refresh();

        String actualTitle= driver.getTitle();
        String arananMetin= "SpendLess";
        if (actualTitle.contains(arananMetin)){
            System.out.println("aranan metin iceriyor test passed");
        }else {
            System.out.println("aranan metin icermiyor test failed");
        }
        //6- Gift Cards sekmesine basin
        driver.findElement(By.linkText("Gift Cards")).click();
        //7- Birthday butonuna basin
        driver.findElement(By.xpath("//img[@alt='Birthday gift cards']")).click();
        //8- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[1]")).click();
        //9- Gift card details’den 25 $’i  secin
        driver.findElement(By.xpath("//button[@value='25']")).click();
        //10-Urun ucretinin $25.00 oldugunu test edin
        WebElement ucretElementi= driver.findElement(By.xpath("//span[@class='a-color-price a-text-bold']"));
        String actualUcretStr= ucretElementi.getText();
        String expectedUcretStr="$25.00";

        if (actualUcretStr.equals(expectedUcretStr)){
            System.out.println("Gift card testi PASSED");
        }else{
            System.out.println("Gift card fiyati farkli, test FAILED");
        }

        //11-Sayfayi kapatin


    }
}
