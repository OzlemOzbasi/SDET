import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainApp {
    public static void main (String[] args) {

    //    System.setProperty("webdriver.chrome.driver", "C:/Selenium/ChromeDriver/chromedriver110.0.5481.77.exe");  // hangi browserı kullanacağımı ve tarayıcının path ini verdim.
                                                                                                                   //  son versıyonunda bu 7.satıra gerek kalmadı ( Subat 2023)

        WebDriver driver = new ChromeDriver();      // çalıştıracağımız driverı kontrol edecek değişkeni tanımladım.

        driver.get("https://www.techno.study/");    // siteyi açtım




    }
}

