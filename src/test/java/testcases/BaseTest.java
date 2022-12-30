package testcases;

import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp()
    {
            WebDriverManager.chromedriver().setup();
            driver =new ChromeDriver();
    }
    @BeforeMethod
    public void getWebSite()
    {
        driver.navigate().to("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        homePage=new HomePage(driver);
    }

    @AfterMethod
    public void takeScreenShotOnFailure(ITestResult result) throws IOException {
        if (ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screen = camera.getScreenshotAs(OutputType.FILE);
            Files.copy(screen, new File("./screenshots/"+result.getName()+".png"));
        }
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
     }
