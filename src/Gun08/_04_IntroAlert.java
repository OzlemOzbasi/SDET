package Gun08;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
      Interview Sorusu :

      - Alertleri nasıl kullanırsın ?
      driver.switch().alert()    bununla kullanırım.

      Komutları;
      accept   -->  OK, TAMAM butonuna basmamızı sağlıyor.
      dismiss  -->  CANCEL, HAYIR yani olumsuz butonuna basmamızı sağlıyor.
      gettext  -->  Alertin mesajını alıyoruz.
      SendKeys -->  prompt (Alertin giriş kutusu olan hali) , yazı gönderiyoruz.

 */

public class _04_IntroAlert extends BaseStaticDriver{      //  Alert ---  uyarı demek , net sayfasından ayrı cıkana kucuk uyarı kutucukları
    public static void main(String[] args) {

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe1 = driver.findElement( By.cssSelector("[class='btn btn-default']"));
        clickMe1.click();

        Bekle(2);
        driver.switchTo().alert().accept();  // Alert kutucuğuna geçildi ve TAMAM butonun basıldı.

        Bekle(2);

        // alerti kapattığında ilk acmıs oldugun web sayfasına geri dönmüş oluyorsun.




        BekleKapat();

    }
}
