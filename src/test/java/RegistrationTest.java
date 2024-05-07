import net.datafaker.Faker;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RegistrationTest extends ConfigTest {

    @Test
    public void registerNewUser() {
        Faker faker = new Faker();
        String password = faker.internet().password();

        String emailVerificationMsg = new HomePage()
                .acceptAllCookies()
                .openSignupPage()
                .setUserName(faker.internet().username())
                .setPassword(password)
                .confirmPassword(password)
                .setEmail(faker.internet().emailAddress())
                .submitRegistration()
                .getVerificationText();

        assertTrue(emailVerificationMsg.contains("Your email address hasn't been verified"));
    }
}
