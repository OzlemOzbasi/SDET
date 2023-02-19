package Gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _08_ActionsDragAndDropTest extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement norvec = driver.findElement(By.id("box101"));


        //  1.YÖNTEM

        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.dragAndDrop(oslo, norvec).build();

        aksiyon.perform();      //  aksiyonlar.dragAndDrop(oslo,norvec).build().perform;    kısaltılmıs halı



        Bekle(3);

        //  2.YÖNTEM

        WebElement seul = driver.findElement(By.id("box5"));
        WebElement kore = driver.findElement(By.id("box105"));

        // yukarda tanımladıgımız ıcın burada tekrar new ıle tanımlamıyoruz
        aksiyon = aksiyonlar.clickAndHold(seul).moveToElement(kore).release().build();   //  clickAndHold -- seulu click yap ve tut , götür koreye
      //                   clickAndHold -- seulu click yap ve tut , götür koreye  ve release yani bırak

        aksiyon.perform();


        BekleKapat();

    }
}
