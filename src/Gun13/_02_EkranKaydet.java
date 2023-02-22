package Gun13;

import Utils.BaseStaticDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _02_EkranKaydet extends BaseStaticDriver {
    public static void main(String[] args) throws IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Deniz");
        Bekle(3);
        WebElement password  =driver.findElement(By.name("password"));
        password.sendKeys("mmmmm");
        WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
        btnLogin.click();

        // hata verdıgınde cıkan yazıyı her halde alsın dıye heosınde arıyoruz o yuzden LIST ile aradık
        List<WebElement> spanMessage = driver.findElements(By.xpath("//*[@class='oxd-text oxd-text--p oxd-alert-content-text']"));

        if (spanMessage.size() > 0 ){   // login olamadın  ---  dıye ekranda cıkan hata ekran görüntüsünü saklayalım
            // Hata ekranının ScreenShot ını alalım
            System.out.println("Login olamadı. Hata mesajı gözüktü");


            //  Ekran görüntüsü alalım
            // JavascriptExecutor   da yaptıgımız gıbı altta dönüştürme yaptık
    TakesScreenshot ts = (TakesScreenshot) driver;              // 1.Aşama --- Ekran görüntüsü alma değişkenini tanımladım
    File hafizadakiHali = ts.getScreenshotAs(OutputType.FILE);  // 2.Aşama --- Saklama tipi seçildi (Dosya yani FILE ), data(Veritabanında saklama) (Byte)
     //  ust kısımda resım su an ram de yanı hafızada


            // hafizadakiHali  --> dosya olarak(jpg,png,bmp) kaydedeceğiz.  Alt kısımda bunu yapıyoruz
            // FileUtils  --- bununla ılgılı jar dosyasını Maven dan ındırıp lıbrary e ekledık Selenıumu ekler gıbı

            FileUtils.copyFile(hafizadakiHali, new File("ekranGoruntuleri/LoginKontrol.png"));

            // hafızadaki ekranDosyasi nı al bunu verdiğim yola ve isme kaydet.  --- demiş olduk üst tarafta
            // jpg,bmp,gif ...

        }




        BekleKapat();

    }
}


// TODO : Ödev: buradaki dosya adını zamana bağlı hale getiriniz ki hep üstüne kaydetmesin

//  mesala 20210526111201.jpg  gibi ...

//  sistemden tarihi okuyabiliyormuyduk
//  yılaygunsaatdaksan
