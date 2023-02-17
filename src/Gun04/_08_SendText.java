package Gun04;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _08_SendText extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");


     //   WebElement element = driver.findElement( By.partialLinkText("thanks"));
      //  element.click();           // hoca dersı anlatırken    no,thanks   ekranı  cıkıyordu tekrar yaparke cıkmadıgı ıcın kapattım


        WebElement txtBox = driver.findElement( By.id("user-message"));
        txtBox.sendKeys("merhaba selenium");


        WebElement btn = driver.findElement( By.className("btn-default"));
        btn.click();



        WebElement msg = driver.findElement( By.id("display"));

        if (msg.getText().contains("merhaba selenium"))
            System.out.println("test passed");
        else
            System.out.println("test failed");




        BekleKapat();


    }
}
