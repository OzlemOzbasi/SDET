package Gun10;

/*
Senaryo :

  1-  https://www.demoblaze.com/index.html  siteyi açınız.
  2- Samsung galaxy s6  linkine tıklayınız.
  3- Sepete ekleyiniz.
  4- Daha sonra  PRODUCT STORE  yazısına tıklatarak ana ekrana geri dönünüz

 */

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _04_WaitSoru extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.demoblaze.com/index.html");

        WebElement btn = driver.findElement(By.linkText("Samsung galaxy s6"));
        btn.click();

        WebElement sepeteEkle = driver.findElement(By.linkText("Add to cart"));
        sepeteEkle.click();


        wait.until(ExpectedConditions.alertIsPresent());    //  Alert kutusunu gormuyordu hata verıyordu o yuzden alert i gör sonra devam et dıyoruz
        driver.switchTo().alert().accept();                //  cıkan alert kutusuna TAMAM dedık


        WebElement anaSayfa = driver.findElement(By.id("nava"));
        anaSayfa.click();


        BekleKapat();
    }
}
