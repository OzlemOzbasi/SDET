package Gun12;          //  27.07.2022  ---  Ders Kaydı

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _01_WindowGiris extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.selenium.dev/");

        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));   //  a[target='_blank']   ayrı pencere yanı ayrı web sayfası acanlar

        for ( WebElement link : linkler ) {

            if (!link.getAttribute("href").contains("mailto"))
                //  lısteleme sonrası cıkan mail sayfası cıkmasın dıye ,  href ınde  mailto  sayfasını acma dıyoruz
            link.click();
        }


         Set<String> windowIdler = driver.getWindowHandles();    // yukarıda lıstesını aldıgımız wındows sayfaladının  id  lerini yazdırdık
         for ( String id : windowIdler ) {

            System.out.println("id = " + id);
          }



        Bekle(6);
        BekleKapat();

    }
}

/*
    KONSOL :

id = CDwindow-487AA09E4BE82A5B08D8151D72B9DA07
id = CDwindow-73DD07C2CD597BAF0AA46A5A75B9F3A1
id = CDwindow-DF3278558873DB5C2BF98CC8525490F1
id = CDwindow-E56DB7327734FBF9FAFD886D4F7001E0
id = CDwindow-ED6B08B967B3C66EC7B92DA987EBB37B
id = CDwindow-0E81444D5FFC21959636056E13B08BD1
id = CDwindow-E949A6A6FA20D2C5C5F46A0D442C3FFB
id = CDwindow-F43E94B06764979B2DA4F10AC9DA1591
id = CDwindow-542C0BD8B2696657E40E788EE0B96BBA
id = CDwindow-F8D430A57DABEBEFB5A9E6EFB458C566


 */