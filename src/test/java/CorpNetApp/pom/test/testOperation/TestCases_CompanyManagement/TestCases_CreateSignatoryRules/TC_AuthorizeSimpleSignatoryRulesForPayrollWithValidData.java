package CorpNetApp.pom.test.testOperation.TestCases_CompanyManagement.TestCases_CreateSignatoryRules;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.OPS_UsersLoginPage;
import CorpNetApp.pom.page.operation_Checker_MenuPages.TransactionRuleSummaryPageForPayrollByChecker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_AuthorizeSimpleSignatoryRulesForPayrollWithValidData extends BaseTest {

    TransactionRuleSummaryPageForPayrollByChecker transactionRuleSummaryPageForPayrollByChecker;

    public TC_AuthorizeSimpleSignatoryRulesForPayrollWithValidData() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        transactionRuleSummaryPageForPayrollByChecker = new OPS_UsersLoginPage().loginCorp(getUsername(), getPassword()).clickSimpleSignatoryAuthMenu();
    }

    @Test
    public void AuthorizeSimpleSignatoryRulesForPayroll() throws InterruptedException {
        transactionRuleSummaryPageForPayrollByChecker = transactionRuleSummaryPageForPayrollByChecker
                .checkUnAuthorizeBox()
                .searchCompany(getCompanyName())
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
