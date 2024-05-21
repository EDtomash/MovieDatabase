import com.codeborne.selenide.Configuration;
import org.openqa.selenium.OutputType;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.qameta.allure.Attachment;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import static com.codeborne.selenide.Selenide.*;

public class ConfigTest {

    String userName = "wertertdfgdfg";
    String userPassword = "12301230";

    @BeforeMethod
    public void setup() {
        Configuration.browser = System.getProperty("selenide.browser", "chrome");
        Configuration.browserSize = "1920x1080";
        Configuration.headless = Boolean.parseBoolean(System.getProperty("selenide.headless", "true"));
        System.out.println("Browser: " + Configuration.browser);
        System.out.println("Headless: " + Configuration.headless);
        open("https://www.themoviedb.org");
    }

    @AfterMethod
    public void tearDown(ITestResult result) {

        if (!result.isSuccess()) {
            saveScreenshot();
        }
        closeWebDriver();
    }
    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] saveScreenshot() {
        return screenshot(OutputType.BYTES);
    }
}
