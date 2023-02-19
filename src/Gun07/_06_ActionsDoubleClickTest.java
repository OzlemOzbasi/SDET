package Gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionsDoubleClickTest extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/buttons");

        Bekle(2);
        WebElement ciftClick = driver.findElement(By.xpath("//button[text()='Double Click Me']"));


        Actions aksiyonlar = new Actions(driver);

        Action aksiyon = aksiyonlar.moveToElement(ciftClick).doubleClick().build();
        aksiyon.perform();



        Bekle(2);
        BekleKapat();
    }
}
