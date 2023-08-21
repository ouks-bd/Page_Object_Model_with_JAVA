package CorpNetApp.pom.test.testOperation.TestCases_CompanyManagement.TestCases_CreateAccount;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.OPS_UsersLoginPage;
import CorpNetApp.pom.page.operation_Checker_MenuPages.ApproveComAccountPageByChecker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_ApproveCompanyAccount extends BaseTest {

    ApproveComAccountPageByChecker approveComAccountPageByChecker;

    public TC_ApproveCompanyAccount() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        approveComAccountPageByChecker = new OPS_UsersLoginPage().loginCorp(getUsername(), getPassword()).clickCompanyAccountManageMenuForApprove();
    }

    @Test
    public void approveCompanyAccountSuccess(ITestContext context) throws InterruptedException {

      //  String CompanyName = (String) context.getAttribute("NewCompanyName");
        approveComAccountPageByChecker = approveComAccountPageByChecker
                .clickCheckBoxForWaitingApprove()
                .searchCompany(getCompanyName())
                .clickDetailBtnAndCheckBoxForAll()
                .clickApproveBtn();
        Thread.sleep(1000);
    }
    @AfterMethod
    public void TearDown(){
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
