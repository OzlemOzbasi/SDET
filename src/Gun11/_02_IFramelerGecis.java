package Gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_IFramelerGecis extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://chercher.tech/practice/frames");


        driver.switchTo().frame(0);   // frame1 e  gıttık

        WebElement input = driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Türkiye");


      //  Acmıs oldugumuz frame ı kapamak ıcın bu alttakı ıkısını de ayrı ayrı kullanabılırız , bızı ıstedıgımız sayfaya ıkısıde goturuyor

     //  driver.switchTo().parentFrame();      // geldiğin yere geri dön (1 basamak geri git)
         driver.switchTo().defaultContent();     // ilk ana sayfaya direk geri dön



        driver.switchTo().frame(1);   // frame2  e  gıttık

        WebElement animalsMenu = driver.findElement(By.id("animals"));
        Select ddmenu = new Select(animalsMenu);
        ddmenu.selectByIndex( ddmenu.getOptions().size() -1);   //  lıstedekı son elemanı sectik



        BekleKapat();

    }
}

//        frame 0
//            >subframe 0
//            >subframe 1
//        frame 1