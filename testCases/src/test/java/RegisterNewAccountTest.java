import org.testng.annotations.Test;
import page.LoginPage;

public class RegisterNewAccountTest extends BaseTest {

    @Test
    public void RegisterNewAccount() throws InterruptedException{
        //用例名称：注册新账号
        LoginPage loginPage = new LoginPage(driver);
        loginPage.registerNewAccount("test003@gmail.com","123456","123456");

    }


}
