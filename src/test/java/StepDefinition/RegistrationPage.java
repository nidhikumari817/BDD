package StepDefinition;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;
import static pages.RegistrationPage.visiblity_registrationheading;
import static pages.SignInPage.click_newRegisteration_btn;

public class RegistrationPage {
    @When("User clicks on New Registration button")
    public void user_clicks_on_new_registration_button() {
        click_newRegisteration_btn();
    }
    @Then("User should be able to view the Registration page")
    public void user_should_be_able_to_view_the_registration_page() throws InterruptedException {
        String actualRegistrtationPageheading = visiblity_registrationheading();
        assertEquals(actualRegistrtationPageheading, "User Registration Page");
    }
}