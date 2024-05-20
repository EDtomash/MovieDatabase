import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends ConfigTest{

    @Test
    public void logoutTest() {
        String loggedOutText = new HomePage()
                .acceptAllCookies()
                .openLoginPage()
                .setUserName(userName)
                .setUserPassword(userPassword)
                .submitLogin()
                .openHomePage()
                .clickLogoutBtn()
                .getLogoutMessage();
        Assert.assertEquals(loggedOutText, "Logged Out!\nYou have been successfully logged out.");
    }
}
