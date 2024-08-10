package StepDefinition;
import io.cucumber.java.en.Then;
import static pages.ProductCategoryPage.*;
import static org.junit.Assert.assertEquals;

public class ProductCategoryPage {
    @Then("User should be able to view the product category page")
    public void user_should_be_able_to_view_the_product_category_page(){
        String actualProductCategory = visibility_productCategory();
        assertEquals(actualProductCategory, "Formal Shoes");
    }
}
