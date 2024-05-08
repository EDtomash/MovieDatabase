import org.testng.annotations.Test;

public class WatchlistTest extends ConfigTest{

    @Test
    public void watchList() {
        new HomePage()
                .acceptAllCookies()
                .openLoginPage()
                .setUserName(userName)
                .setUserPassword(userPassword)
                .submitLogin()
                .openHomePage()
                .getMovieBtn()
                .clickAddToWatchlist()
                .openUserWatchlistTab()

    }
}
