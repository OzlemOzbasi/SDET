package Gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionsClickTest extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/buttons");

        WebElement element = driver.findElement(By.xpath("//button[text()='Click Me']"));
        Bekle(2);

        Actions aksiyonlar = new Actions(driver);
        System.out.println("Aksiyon öncesi Aksiyonlar sınıfı oluşturuldu");


        Bekle(2);
        Action aksiyon = aksiyonlar.moveToElement(element).click().build();  //element in üzerine git CLICK ı hazırla , BUİLD İLE HAZIRLA DEMIS OLDUK
        System.out.println("Aksiyon hazırlandı.");                        //  moveToElement  İLE SOYLENEN ELEMANA GIT demiş olduk

        Bekle(2);
        aksiyon.perform();  // aksiyonu gerçekleştir
        System.out.println("Aksiyon gerceklesti.");


        // aksiyonlar.moveToElement(element).click().build().perform();    kısa hali


        BekleKapat();


    }
}


/*

   KONSOL :

   Aksiyon öncesi Aksiyonlar sınıfı oluşturuldu
   Aksiyon hazırlandı.
   Aksiyon gerceklesti.



 */