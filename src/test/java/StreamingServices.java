import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamingServices extends ConfigTest{

    @Test
    public void streamingServices() {

        new HomePage()
                .acceptAllCookies()
                .openLoginPage()
                .setUserName(userName)
                .setUserPassword(userPassword)
                .submitLogin()
                .openAccountSettings()
                .openAccountSettings()
                .openStreamingServicesTab()
                .subscribeToNetflix();

        Selenide.refresh();

      String addedNetflix = new UserSettingsStreamingServicesPage()
                .checkNetflixSub();

        Assert.assertEquals(addedNetflix, "Netflix");
    }
}
