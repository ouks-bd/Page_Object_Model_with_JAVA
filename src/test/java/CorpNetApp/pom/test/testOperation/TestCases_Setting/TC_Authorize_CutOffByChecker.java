package CorpNetApp.pom.test.testOperation.TestCases_Setting;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.OPS_UsersLoginPage;
import CorpNetApp.pom.page.operation_Checker_MenuPages.UnAuthorizeCutOffTimeByCheckerPage;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_Authorize_CutOffByChecker extends BaseTest {

    UnAuthorizeCutOffTimeByCheckerPage unAuthorizeCutOffTimeByCheckerPage;

    public TC_Authorize_CutOffByChecker() {
        PageFactory.initElements(driver, this);
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        unAuthorizeCutOffTimeByCheckerPage = new OPS_UsersLoginPage().loginCorp(getUsername(), getPassword()).clickUnAuthCutOffEl();
    }

    @Test
    public void authorizeCutOffTimeSuccess() throws InterruptedException {
        unAuthorizeCutOffTimeByCheckerPage = unAuthorizeCutOffTimeByCheckerPage
                .searchUnAuth()
                .clickBtn();
        Thread.sleep(6000);


    }

    @AfterMethod
    public void TearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
