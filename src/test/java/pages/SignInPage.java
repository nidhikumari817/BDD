package pages;

import utility.BrowserDriver;
import org.openqa.selenium.By;

public class SignInPage extends BrowserDriver {

    public static String user_name = "//*[@id=\"usr\"]";
    public static String password = "//*[@id=\"pwd\"]";
    public static String login = "//*[@id=\"second_form\"]/input";
    public static String newRegisteration = "//button[@id=\"NewRegistration\" ]";

    public static void sendkeys_username(){
        driver.findElement(By.xpath(user_name)).sendKeys("cnidhi785");
    }
    public static void sendkeys_password(){
        driver.findElement(By.xpath(password)).sendKeys("Nidhi@123");
    }
    public static void click_login_btn(){
        driver.findElement(By.xpath(login)).click();
    }
    public static void click_newRegisteration_btn(){
        driver.findElement(By.xpath(newRegisteration)).click();
    }
}
