package Gun12;

/*
    Selenium da Sayfayı aşağı kaydırılması gereken durumlar vardır:
    Bunlar , sayfa kaydırıldıkça yüklenen elemanlar için.

    Bu işlem javascriptexecuter ile yapılır. Bu interface sayesinde     //  interface  dedıgı zaman birbirine dönüştürme yapılabılır demek yani new olayı yok
    sayfa kaydırma işlemi ve javascript komutları çalıştırılabilir      //   dönüştürme  --- double ınteger a  cevırme gıbı
    sayfa üzerinde.

    hotels.com, https://p-del.co/

 */

import Utils.BaseStaticDriver;
import org.openqa.selenium.JavascriptExecutor;

public class _04_Scrollintro extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://triplebyte.com/");


        // JavaScript komutlarını çalıştırmak için önce js değişkeni tanımlandı.
        JavascriptExecutor  js = ( JavascriptExecutor) driver;    //  dönüştürme yapmıs olduk


       //  Alttakı komut  scroll u  calıstırma komutu
        js.executeScript("window.scrollBy(0,1500)");    //   Script  --- calıstırmak demek
        // (0,1500) --> (x,y) Sayfayı sağa  x kadar  ve  aşağı  y kadar kaydırır
        // 1500 px kadar aşağı kaydıracak.



        Bekle(2);
        js.executeScript( "window.scrollBy(0,-1500)");   // -1500 px kadar  yukarı  kaydıracak  yanı yukardakını gerı almıs olduk




        BekleKapat();

    }
}
