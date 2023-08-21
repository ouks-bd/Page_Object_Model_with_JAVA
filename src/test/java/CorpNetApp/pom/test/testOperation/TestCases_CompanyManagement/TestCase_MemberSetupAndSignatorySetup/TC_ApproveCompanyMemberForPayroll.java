package CorpNetApp.pom.test.testOperation.TestCases_CompanyManagement.TestCase_MemberSetupAndSignatorySetup;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.OPS_UsersLoginPage;
import CorpNetApp.pom.page.operation_Checker_MenuPages.ApproveMemberSummaryPageForPayroll;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_ApproveCompanyMemberForPayroll extends BaseTest {
    ApproveMemberSummaryPageForPayroll approveMemberSummaryPageForPayroll;

    public TC_ApproveCompanyMemberForPayroll() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        approveMemberSummaryPageForPayroll = new OPS_UsersLoginPage().loginCorp(getUsername(), getPassword()).clickPayrollMemberSummaryMenu();
    }

    @Test(priority = 5)
    public void approveComMemberForPayrollSuccess() throws InterruptedException {
        approveMemberSummaryPageForPayroll = approveMemberSummaryPageForPayroll
                .clickOnUnAuthorize()
                .clickOnDetails()
                .clickOnAllButton()
                .clickOnSubmitButton();

        Thread.sleep(5000);
    }

    @Test(priority = 6)
    public void approveComMemberBForPayrollSuccess() throws InterruptedException {
        approveMemberSummaryPageForPayroll = approveMemberSummaryPageForPayroll
                .clickOnUnAuthorize()
                .clickOnDetails()
                .clickOnAllButton()
                .clickOnSubmitButton();

        Thread.sleep(5000);
    }

    @AfterMethod
    public void TearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
