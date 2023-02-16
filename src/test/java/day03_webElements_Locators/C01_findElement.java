package day03_webElements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_findElement {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://wwww.amazon.com");

        WebElement searchButton = driver.findElement(By.id("twotabsearchtextbox"));
        searchButton.click();
        searchButton.sendKeys("Nutella" + Keys.ENTER);

        //WebElement search = driver.findElement(By.id("nav-search-submit-button"));
        //search.click();   ister burdan ister enterla yap

        Thread.sleep(5000);

        driver.close();

                    /*
                    Seleniumda 8 adet locator vardir- Bunlardan 6 tanesi html uzerindeki tag veya attributelere
                    goredir
                    2 tanesi ise daha spesifik olarak, ilk 6 tane locator ile bulamadigimiz
                    webelementleri locate etmek icin kullanilir.
                    1- by.id id genelde unique verilir
                    dolayisiyla bir html elementde id varsa once by id denenebilir.

                    2-className
                    bu attribute genelde ayni islemi yapan weblementleri gruplandirmak icin kullanilir.
                    class attribute"u kullanilirken eger class attributeu bosluk iceriyorsa classname
                    ile yapilan locateler hata verebilir.

                    3- name
                    eger HTML kodunda name attribute varsa kullanilabilir.

                    4- tagname
                    taneme de classname gibi grublandirmalar icin kullanilir
                    dolayisiyla tagname ile genelde bir element degil benzer oyelliklerdeki
                    bir listeye ulasilir.

                    5- linkText
                         sadece linkler icin kullanilir
                         her link html elementinin bir link yazisi olur
                         bu yazi genelde kulllanicinin front end gordugu yazi iiile aynidir
                         ancak bazen space gibi farkedemeyecegimiz eklemeler olabilir
                         locate ederken lintext kullanlirsa link yazisinin tamami kullanilmalidir.

                    6- partiallinktext
                        linktext gibi sadece linkler icin kullanilir lintexteten farki
                        tum yaziyi degil parcasini kullanmamizi saglar.





                     */





    }
}
