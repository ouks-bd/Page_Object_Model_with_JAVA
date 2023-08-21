package CorpNetApp.pom.test.Login;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.deshboard.Ops_DashboardPageCrop;
import CorpNetApp.pom.page.LoginPage.OPS_MakerLoginPage;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MakerLoginTest extends BaseTest {
    Ops_DashboardPageCrop ops_dashboardPageCrop;
    OPS_MakerLoginPage makerLoginCrop;

    public MakerLoginTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        makerLoginCrop = new OPS_MakerLoginPage();
        //loginPageCorp = new LoginPageCorp();
    }

    @Test
    public void loginShouldSucceed() {
        // dashboardPage=loginPageCorp.loginCorp(getUsername(),getPassword());
        ops_dashboardPageCrop =makerLoginCrop.MakerLoginCorp(getMakerUser(),getMakerPass());
       // dashboardPageCrop=loginPageCorp.loginCorp(getUsername(),getPassword());

        //dashboardPage = loginPage.login(getUsername(), getPassword());
        Assert.assertTrue(ops_dashboardPageCrop.hasLogoutLink());
    }

    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}

