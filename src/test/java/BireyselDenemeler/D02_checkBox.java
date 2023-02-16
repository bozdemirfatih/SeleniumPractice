package BireyselDenemeler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D02_checkBox {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");

        String homeCheckBoxCssValue = "label[for='tree-node-home'] span.rct-checkbox svg";

        WebElement homeCheckBox =driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));
        homeCheckBox.click();


        homeCheckBox = driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));

        String homeCheckBoxClassName = homeCheckBox.getAttribute("class");



        if (homeCheckBoxClassName.equals("rct-icon rct-icon-check")){
            System.out.println("checkbox is chechked");

        }else {
            System.out.println("unchecked");

        }

    }
}
