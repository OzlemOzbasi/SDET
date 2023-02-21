package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseStaticDriver {

    public static WebDriver driver;
    public static WebDriverWait wait;


        static    //  burayı sadece static yapınca dıger class larda bu altta yazılanlar sankı varmıs gıbı gozukucek, class lara metodu yazmasakta
        {
            KalanOncekileriKapat();    //  Metod en altta

            Logger logger = Logger.getLogger("");   // bu ve alttakı satır konsolda cıkan kırmızılıkların bazılarını kaldırıyor
            logger.setLevel(Level.SEVERE);

            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");  // consola yazılan gereksiz KIRMIZI bilgileri sessize aldı, gızledı
         //   System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

            driver = new ChromeDriver();
            driver.manage().window().maximize();    //  ekran sayfasını  max  yapıyor
            driver.manage().deleteAllCookies();

            wait = new WebDriverWait(driver, Duration.ofSeconds(30));

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));    // sadece ana sayfa yüklenirken en başta
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));    // bütün webElement için geçerli
        }



        public static void BekleKapat()
        {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.quit();
        }




        public static void Bekle(int saniye)
        {

            try {
                Thread.sleep(saniye*1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }



                                                        //  run ıle acılan  chrome drıve , manuel ıle actıgımız   chrome  oluyor
        public static void KalanOncekileriKapat() {   //  Daha once run ıle calıstırılmıs chromedrıver ları herseyı kapatıyor yanı pc hafızası temızlenıyor

            try {
                Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
            } catch (Exception ignored) {

            }
    }



}
