package server.appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriverFactory {

//    protected AppiumDriverLocalService service;
//
//    private AppiumServiceBuilder builder;
//
    protected DesiredCapabilities cap;
//
//    public void startServer(){
//        cap = new DesiredCapabilities();
//        cap.setCapability("noRest","false");
//
//        //Build the Appium service
//        builder = new AppiumServiceBuilder();
//        builder.withIPAddress("127.0.0.1");
//        builder.usingPort(4723);
//        builder.withCapabilities(cap);
//        builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
//        builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");
//
//        //Start the server with the builder
//        service = AppiumDriverLocalService.buildService(builder);
//        service.start();
//    }
//
//    public void stopServer(){
//        service.stop();
//    }
//
//    public boolean checkIfServerIsRunnning(int port) {
//
//        boolean isServerRunning = false;
//        ServerSocket serverSocket;
//        try {
//            serverSocket = new ServerSocket(port);
//            serverSocket.close();
//        } catch (IOException e) {
////If control comes here, then it means that the port is in use
//            isServerRunning = true;
//        } finally {
//            serverSocket = null;
//        }
//        return isServerRunning;
//    }
//
//    public static void main(String[] args) {
//        AppiumDriverFactory appiumServer = new AppiumDriverFactory();
//
//        int port = 4723;
//        if (!appiumServer.checkIfServerIsRunnning(port)) {
//            appiumServer.startServer();
//            appiumServer.stopServer();
//        } else {
//            System.out.println("Appium Server already running on Port - " + port);
//        }
//
//    }

    public AndroidDriver<MobileElement> getDriver() throws MalformedURLException {
        //1.创建配置对象
        cap = new DesiredCapabilities();
        //2.往配置对象添加配置
        //deviceName:找到测试的设备
        cap.setCapability("deviceName", "UYT0217A10002648");
        //platformName:测试平台Android或者IOS
        cap.setCapability("platformName", "Android");
        //appPackage: app的包名
        cap.setCapability("appPackage", "com.ihealthlabs.MyVitalsPro");
        //自动化引擎
        cap.setCapability("automationName","uiautomator2");
        //appActivity：app启动的入口
        cap.setCapability("appActivity", "com.ihealth.business.common.welcome.WelcomeActivity");

        //3.创建驱动
        //传入2个参数
        //第一个参数：Appium通讯地址
        //第二个参数：配置对象
        AndroidDriver<MobileElement> androidDriver = new AndroidDriver<MobileElement>(
                new URL("http://127.0.0.1:4723/wd/hub"), cap);
        return androidDriver;
    }


}
