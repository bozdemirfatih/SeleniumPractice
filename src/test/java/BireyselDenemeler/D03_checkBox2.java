package BireyselDenemeler;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D03_checkBox2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        WebElement sportCheckBox = driver.findElement(By.id("hobbies-checkbox-1"));
        boolean isEnabled = sportCheckBox.isEnabled();
        System.out.println(isEnabled);  // elementin tiklanabilirligini olctuk

        WebElement sportCheckboxLabel = driver.findElement(new By.ByCssSelector("label[for='hobbies-checkbox-1'"));

        try {
            sportCheckBox.click();

        } catch (ElementClickInterceptedException e) {
            sportCheckboxLabel.click();
            System.out.println("entered chheck");

        }


    }
}
