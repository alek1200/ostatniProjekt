import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by terg on 2015-02-07.
 */
public class testTest {
    @Test()
    public void test(){
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.google.pl/");
        driver.quit();
    }
}
