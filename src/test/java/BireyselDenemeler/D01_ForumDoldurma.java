package BireyselDenemeler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D01_ForumDoldurma {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement nameElement = driver.findElement(By.id("userName"));
        nameElement.click();
        nameElement.sendKeys("Ipek");

        WebElement element2 = driver.findElement(By.id("userEmail"));
        element2.click();
        element2.sendKeys("mailimitabikivermem@gmail.com");

        WebElement adress = driver.findElement(new By.ByCssSelector(".form-control[placeholder='Current Address']"));
        adress.click();
        adress.sendKeys("ortanca mahallesi");


        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.click();
        permanentAddress.sendKeys("karacaoglan mahallesi");


        WebElement submit = driver.findElement(new By.ByCssSelector("button.btn"));
        submit.click();
    }
}