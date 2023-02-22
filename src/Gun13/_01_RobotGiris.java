package Gun13;     //  28.07.2022  ---  Ders Kaydı

/*
     İnterview Soruları :
     1- Windows popupları nasıl kontrol edersiniz ? Robot class la
     2- Dosya yükleme işlemini ne ile yaparsınız ? Robot class la
 */


import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _01_RobotGiris extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {

        driver.get("http://demo.guru99.com/test/upload/");

        // TODO: frame gözükene kadar bekle eklenecek
        // TODO: frame in varlığı kontrol edilip var ise veya yok ise her iki duruma göre çözüm yapılacak

        Bekle(3);

        /*

        //  Hocanın ekranında sayfa acılırken acceptall sayfası cıktıgı ıcın asagıdakılerı onu kapatmak ıcın yazmıs

        driver.switchTo().frame(8);  //"gdpr-consent-notice"
        WebElement acceptAll = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Accept All']")));
        //WebElement acceptAll = driver.findElement(By.xpath("//span[text()='Accept All']"));
        acceptAll.click();
        driver.switchTo().defaultContent();

        */

        Robot  rbt = new Robot();

        for (int i = 0; i < 21; i++) {     // 21 cisi yanı sayfadakı dosya sec e tıklatmaya calıstık klavye ıle

            rbt.keyPress(KeyEvent.VK_TAB);     //  Press   ---  tuşa basıldı    down
            rbt.keyRelease(KeyEvent.VK_TAB);   //  Release ---  tuş bırakıldı   up
            Bekle(1);

        }

        //  Press yaptıgımız her tusu sonrasında   Release  yapmamız gerekıyor
        rbt.keyPress(KeyEvent.VK_ENTER);   //  Press   ---  tuşa basıldı    down
        rbt.keyRelease(KeyEvent.VK_ENTER); //  Release ---  tuş bırakıldı   up


                              /*   DOSYA SECIP YAPISTIRMA  -------------------------   */


        // Bu ornegı yapmak ıcın Masaustune   ornek.txt  adında text dosyası acmıstım  --- sonra sıldım -- ornegı tekrar etmek ıstersen once text ac

        // Stringi hafızaya-clipboard a kopyalama kodu  --- BURASI  Ctrl+C  "C:\Users\User\OneDrive\Masaüstü\ornek.txt"   İŞİNİ YAPTI

        StringSelection stringSelection = new StringSelection("C:\\Users\\User\\OneDrive\\Masaüstü\\ornek.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection , null);
        // Verilen stringi clipboard a set ediyor.

        Bekle(1);
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);         // bu iki tuş şu anda basılmış vaziyette, hafızadaki yapıştırıldı


        Bekle(1);
        rbt.keyRelease(KeyEvent.VK_CONTROL);  // tuşlar serbest bırakıldı
        rbt.keyRelease(KeyEvent.VK_V);


                     /*     DOSYADAN SONRA EKRANDAKI AÇ TUSUNA BASMA  -------------------------   */

        for (int i = 0; i < 2; i++) {     // 2 cisi yanı sayfadakı AÇ a tıklatmaya calıstık klavye ıle   // 2 kere tab ile OPEN butonuna ulaştık

            rbt.keyPress(KeyEvent.VK_TAB);     //  Press   ---  tuşa basıldı    down
            rbt.keyRelease(KeyEvent.VK_TAB);   //  Release ---  tuş bırakıldı   up
            Bekle(1);

        }

        rbt.keyPress(KeyEvent.VK_ENTER);   //  Press   ---  tuşa basıldı    down       // ENTER  a   bastık açılan pencere kapandı
        rbt.keyRelease(KeyEvent.VK_ENTER); //  Release ---  tuş bırakıldı   up



        /*     SUBMİT FİLE  elementıne a tıkladık  -------------------------   */

        WebElement submitButton = driver.findElement(By.id("submitbutton"));
        submitButton.click();



        /*     SUBMİT FİLE  dan sonra basarılı sekılde yuklendı ekranı DOGRULAMASI yapıldı  -------------   */

        WebElement dogrulama = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));
        Assert.assertTrue( dogrulama.getText().contains("has been successfully uploaded.") );



        // Alttakıde dogrulamanın 2.yolu hatta garantı yolu cunku sayfanın tamanında var mı dıye aratmıs    :)))

    //   Assert.assertTrue(driver.getPageSource().contains("has been successfully uploaded."));



        BekleKapat();
    }
}
