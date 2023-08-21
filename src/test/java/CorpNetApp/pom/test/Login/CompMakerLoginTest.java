package CorpNetApp.pom.test.Login;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.deshboard.DashboardPageCrop;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CompMakerLoginTest extends BaseTest {

    DashboardPageCrop dashboardPageCrop;
    CompanyUsersLoginPage compMakerLoginTest;

    public CompMakerLoginTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {

        initialization();
        compMakerLoginTest = new CompanyUsersLoginPage();
    }

    @Test
    public void loginShouldCompMakerSucceed() {
        dashboardPageCrop = compMakerLoginTest.CompMCUserLogin(getTranMCUser(), getTranMakerPass());

        Assert.assertTrue(dashboardPageCrop.hasLogoutLink());
    }

    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();


    }
}
