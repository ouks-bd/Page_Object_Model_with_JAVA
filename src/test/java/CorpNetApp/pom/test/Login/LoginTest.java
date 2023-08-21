package CorpNetApp.pom.test.Login;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.deshboard.Ops_DashboardPageCrop;
import CorpNetApp.pom.util.GeneralUtil;
import CorpNetApp.pom.page.LoginPage.OPS_UsersLoginPage;
import CorpNetApp.pom.util.MockData;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    Ops_DashboardPageCrop dashboardPageCrop;
    OPS_UsersLoginPage loginPageCorp;

    MockData mockData;

    public LoginTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPageCorp = new OPS_UsersLoginPage();
        mockData = new MockData();
    }

    @Test(priority = 0)
    public void loginShouldSucceed() {
       // dashboardPage=loginPageCorp.loginCorp(getUsername(),getPassword());
       dashboardPageCrop =loginPageCorp.loginCorp(getUsername(),getPassword());

        //dashboardPage = loginPage.login(getUsername(), getPassword());
        Assert.assertTrue(dashboardPageCrop.hasLogoutLink());


    }

    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}

