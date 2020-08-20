import org.testng.annotations.BeforeTest;
import server.appium.AppiumDriverFactory;
import java.net.MalformedURLException;

public class BaseTest {

    AppiumDriverFactory appiumDriverFactory = new AppiumDriverFactory();

    @BeforeTest
    public void init() throws MalformedURLException {
        appiumDriverFactory.getDriver();
    }

}
