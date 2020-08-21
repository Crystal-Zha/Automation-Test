import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page.LoginPage;
import page.PosSelectionPage;

import java.net.MalformedURLException;

public class SmartPOSLoginTest extends BaseTest {
    //STEP1:
    @Test
    public void login() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToHomePage("1101101", "Hcc333333");
        PosSelectionPage posSelectionPage = new PosSelectionPage(driver);
        posSelectionPage.selectPOSCode("100579");



    }





}
