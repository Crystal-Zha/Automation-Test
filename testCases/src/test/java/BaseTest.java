import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import server.appium.AppiumDriverFactory;

import java.net.MalformedURLException;

public class BaseTest {
    AndroidDriver<MobileElement> driver;

    @BeforeTest
    public void init() throws MalformedURLException {
        AppiumDriverFactory appiumDriverFactory = new AppiumDriverFactory();

        driver = appiumDriverFactory.getDriver();
    }

}
