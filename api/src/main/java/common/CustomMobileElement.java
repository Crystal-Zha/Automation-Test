package common;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.Widget;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomMobileElement extends Widget {

    protected Logger logger = LoggerFactory.getLogger(CustomMobileElement.class);

    protected CustomMobileElement(WebElement element) {
        super(element);
    }
    public boolean isDisplayed(){
        return getWrappedElement().isDisplayed();
    }

    protected MobileElement getElement(){
        return (MobileElement) getWrappedElement();
    }
}
