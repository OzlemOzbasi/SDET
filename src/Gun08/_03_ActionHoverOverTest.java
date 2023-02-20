package Gun08;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionHoverOverTest extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.etsy.com/");


//       HOCA ILK YAPTIGINDA SAYFAYI ACTIGINDA DIREK COOKIES EKRANI CIKTIGI ICIN ASAGIDAKINI ONU KAPAMAK ICIN YAZMIS,
//       su an cıkmıyor ekranda o yuzden yazmadım

//        List<WebElement> cookiesAccept=driver.findElements(By.cssSelector("[data-gdpr-single-choice-accept='true']"));
//        if (cookiesAccept.size() > 0)        --- eleman var ise
//            cookiesAccept.get(0).click();    --- onu clıck ıle kapat  demıs olduk



        WebElement mucevher = driver.findElement(By.xpath("//span[@id='catnav-primary-link-10855']"));

        WebElement kolye = driver.findElement(By.xpath("//span[@id='side-nav-category-link-10873']"));

        WebElement bibkolye = driver.findElement(By.xpath("//*[@id='catnav-l3-10881']"));



        Actions aksiyonlar = new Actions(driver);

        Bekle(2);
        aksiyonlar.moveToElement(mucevher).build().perform();    //  kısa yolunu yaptık burada

        Bekle(2);
        aksiyonlar.moveToElement(kolye).build().perform();

        Bekle(2);
        aksiyonlar.moveToElement(bibkolye).build().perform();



        // 3 .adım
        bibkolye.click();


        // 4.adım :  URL dogrulama
        Assert.assertTrue( driver.getCurrentUrl(). contains("bib") );




        Bekle(2);
        BekleKapat();

    }
}
