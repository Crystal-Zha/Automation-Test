package page;

import common.MobileButton;
import common.MobileTextBox;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //homerID
    //@AndroidFindBy = driver.findElementById
    @AndroidFindBy(id = "cz.adastragrp.hccn:id/email")
    private MobileTextBox tbHomerID;


    @AndroidFindBy(id = "cz.adastragrp.hccn:id/password")
    private MobileTextBox tbPassword;

    @AndroidFindBy(id = "cz.adastragrp.hccn:id/btn_login")
    private MobileButton loginButton;

//    WebDriver driver;
//
//    public LoginPage() {
//
//    }
//    public LoginPage(WebDriver driver) {
//        this.driver = driver;
//    }

    public LoginPage(AndroidDriver<WebElement> driver) {
        // 初始化注解 @AndroidFindBy 。。。
        PageFactory.initElements(driver, this);
        //   homerID = (MobileTextBox) driver.findElementById("cz.adastragrp.hccn:id/email");

    }


    public void inputHomerID(String homerId) {
        tbHomerID.input(homerId);
    }

    public void inputPassword(String password) {
        this.tbPassword.input(password);
    }

    public void clickLoginButton() {
        this.loginButton.click();
    }

    public void loginToHomePage(String homerID, String password) {
        this.inputHomerID(homerID);
        this.inputPassword(password);
        this.clickLoginButton();

    }


}
