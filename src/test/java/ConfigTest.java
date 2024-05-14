import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class ConfigTest {

    String userName = "wertertdfgdfg";
    String userPassword = "12301230";

    @BeforeClass
    public void setup() {
        Configuration.browser = System.getProperty("selenide.browser", "chrome");
        Configuration.browserSize = "1920x1080";
        Configuration.headless = Boolean.parseBoolean(System.getProperty("selenide.headless", "false"));
        System.out.println("Browser: " + Configuration.browser);
        System.out.println("Headless: " + Configuration.headless);
        open("https://www.themoviedb.org");
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }
}
