package page;
import common.MobileButton;
import common.MobileTextBox;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class LoginPage extends BasePage {

    //@AndroidFindBy = driver.findElementById
    @AndroidFindBy(id = "com.ihealthlabs.MyVitalsPro:id/et_user_name")
    private MobileTextBox tbEmail;

    @AndroidFindBy(id = "com.ihealthlabs.MyVitalsPro:id/et_user_password")
    private MobileTextBox tbPassword;

    @AndroidFindBy(id = "com.ihealthlabs.MyVitalsPro:id/btn_login")
    private MobileButton loginButton;

    //构造函数
    // 初始化注解 @AndroidFindBy 。。。
    public LoginPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public void inputHomerID(String email){ tbEmail.input(email); }

    public void inputPassword(String password) { this.tbPassword.input(password);
    }
    public void clickLoginButton() {
        this.loginButton.click();
    }

    public void loginToHomePage(String email, String password) throws InterruptedException {
        this.inputHomerID(email);
        this.inputPassword(password);
        this.clickLoginButton();
        Thread.sleep(1000);
    }




}
