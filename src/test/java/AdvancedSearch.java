import org.testng.Assert;
import org.testng.annotations.Test;

public class AdvancedSearch extends ConfigTest {

    @Test
    public void search() {
       String resultOfSortingMovies = new HomePage()
                .acceptAllCookies()
                .openPopularMoviePage()
                .ascendingSort()
                .selectGenresAction()
                .selectCertificationR()
                .selectLanguageJapanese()
                .clickOnSearch()
                .getMovieTitleFromResults();

        Assert.assertEquals(resultOfSortingMovies, "Акира");
    }
}
