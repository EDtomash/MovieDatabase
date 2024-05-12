import org.testng.Assert;
import org.testng.annotations.Test;

public class RatingMovieTest extends ConfigTest {

    @Test
    public void ratingMovie() {
        String actualresult = new HomePage()
                .acceptAllCookies()
                .openLoginPage()
                .setUserName(userName)
                .setUserPassword(userPassword)
                .submitLogin()
                .openHomePage()
                .getMovieBtn()
                .clickVibeBtn()
                .clickRatingScoreBtn()
                .clickDoneBtn()
                .openUserRatingsTab()
                .ratingScoreMovie();
        Assert.assertEquals(actualresult, "60");
    }
}
