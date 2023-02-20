package Gun10;

/*     SORU:

Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
                    Name giriniz.
                    Comment giriniz.
                    Submit'e tıklayınız.
                    Form submited Successfully!     yazısı görüntülenmelidir.
                    Assert ile kontrol ediniz
 */

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _03_FillingFormTask extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");


        WebElement name = driver.findElement(By.xpath("//input[@id='title']"));
        name.sendKeys("Deniz");


        WebElement comment = driver.findElement(By.xpath("//*[@id='description']"));
        comment.sendKeys("Kaynak");


        WebElement submit = driver.findElement(By.xpath("//input[@id='btn-submit']"));
        submit.click();



        wait.until(ExpectedConditions.textToBe( By.id("submit-control"), "Form submited Successfully!") );


        WebElement mesaj = driver.findElement(By.id("submit-control"));
        Assert.assertEquals("Form submited Successfully!", mesaj.getText());




        BekleKapat();
    }
}
