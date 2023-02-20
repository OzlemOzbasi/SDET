package Gun08;        //  21.07.2022  ---  Ders Kaydı

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionsTusKontrolSendKeys extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/auto-complete");

        WebElement element = driver.findElement(By.id("autoCompleteSingleInput"));

        Actions aksiyonlar = new Actions(driver);

        Action aksiyon = aksiyonlar
                .moveToElement(element)   //  kutucuga gittim
                .click()                  //  içine tıklattım
                .keyDown(Keys.SHIFT)      //  SHIFT tusuna bastım
                .sendKeys("a")            //  kucuk a harfini gönderdim, fakat SHIFT basılı oldugu ıcın A görülmeli
                .keyUp(Keys.SHIFT)        //  SHIFT tusundan elımızı kaldırıyoruz
                .sendKeys("hmet")         //  kalanı küçük harf.
                .build();                 //  komutu hazırla demıs oluyoruz


        Bekle(2);

        aksiyon.perform();




        Bekle(3);
        BekleKapat();

    }
}
