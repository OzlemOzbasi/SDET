package Gun12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _02_WindowsSwitch extends BaseStaticDriver {
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
        }


        Bekle(3);
        BekleKapat();
    }
}


/*
    KONSOL :

CDwindow-055882F92AD6ED1E581012209F7C8343 - Title = Selenium Developers - Google Gruplar
CDwindow-E48F9E6AABC6890BE843BA46B107345B - Title = Kiwi IRC - The web IRC client
CDwindow-F791840D73AC7225E339E7DDE4DD8A99 - Title = Create Account | Slack
CDwindow-D5DF29886147856D01027089421FC0A8 - Title = Selenium (@SeleniumHQ) / Twitter
CDwindow-DC19BC25CE75E7BB6833AC74138EE383 - Title = GitHub - SeleniumHQ/selenium: A browser automation framework and ecosystem.
CDwindow-CFE131E0E2DEB2AB6E826E9932789A25 - Title = Selenium (WebDriver) | Facebook
CDwindow-533321BDE36540F95F5B12C82586525D - Title = Selenium Users - Google Gruplar
CDwindow-1F7F0781046A78C15486CC7846E819D2 - Title = Selenium Conference 2023 | Chicago, IL | March 28-30, 2023
CDwindow-1E8701E9E1F5CBECA1888661179BD608 - Title = Selenium Conference - YouTube


 */