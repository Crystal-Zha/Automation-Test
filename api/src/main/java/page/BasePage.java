package page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected AppiumDriver<MobileElement> driver;
    public BasePage(AppiumDriver<MobileElement> driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }


    protected final <T> T initPage(Class<T> pageClass){
        T newPage = PageFactory.initElements(driver,pageClass);
        return newPage;
    }


}
