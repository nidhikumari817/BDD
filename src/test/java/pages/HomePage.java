package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {
    public static String hamburger_menu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String signin_xpath = "//ul[@id=\"menu\"]//child::a[2]";
    public static void click_hamburger_menu() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }
    public static void click_signIn() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(signin_xpath)).click();
    }
}
