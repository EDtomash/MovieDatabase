import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class UserProfilePage extends AbstractBasePage<UserProfilePage>{

    private final SelenideElement USER_NAME = $x("//div[@class='about']//h2");

    public String getUserNameFromPage() {
       return USER_NAME.getText();
    }
}
