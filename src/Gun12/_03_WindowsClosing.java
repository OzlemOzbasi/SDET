package Gun12;

/*    SENARYO :

   1- https://www.selenium.dev/    sayfasına gidiniz
   2- Sayfadaki bütün yeni sayfa açan linkleri tıklatınız ( mailto hariç)
   3- Açılan bütün yeni sayfaları teker teker kapatınız

 */

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _03_WindowsClosing extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.selenium.dev/");

        String anaSayfaWindowId = driver.getWindowHandle();    //  bulunduğun sayfanın  Window id si



        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));

        for ( WebElement link : linkler ) {

            if ( !link.getAttribute("href").contains("mailto"))
                link.click();
        }



        Set<String> windowIdler = driver.getWindowHandles();    // açık olan tüm sayfaların  Window id leri
        for ( String id : windowIdler ) {

            if ( id.equals( anaSayfaWindowId))    // en ustte Strıng ıle yazdırdıgımız ıcın anasayfayı burada yazma demıs olduk
                continue;      // ana sayfa değilse  devam et demıs olduk , yanı anasayfa harıcındekılerı yaz demıs olduk


            driver.switchTo().window(id);                        // diğer sayfaya  ( Window a) geçiş yaptık
            System.out.println(id + " - Title = " + driver.getTitle());    //  acmıs oldugu web sayfalarının title larını yaz dedık


            driver.close();    //  BİR ONCEKI ORNEKTEN TEK FARKI  BU   CLOSE  KISMININ EKLENMESI OLDU , yanı acılmıs olan sayfaları kapattırdık
        }





        Bekle(3);
        BekleKapat();

    }
}
