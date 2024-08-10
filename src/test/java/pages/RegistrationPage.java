package pages;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.WebElement;
import utility.BrowserDriver;
import org.openqa.selenium.By;

public class RegistrationPage extends BrowserDriver {
    public static String registration_heading_xpath = "/html/body/center/h1";
    public static String visiblity_registrationheading() throws InterruptedException {
        Thread.sleep(2000);
        String getRegistration = driver.findElement(By.xpath(registration_heading_xpath)).getText();
        return getRegistration;
    }
}


