import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.interactable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class UserListAddItemsPage extends AbstractBasePage<UserListEditPage>{

    private final SelenideElement ADD_ITEMS_FIELD = $(By.id("list_item_search"));
    private final SelenideElement SAVE_BTN = $x("//input[@class='k-button k-primary submit_comment']");
    private final ElementsCollection SEARCH_MOVIE_RESULTS = $$(By.id("list_item_search_listbox"));

    public UserListAddItemsPage addItemToList(String movieTitle) {
        ADD_ITEMS_FIELD.shouldBe(visible, interactable).sendKeys(movieTitle);
        SEARCH_MOVIE_RESULTS.get(0).click();
        return this;
    }

    public UserListAddItemsPage saveAddedMovies () {
        SAVE_BTN.shouldBe(visible, interactable).click();
        return this;
    }
}
