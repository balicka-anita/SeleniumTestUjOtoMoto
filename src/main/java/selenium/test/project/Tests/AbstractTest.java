package selenium.test.project.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import selenium.test.project.Utils.CustomPath;
import selenium.test.project.Utils.CustomScreenshot;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {

    protected static WebDriver driver;
    protected static CustomScreenshot customScreenshot;

    @BeforeSuite
    public void setUpSuite() {
        // Inicjalizacja obiektu customScreenshot
        customScreenshot = new CustomScreenshot();
        // Wskazanie zewnętrznego pliku drivera dla przeglądarki CHROME
        String chromedriver = System.getenv("CHROMEDRIVER");
        if (chromedriver != null) {
            setChromeDriverPath(chromedriver);
        } else {
            setChromeDriverPath("chromedriver.exe");
        }
        //Stworzenie i zainicjalizowanie obiektu DRIVER przeglądarką CHROME
        driver = new ChromeDriver();
        // Ustawienie globalnego timeouta na 5 sekund
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Ustawienie zmaksymalizowanego okna
        driver.manage().window().maximize();
        // przejście na wskazaną stronę
        driver.get("https://www.otomoto.pl");

        //strona logowania: https://www.otomoto.pl/konto/?ref%5B0%5D%5Bshop%5D=0&ref%5B0%5D%5Baction%5D=myaccount&ref%5B0%5D%5Bmethod%5D=index
    }

    private void setChromeDriverPath(String filename) {
        System.setProperty(
                "webdriver.chrome.driver",
                new CustomPath().getResourcesPath(filename)
        );
    }


    @AfterMethod
    public void tearDownMethod(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            customScreenshot.makeScreenshot(
                    driver,
                    new Date().getTime() + "_" +
                            result.getMethod().getMethodName()
            );
        }
    }

    @BeforeMethod
    public void setDriverBackToMainPage() {
        driver.get("https://www.otomoto.pl");
    }

    @AfterSuite
    public void tearDownSuite() {
        //Zamknięcie przeglądarki
        driver.quit();
    }
}
