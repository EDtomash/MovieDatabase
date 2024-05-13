import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$x;

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
