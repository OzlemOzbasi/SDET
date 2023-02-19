package Gun06;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



/*
     select class ı  nasıl kullanırız ;

     görünen text ile seçim için: selectByVisibleText
     valueden seçim için        : selectByValue
     sırasından seçim için      : selectByIndex
 */

public class _03_SelectClassGiris extends BaseStaticDriver {
    public static void main(String[] args) {


        driver.get("https://www.amazon.com/");

        WebElement menu = driver.findElement(By.id("searchDropdownBox"));
        Select ddmenu = new Select(menu);        // seçim olan kısımların yapılısı

        ddmenu.selectByVisibleText("Books");

        Bekle(1);
        WebElement aramaButton = driver.findElement(By.id("nav-search-submit-button"));
        aramaButton.click();



        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("amazon")); //  bu url de bu amazon adresı var mı dıye kontrol edılmıs oluyor ve hata varsa benı rahatsız etme dıyo


        BekleKapat();




    }
}
