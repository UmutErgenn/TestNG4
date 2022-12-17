package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _baseDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void baslangicIslemleri()           // açışılta çalışan kod kısmı.
    {
        System.out.println("başlangıç işlemleri");
        Logger logger = Logger.getLogger("");       // "" işareti ile sisteme ait tüm log'lara ulaştım.
        logger.setLevel(Level.SEVERE);      // sadece error'ları göster.

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");        // sessiz çalış, bana info verme.

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();

//      driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        Duration dr=Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);
//         bu eklenmezse selenium sayfa yüklenene (sonsuza) kadar bekler. : 30 sn sayfanın yüklenmesini bekle,yüklenemezse hata ver.
//         eğer 2 sn'de yüklerse 30 sn beklemez.

        driver.manage().timeouts().implicitlyWait(dr);  // tüm WebElementlerin element bazında, elemente özel işlem yapılmadan önce,
//         hazır hale gelmesi için verilen mühlet yani süre.

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        loginTest();
    }

    void loginTest()
    {
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        System.out.println("login test");

        WebElement inputEmail = driver.findElement(By.id("input-email"));
        inputEmail.sendKeys("FlokiTheCarpenter@gmail.com");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("123456789");

        WebElement loginBtn = driver.findElement(By.cssSelector("input[type='submit']"));
        loginBtn.click();

        Assert.assertEquals(driver.getTitle(),"My Account","Login Başarısız");
    }

    @AfterClass
    public void bitisIslemleri(){
        System.out.println("bitiş işlemleri");
        _tools.Bekle(3);
        driver.quit();             // açılmış olan tüm tarayıcıları kapatır.
    }
}
