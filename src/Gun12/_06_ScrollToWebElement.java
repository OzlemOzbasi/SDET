package Gun12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _06_ScrollToWebElement extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://triplebyte.com/");


        JavascriptExecutor  js = (JavascriptExecutor) driver;


        WebElement element = driver.findElement(By.className("heading-engineers-item-bottom"));
        js.executeScript("arguments[0].scrollIntoView()", element);   // yazılan elemente kadar scroll yapar


        js.executeScript("arguments[0].click()", element);           // javascript ile elemente click yapma





        BekleKapat();
    }
}
