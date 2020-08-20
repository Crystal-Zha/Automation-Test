package common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.Widget;
import org.openqa.selenium.WebElement;

import static org.slf4j.MDC.clear;

public class MobileTextBox extends CustomMobileElement {

    protected MobileTextBox(WebElement element) {
        super(element);
    }

    protected MobileElement getElement(){
        return (MobileElement) getWrappedElement();
    }

    public void click(){
        getElement().click();
    }

    public void input(String value){
        clear();
        getElement().sendKeys(value);
    }

    public String getText(){
        return getElement().getText();
    }

    public void clear(){
        getElement().clear();
    }
}
