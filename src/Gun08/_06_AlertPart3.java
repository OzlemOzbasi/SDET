package Gun08;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_AlertPart3 extends BaseStaticDriver {
    public static void main(String[] args) {


        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");


        Bekle(2);
        WebElement clickMe3 = driver.findElement(By.cssSelector("[onclick='myPromptFunction()']"));
        clickMe3.click();

        Bekle(2);
        System.out.println(driver.switchTo().alert().getText());     //  Alert in TEXT i alındı     yani   "Please enter your name"   bunu
        driver.switchTo().alert().sendKeys("Deniz");       //  Alert kutucuguna gecildi ve text gönderildi
        driver.switchTo().alert().accept();                          //  Ok butonuna basildi
        Bekle(2);



        WebElement txtActual = driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue(txtActual.getText().contains("Deniz"));




        BekleKapat();

    }
}
