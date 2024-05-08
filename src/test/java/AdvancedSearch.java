import org.testng.annotations.Test;

public class AdvancedSearch extends ConfigTest {

    @Test
    public void search() {
        new HomePage()
                .openPopularMoviePage();
    }
}
