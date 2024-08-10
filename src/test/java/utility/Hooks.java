package utility;

import org.junit.Before;
import org.junit.After;

public class Hooks {

    public static BrowserDriver driver;

    @Before
    public void setup(){
        driver = new BrowserDriver();
    }

    @After
    public void teardown(){
        driver.close();
    }
}
