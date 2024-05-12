import org.testng.Assert;
import org.testng.annotations.Test;

public class AddingProfileAvatarTest extends ConfigTest {

    @Test
    public void addingProfileAvatar() {
        UserEditProfilePage currentAvatar = new HomePage()
                .acceptAllCookies()
                .openLoginPage()
                .setUserName(userName)
                .setUserPassword(userPassword)
                .submitLogin()
                .openHomePage()
                .openEditProfile()
                .clickUploadAvatarBtn();
        Assert.assertTrue(currentAvatar.newAvatarDisplayed(), "New avatar is not displayed");
    }
}
