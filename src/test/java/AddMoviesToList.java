import org.testng.Assert;
import org.testng.annotations.Test;

public class AddMoviesToList extends ConfigTest {

    @Test
    public void addingMovie() {
        String listTitle = "My list";

        String createdListTitle = new HomePage()
                .acceptAllCookies()
                .openLoginPage()
                .setUserName(userName)
                .setUserPassword(userPassword)
                .submitLogin()
                .openListsPage()
                .createList()
                .fillNameField(listTitle)
                .fillDescriptionField("For good mood")
                .submitNewList()
                .addItemToList("Apes")
                .saveAddedMovies()
                .openUserListPage()
                .getListTitle();

        Assert.assertEquals(createdListTitle, listTitle);
    }
}
