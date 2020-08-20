package page;

import common.MobileTextBox;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import server.appium.AppiumDriverFactory;

public class LoginPage {

    //homerID
    //@AndroidFindBy = driver.findElementById
    @AndroidFindBy(id = "cz.adastragrp.hccn:id/email")
    private MobileTextBox homerID;


    @AndroidFindBy(id = "cz.adastragrp.hccn:id/password")
    private MobileTextBox password;

    @AndroidFindBy(id = "cz.adastragrp.hccn:id/btn_login")
    private MobileTextBox loginButton;

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


    public void inputHomerID(String homerID) {
        this.homerID.click();
        this.homerID.input(homerID);
    }

    public void inputPassword(String password) {
        this.password.input(password);
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
