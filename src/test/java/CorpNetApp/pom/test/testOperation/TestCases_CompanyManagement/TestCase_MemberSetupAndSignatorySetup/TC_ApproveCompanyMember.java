package CorpNetApp.pom.test.testOperation.TestCases_CompanyManagement.TestCase_MemberSetupAndSignatorySetup;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.OPS_UsersLoginPage;
import CorpNetApp.pom.page.operation_Checker_MenuPages.MemberSummaryPageForApproveByChecker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_ApproveCompanyMember extends BaseTest {
    MemberSummaryPageForApproveByChecker memberSummaryPageForApproveByChecker;

    public TC_ApproveCompanyMember() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        memberSummaryPageForApproveByChecker = new OPS_UsersLoginPage().loginCorp(getUsername(), getPassword()).clickMemberSummary();
    }

    @Test(priority = 3)
    public void approveComMemberApproveSuccess() throws InterruptedException {
        memberSummaryPageForApproveByChecker = memberSummaryPageForApproveByChecker
                .clickSearchBtn()
                .clickUnAuthorizeCheckBox()
                .clickDetailsBtn()
                .checkAllCompany()
                .clickSubBtn();

        Thread.sleep(5000);
    }
  @Test(priority = 4)
    public void approveGroup_B_ComMemberApproveSuccess() throws InterruptedException {
        memberSummaryPageForApproveByChecker = memberSummaryPageForApproveByChecker
                .clickSearchBtn()
                .clickUnAuthorizeCheckBox()
                .clickDetailsBtn()
                .checkAllCompany()
                .clickSubBtn();

        Thread.sleep(5000);
    }

    @AfterMethod
    public void TearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
