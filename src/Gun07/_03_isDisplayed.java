package Gun07;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_isDisplayed extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.facebook.com/");


//        Bekle(2);    ilk yapıldıgı zaman bu cookıes ekranı cıkıyormus ama ben yaparken cıkmadı o yuzden yoruma aldım
//
//        WebElement cookiesAccept = driver.findElement(By.xpath("//*[text()='Allow essential and optional cookies']"));
//        cookiesAccept.click();

        Bekle(2);
        WebElement btnYeniHesap = driver.findElement(By.cssSelector("[id^='u_0_0_']"));
        btnYeniHesap.click();

        Bekle(2);
        WebElement txtIsim = driver.findElement(By.name("firstname"));
        txtIsim.sendKeys("Deniz");

        Bekle(2);
        WebElement txtSoyisim = driver.findElement(By.name("lastname"));
        txtSoyisim.sendKeys("Kaynak");


        //  Alt kısımda emaili tekrar girin kısmı Assert ıle emaıl gırmeden once gozukup gozukmedıgını dogruluyoruz
        // Mail ilk kez tamamı yazıldıktan sonra bu emaılı tekrar gırın satırı acılıyor
        // Bu alt kısmı sadece kontrol etmek ıcın yaptık , bırsey gondermedık
        WebElement reEmail = driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse(reEmail.isDisplayed());    // içindeki false ise sıkıntı yok olmasını ıstedıgımız sey,
                                                     // assertFalse  ile false bekledıgımızı soyluyoruz
/*
    Yukarıda Asseert ıle yaptıgımız aslında asagıda yazdıgımız if ıle yapılanla aynı sey
         if ( reEmail.isDisplayed() == true )
             System.out.println("Hatalı gösterim");

  */

        //   Burada da emaılı ılk gırdıgımız satırın yazılısı
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("deniz@hotmail.com");

        Assert.assertTrue(reEmail.isDisplayed());    // Bu sefer true olmasını beklıyorum o yuzden  assertTrue yazdık, bekledıgımız seyı yazıyoruz




        BekleKapat();
    }
}
