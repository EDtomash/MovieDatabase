import org.testng.Assert;
import org.testng.annotations.Test;

public class BlockedEditingOptions extends ConfigTest{
    @Test
    public void editionOptions() {
        boolean textField = new HomePage()
                .acceptAllCookies()
                .openLoginPage()
                .setUserName(userName)
                .setUserPassword(userPassword)
                .submitLogin()
                .openHomePage()
                .getMovieBtn()
                .openEditMoviePage()
                .clickMovieTitle();
        Assert.assertTrue(textField, "Field is disabled");
    }
}
