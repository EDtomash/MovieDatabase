import org.testng.Assert;
import org.testng.annotations.Test;

public class WatchlistTest extends ConfigTest{

    @Test
    public void watchList() {
       String addedFilm = new HomePage()
                .acceptAllCookies()
                .openLoginPage()
                .setUserName(userName)
                .setUserPassword(userPassword)
                .submitLogin()
                .openHomePage()
                .getMovieBtn()
                .clickAddToWatchlist()
                .openUserWatchlistTab()
                .getNameMovie();
        Assert.assertEquals(addedFilm,"Abigail");
    }
}
