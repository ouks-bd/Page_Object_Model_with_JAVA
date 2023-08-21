package CorpNetApp.pom.test.testOperation.TestCases_UserManagement;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.OPS_UsersLoginPage;
import CorpNetApp.pom.page.operation_Checker_MenuPages.ApproveComUnAuthorizeUserPageByChecker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_AuthorizedComTransactionApproverUserByOps_Checker extends BaseTest {
    ApproveComUnAuthorizeUserPageByChecker approveComUnAuthorizeUserPageByChecker;

    public TC_AuthorizedComTransactionApproverUserByOps_Checker() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        approveComUnAuthorizeUserPageByChecker = new OPS_UsersLoginPage().loginCorp(getUsername(),getPassword()).clickUnAuthorizedUserList();
    }



   @Test
    public void ApproveApproverUserSuccess() throws InterruptedException {
        approveComUnAuthorizeUserPageByChecker = approveComUnAuthorizeUserPageByChecker
                .selectCompany()
                .checkUnAuthorizedCheckBox()
                .clickDetailsBtn()
                .clickAuthorizeBtn();
        Thread.sleep(5000);
    }
    @AfterMethod
    public void TearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
