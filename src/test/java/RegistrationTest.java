import net.datafaker.Faker;
import org.testng.annotations.Test;

public class RegistrationTest extends ConfigTest {

    @Test
    public void registerNewUser() {
        Faker faker = new Faker();
        String password = faker.internet().password();

        new HomePage()
                .acceptAllCookies()
                .openSignupPage()
                .setUserName(faker.internet().username())
                .setPassword(password)
                .confirmPassword(password)
                .setEmail(faker.internet().emailAddress())
                .submitRegistration();
    }
}
