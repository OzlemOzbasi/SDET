package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class _03_FindingByIdNotFoundException {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true"); // consola yazılan gereksiz KIRMIZI bilgileri sessize aldı.
        System.setProperty("webdriver.chrome.driver", "C:/Selenium/ChromeDriver/chromedriver110.0.5481.77.exe"); // hangi browserı kullanacağımı ve tarayıcının path ini verdim.
        WebDriver driver=new ChromeDriver(); // çalıştıracağımız driverı kontrol edecek değişkeni tanımladım.
        driver.get("http://www.practiceselenium.com/"); // siteyi açtım

        WebElement e=driver.findElement(By.id("Elemani Bulamadigi Zaman Ne Olacak"));

        System.out.println(e.getText());


        Thread.sleep(3000);
        driver.quit();







    }
}
