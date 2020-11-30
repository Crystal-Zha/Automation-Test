package page;
import common.MobileButton;
import common.MobileCheckBox;
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

    @AndroidFindBy(id = "com.ihealthlabs.MyVitalsPro:id/tv_forgot_password")
    private MobileButton forgotPasswordButton;

    @AndroidFindBy(id = "com.ihealthlabs.MyVitalsPro:id/btn_register")
    private MobileButton registerNewAccount;

    @AndroidFindBy(id = "com.ihealthlabs.MyVitalsPro:id/textinput_placeholder")
    private MobileTextBox tbRegisterEmail;

    @AndroidFindBy(id="com.ihealthlabs.MyVitalsPro:id/et_password_confirm")
    private MobileTextBox tbComfirmPassword;

    //阅读协议复选框
    @AndroidFindBy(id = "com.ihealthlabs.MyVitalsPro:id/policy_checked")
    private MobileCheckBox cbAgreeButton;

    @AndroidFindBy(id = "com.ihealthlabs.MyVitalsPro:id/btn_next")
    private MobileButton nextButton;

    //构造函数
    // 初始化注解 @AndroidFindBy 。。。
    public LoginPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public void inputEmail(String email){ tbEmail.input(email); }
    public void inputPassword(String password) { tbPassword.input(password); }
    public void clickLoginButton() {
        loginButton.click();
    }
    public void clickForgotPasswordButton(){ forgotPasswordButton.click(); }
    public void clickRegisterNewAccountButton(){ registerNewAccount.click(); }
    public void inputRegisterEmail(String newEmail){tbRegisterEmail.input(newEmail);}
    public void inputConfirmPassword(String comfirmPassword){tbComfirmPassword.input(comfirmPassword);}
    public void clickAgreeButton(){cbAgreeButton.click();}
    public void clickNextButton(){nextButton.click();}



    /*登录功能*/
    public void loginToHomePage(String email, String password) throws InterruptedException {
        this.inputEmail(email);
        this.inputPassword(password);
        this.clickLoginButton();
        Thread.sleep(1000);
    }

    /*注册账户*/
    public void registerNewAccount(String newEmail,String password1, String password2){
        clickRegisterNewAccountButton();
        inputRegisterEmail(newEmail);
        inputPassword(password1);
        inputConfirmPassword(password2);
        clickAgreeButton();
        clickNextButton();

    }








}
