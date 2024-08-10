package StepDefinition;
import io.cucumber.java.en.When;
import static pages.SignInPage.*;

public class SignInPage {
    @When("User successfully enters the log in details")
    public void user_successfully_enters_the_log_in_details() throws Throwable{
        sendkeys_username();
        sendkeys_password();
        click_login_btn();
    }
}
