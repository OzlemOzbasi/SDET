package Gun11;

/*
   1- driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2- Inputa ülke adı yazınız
   3- CheckBox ı çekleyiniz.
   4- Select in 4.elemanını seçiniz.

 */

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IFrameSoru extends BaseStaticDriver {
    public static void main(String[] args) {


        driver.get("https://chercher.tech/practice/frames");


        //2- Inputa ülke adı yazınız

        driver.switchTo().frame(0);   // frame1 e  gıttık

        WebElement input = driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Türkiye");




        //3- CheckBox ı çekleyiniz.  ---   // frame1 in içinde frame 3 e geçiş yaptım

        driver.switchTo().frame(0);   // frame3  e  gıttık

        WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();



     //    driver.switchTo().parentFrame();      // su anda frame 1 geri geldim
     //    driver.switchTo().parentFrame();      // şu anda ana sayfaya geri geldim.

        driver.switchTo().defaultContent();     // veya direk ana sayfaya gitmenin yolu  --- ya da bunun yerıne usttekı 2 satırı yazmak gerekırdı



        //4- Select in 4.elemanını seçiniz.

        driver.switchTo().frame(1);   // frame2  e  gıttık

        WebElement animalsMenu = driver.findElement(By.id("animals"));
        Select ddMenu = new Select(animalsMenu);   //  drop down menu --- asagı dogru acılır menu
        ddMenu.selectByIndex(3);                   //  4.elemanı yani 3 indexli eleman seçildi




        BekleKapat();

    }
}

//  <body>          // defaultContent
//
//    <iframe1 name="IFrame1">   0
//        <iframe  name="IFrame3"></iframe>  0
//    </iframe>
//
//    <iframe1  name="IFrame2">  1
//    </iframe>
//
//  </body>