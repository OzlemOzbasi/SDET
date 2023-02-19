package Gun06;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _04_SelectEBay extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.ebay.com/");

        WebElement menu = driver.findElement(By.id("gh-cat"));
        Select ddmenu = new Select(menu);        // seçim olan kısımların yapılısı

        ddmenu.selectByValue("281");

        Bekle(1);
        WebElement searchButton = driver.findElement(By.id("gh-btn"));
        searchButton.click();



        Assert.assertTrue(driver.getCurrentUrl().contains("ebay"));


        BekleKapat();


    }
}
