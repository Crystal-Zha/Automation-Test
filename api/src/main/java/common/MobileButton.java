package common;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;

public class MobileButton extends CustomMobileElement {
    protected MobileButton(WebElement element) {
        super(element);
    }

    protected MobileElement getElement() {
        return (MobileElement) getWrappedElement();
    }

    public void click() {
        getElement().click();
    }

}
