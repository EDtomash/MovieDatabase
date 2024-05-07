import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends ConfigTest {

    @Test
    public void loginTest() {
        String userNameText = new HomePage()
                .acceptAllCookies()
                .openLoginPage()
                .setUserName(userName)
                .setUserPassword(userPassword)
                .submitLogin()
                .getUserNameFromPage();

        Assert.assertEquals(userNameText, userName);
    }
}

