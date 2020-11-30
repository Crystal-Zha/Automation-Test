package page;

import common.MobileButton;
import common.MobileTextBox;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DeviceHomePage extends BasePage {

    //账户头像
    @AndroidFindBy(id = "com.ihealthlabs.MyVitalsPro:id/circle_iv_profile")
    private MobileElement accountPhotos;

    //身高
    @AndroidFindBy(id = "com.ihealthlabs.MyVitalsPro:id/tv_height")
    private MobileElement height;

    //体重
    @AndroidFindBy(id = "com.ihealthlabs.MyVitalsPro:id/tv_weight")
    private MobileElement weight;

    //"+"符号
    @AndroidFindBy(id = "com.ihealthlabs.MyVitalsPro:id/iv_add_device")
    private MobileButton tbAddDevice;

    //我的设备
    @AndroidFindBy(id = "com.ihealthlabs.MyVitalsPro:id/tv_my_devices")
    private MobileElement myDevices;

    //Select new device 按钮：
    @AndroidFindBy(id = "com.ihealthlabs.MyVitalsPro:id/tv_add_device")
    private MobileButton selectNewDevice;

    //去商城
    @AndroidFindBy(id = "com.ihealthlabs.MyVitalsPro:id/tv_buy_more_device")
    private MobileButton buyDevice;



    public DeviceHomePage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }




}
