package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class _02_FindingById {
    public static void main(String[] args) throws InterruptedException {

   //   System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true"); // consola yazılan gereksiz KIRMIZI bilgileri sessize aldı.

    //  System.setProperty("webdriver.chrome.driver", "C:/Selenium/ChromeDriver/chromedriver110.0.5481.77.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement eleman = driver.findElement(By.id("label_3"));
        System.out.println(eleman.getText() );                         //  bana bu elemanın text ini yani ekranda gözüken kısmı ver dedik

        Thread.sleep(3000);
        driver.quit();


    }
}
