import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class UserListAddItemsPage extends AbstractBasePage<UserListEditPage> {

    private final SelenideElement ADD_ITEMS_FIELD = $(By.id("list_item_search"));
    private final SelenideElement SAVE_BTN = $x("//input[@class='k-button k-primary submit_comment']");
    private final ElementsCollection SEARCH_MOVIE_RESULTS = $$(By.id("list_item_search_listbox"));

    public UserListAddItemsPage addItemToList(String movieTitle) {
        getVisibilitiOfElement(ADD_ITEMS_FIELD).sendKeys(movieTitle);
        getListPresentElements(SEARCH_MOVIE_RESULTS).get(0).click();
        return this;
    }

    public UserListAddItemsPage saveAddedMovies() {
        getVisibilitiOfElement(SAVE_BTN).click();
        return this;
    }
}
