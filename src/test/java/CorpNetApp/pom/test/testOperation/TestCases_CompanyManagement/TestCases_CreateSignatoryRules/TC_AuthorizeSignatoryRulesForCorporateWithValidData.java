package CorpNetApp.pom.test.testOperation.TestCases_CompanyManagement.TestCases_CreateSignatoryRules;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.OPS_UsersLoginPage;
import CorpNetApp.pom.page.operation_Checker_MenuPages.TransactionRuleSummaryPageByChecker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_AuthorizeSignatoryRulesForCorporateWithValidData extends BaseTest {

    TransactionRuleSummaryPageByChecker transactionRuleSummaryPageByChecker;

    public TC_AuthorizeSignatoryRulesForCorporateWithValidData() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        transactionRuleSummaryPageByChecker = new OPS_UsersLoginPage().loginCorp(getUsername(), getPassword()).clickSignatorySummaryMenu();
    }

    @Test
    public void AuthorizeComplexSignatoryRulesForCorporate() throws InterruptedException {
        transactionRuleSummaryPageByChecker = transactionRuleSummaryPageByChecker
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
