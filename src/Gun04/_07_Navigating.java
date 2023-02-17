package Gun04;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _07_Navigating extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        // tarayıcının linklere tıklandıgında gidip geldiği sayfaları saklar
        // ve aşağıdaki komutlarla sayfaları ileri geri yönlendirebilir


        Bekle(3);
        WebElement element = driver.findElement(By.linkText("Alerts (JavaScript)") );
        element.click();
        Bekle(3);    // normalde cok kullanılmaz ama biz sayfanın acıldıgını gormek ıcın yazıyoruz


        driver.navigate().back();      // sayfayı geri alır
        Bekle(3);


        driver.navigate().forward();  // sayfayı ileri alır




        BekleKapat();


    }
}
