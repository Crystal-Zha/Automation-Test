package page;
import common.MobileButton;
import common.MobileTextBox;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class LoginPage extends BasePage {

    //@AndroidFindBy = driver.findElementById
    @AndroidFindBy(id = "cz.adastragrp.hccn:id/email")
    private MobileTextBox tbHomerID;

    @AndroidFindBy(id = "cz.adastragrp.hccn:id/password")
    private MobileTextBox tbPassword;

    @AndroidFindBy(id = "cz.adastragrp.hccn:id/btn_login")
    private MobileButton loginButton;

    //构造函数
    // 初始化注解 @AndroidFindBy 。。。
    public LoginPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public void inputHomerID(String homerId) { tbHomerID.input(homerId); }
    public void inputPassword(String password) {
        this.tbPassword.input(password);
    }
    public void clickLoginButton() {
        this.loginButton.click();
    }

    public void loginToHomePage(String homerID, String password) throws InterruptedException {
        this.inputHomerID(homerID);
        this.inputPassword(password);
        this.clickLoginButton();
        Thread.sleep(1000);
    }


}
