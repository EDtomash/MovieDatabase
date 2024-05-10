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
                .openStreamingServicesTab();
    }
}
