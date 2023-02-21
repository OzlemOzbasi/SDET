package Gun11;     //  26.07.2022  ---  Ders Kaydı

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://chercher.tech/practice/frames");

      //  Bu alttakı ıle frame kısmına gecıs yapmıs oluyoruz , ısımız bıtınce cıkıs yapmamız gerekıyor
        driver.switchTo().frame(0);   // "frame1"  parantez ıcıne bunu yazınca yavas oluyor o yuzden index kullanıyoruz o daha hızlı calısıyor

        WebElement input = driver.findElement(By.cssSelector("b[id='topic']~input"));    //  b  nin  bitişik kardeşi olan   input   demiş olduk
        input.sendKeys("Türkiye");


        //  BU alttakıler ile yukarıda gırıs yapmıs oldugumuz frame den cıkıs yapmıs ve ılk geldıgımız yere dönmüş oluyoruz

//        driver.switchTo().parentFrame();        // geldiğin yere geri dön (1 basamak geri git)
//        driver.switchTo().defaultContent();     // ilk ana sayfaya direk geri dön




        BekleKapat();

    }
}
