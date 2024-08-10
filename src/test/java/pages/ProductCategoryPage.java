package pages;
import org.openqa.selenium.By;
import static utility.BrowserDriver.driver;

public class ProductCategoryPage{
    public static String productCategory_heading_xpath = "//*[@id=\"ShoeType\"]";
    public static String visibility_productCategory(){
        String actualProductCategory = driver.findElement(By.xpath(productCategory_heading_xpath)).getText();
        return actualProductCategory;
    }
}
