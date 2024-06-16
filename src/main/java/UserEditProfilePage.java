import com.codeborne.selenide.SelenideElement;
import java.io.File;

import static com.codeborne.selenide.Selenide.$x;

public class UserEditProfilePage extends SettingsBasePage {

    private final SelenideElement UPLOAD_AVATAR_BTN = $x("//a[contains(text(),'Upload Your Own?')]");
    private final SelenideElement SELECT_FILES_BTN = $x("//input[@name='upload_files']");
    private final SelenideElement CURRENT_AVATAR = $x("//p[@class='avatar']");

    public UserEditProfilePage clickUploadAvatarBtn() {
        getVisibilitiOfElement(UPLOAD_AVATAR_BTN).click();
        File file = new File("D:\\\\photo_2024-04-11_03-32-58.jpg");
        getVisibilitiOfElement(SELECT_FILES_BTN).uploadFile(file);
        return new UserEditProfilePage();
    }

    public boolean newAvatarDisplayed() {
        getVisibilitiOfElement(CURRENT_AVATAR).getText();
        return true;
    }
}
