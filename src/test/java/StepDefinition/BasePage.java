package StepDefinition;
import io.cucumber.java.en.Given;
import static pages.HomePage.*;

public class BasePage {
    @Given("User navigates to login page")
    public void user_navigates_to_login_page() throws Throwable{
        click_hamburger_menu();
        click_signIn();
    }
}
