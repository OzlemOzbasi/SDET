package Gun06;        //  19.07.2022  ---  Ders Kaydı

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import org.junit.Assert;


public class _02_XpathSenaryo extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.saucedemo.com/");

        Bekle(3);
        WebElement usernameInput = driver.findElement(By.xpath("//input[@id='user-name']"));
        usernameInput.sendKeys("standard_user");  //   keys kısmına kendımız bır sey yazıyoruz

        Bekle(1);
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");    //   keys kısmına kendımız bır sey yazıyoruz

        Bekle(1);
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();

        Bekle(1);
        WebElement BackpackElement = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        BackpackElement.click();

        Bekle(1);
        WebElement addToCart = driver.findElement(By.xpath("//*[@name='add-to-cart-sauce-labs-backpack']"));
        addToCart.click();

        WebElement buttonBack = driver.findElement(By.xpath("//button[@name='back-to-products']"));
        buttonBack.click();
        Bekle(1);
        Bekle(1);


      //  2. ürün ekleme
        WebElement boltTshirtTextElement = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        boltTshirtTextElement.click();

        Bekle(1);
        WebElement addToCart2 = driver.findElement(By.xpath("//*[@name='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addToCart2.click();

        Bekle(1);
        WebElement buttonBack2 = driver.findElement(By.xpath("//button[@name='back-to-products']"));
        buttonBack2.click();


        //  Sepet ve Ödeme kısmı
        Bekle(1);
        WebElement sepet = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));   //  //*[@class='shopping_cart_badge']   bu sekılde de yazabılırız
        sepet.click();

        WebElement checkOut = driver.findElement(By.xpath("//button[@name='checkout']"));
        checkOut.click();
        Bekle(1);

        Bekle(1);
        WebElement firstName = driver.findElement(By.xpath("//*[@name='firstName']"));
        firstName.sendKeys("Deniz");

        Bekle(1);
        WebElement lastName = driver.findElement(By.xpath("//*[@name='lastName']"));
        lastName.sendKeys("Kaynak");

        Bekle(1);
        WebElement zipCode = driver.findElement(By.xpath("//*[@name='postalCode']"));
        zipCode.sendKeys("12345");

        Bekle(1);
        WebElement buttonCheckOut = driver.findElement(By.xpath("//*[@name='continue']"));
        buttonCheckOut.click();


        //  Ekrandakı 2 urunun rakam kısımlarını ıncele yaptıgımızda ıkısınında class ısımlerının aynı oldugunu goruyoruz
        // 2 eleman oldugu ıcınde   findelements  yapıyoruz , elements oldugu ıcın dogal olarak List e atmamız gerekıyor

        // (//*[@class='inventory_item_price'])[1]   --- bu da 2. bulma yoluydu ama hoca bunu yapmadı asagıdakını yaptı

        List<WebElement> ucretler = driver.findElements(By.xpath("//*[@class='inventory_item_price']"));

        double toplam = 0;
        for( WebElement e: ucretler ) {
            System.out.println("e.getText() = " + e.getText());
            toplam += Double.parseDouble(e.getText().substring(1));

            // ekrandakı rakamların basında $ ısaretını kaldırmak ıcın  substring yazıldı
           //  String i double cevırdık , sonra  substring ile basındakı  $ dolar ısaretını kaldırdık ve toplamını yazdırdık
        }
        System.out.println("toplam = " + toplam);



        // Ekranda kı vergı harıc toplam tutarı aldık ve karsılastırdık

        WebElement webAltToplam = driver.findElement(By.xpath("//*[@class='summary_subtotal_label']"));

        System.out.println(webAltToplam.getText());   //  webAltToplam   text ını yazdırdık alttakı substrıng de kac basamak oldugunu gormek ve hata almamaık ıcın
        double altToplam = Double.parseDouble(webAltToplam.getText().substring(13));  // rakamın basındakı Item total: $ dan sonrası demıs olduk 13 ıle
        System.out.println("altToplam = " + altToplam);



        if (toplam == altToplam)
            System.out.println("test passed");
        else
            System.out.println("test failed");




        Assert.assertTrue(toplam == altToplam);           // hata yoksa rahatsız etme dıyoruz

        //  Assert.assertEquals("merhaba", "merhaba1");
      //    soldaki beklenen ( expected ),  sagdakı gerceklesen ( actual )

        Bekle(3);
        BekleKapat();

    }
}
