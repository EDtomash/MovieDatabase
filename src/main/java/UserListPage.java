import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class UserListPage extends UserBasePage {

    private final SelenideElement CREATE_LIST_BTN = $x("//div[@class='title_header']/a");
    private final ElementsCollection LIST_CARDS = $$x("//div[@class='card v4 list']//a");

    public UserListEditPage createList() {
        getVisibilitiOfElement(CREATE_LIST_BTN).click();
        return new UserListEditPage();
    }

    public String getListTitle() {
        return getListPresentElements(LIST_CARDS).get(0).getText();
    }
}
