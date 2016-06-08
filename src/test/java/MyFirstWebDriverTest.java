import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MyFirstWebDriverTest {
    @Test
    public void checkSeleniumHQinFirefox(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.de");
        driver.quit();
    }
}
