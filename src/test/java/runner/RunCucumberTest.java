package runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json","html:target/reports/"},
        features = "src/test/resources/features/desconto.feature",
        glue= {"steps/DescontoStep.java"}
)
public class RunCucumberTest{
    public static WebDriver driver;
    @BeforeClass
     public static void inicar(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\i5 NV01\\drivers\\chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @AfterClass
     public static void finalizar(){

    }
}
