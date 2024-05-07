import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MoviesSearchPage extends AbstractBasePage<MoviesSearchPage> {

    private final SelenideElement SORT_DROPDOWN = $x("//div[@class='filter_panel card closed'][1]//h2");


}
