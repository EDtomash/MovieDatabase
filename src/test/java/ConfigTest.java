import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class ConfigTest {
    String login = "wertertdfgdfg";
    String pass = "12301230";

    @BeforeMethod
    public void setup() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        open("https://www.themoviedb.org");
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }
}
