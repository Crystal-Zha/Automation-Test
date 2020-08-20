package page;

import common.MobileTextBox;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends MobileTextBox {

    //homerID
    @AndroidFindBy(id = "cz.adastragrp.hccn:id/email")
    private MobileTextBox homerID;

    @AndroidFindBy(id = "cz.adastragrp.hccn:id/password")
    private MobileTextBox password;

    @AndroidFindBy(id = "cz.adastragrp.hccn:id/btn_login")
    private MobileTextBox loginButton;

    public LoginPage(WebElement element) {
        super(element);
    }


    public void inputHomerID(String homerID){
        this.homerID.click();
        this.homerID.input(homerID);
    }

    public void inputPassword(String password){
        this.password.input(password);
    }

    public void clickLoginButton(){
        this.loginButton.click();
    }

    public void loginToHomePage(String homerID, String password){
        this.inputHomerID(homerID);
        this.inputPassword(password);
        this.clickLoginButton();

    }




}
