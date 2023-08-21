package CorpNetApp.pom.test.testOperation.TestCases_Setting;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.OPS_UsersLoginPage;
import CorpNetApp.pom.page.operation_Checker_MenuPages.ChargePageByChecker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_Approve_ChargeSetupByCheckerOps extends BaseTest {

    ChargePageByChecker chargePageByChecker;

    public TC_Approve_ChargeSetupByCheckerOps() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        chargePageByChecker = new OPS_UsersLoginPage().loginCorp(getUsername(), getPassword()).clickChargeApproveMenu();
    }

    @Test

    public void authorizeChargeSetupSuccess() throws InterruptedException {
        chargePageByChecker = chargePageByChecker
                .searchCompany()
                .clickAuthorizeBtn()
                .clickSubmitBtn();
        Thread.sleep(8000);
    }

    @AfterMethod
    public void TearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }

}
