package CorpNetApp.pom.test.testOperation.TestCases_CompanyManagement.TestCases_CreateSignatoryRules;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.OPS_UsersLoginPage;
import CorpNetApp.pom.page.operation_Maker_MenuPages.Create_Simple_SignatoryRulesFor_Payroll;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC__CreateSimpleSignatoryRulesForPayrollWithValidData extends BaseTest {

    Create_Simple_SignatoryRulesFor_Payroll create_simple_signatoryRulesFor_payroll;

    public TC__CreateSimpleSignatoryRulesForPayrollWithValidData() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        create_simple_signatoryRulesFor_payroll = new OPS_UsersLoginPage().loginCorp(getMakerUser(), getMakerPass()).SimpleSignatoryRuleMenu();
    }

    @Test

    public void CreateSimpleSignatoryRulesSuccess() throws InterruptedException {
        create_simple_signatoryRulesFor_payroll = create_simple_signatoryRulesFor_payroll
                .selectCompany()
                .signatoryNumber()
                .paymentMedia()
                .lowerlimit()
                .upperlimit()
                .transactionRule()
                .transactionNumber()
                .createButton();

        Thread.sleep(10000);

    }

    @AfterMethod
    public void TearDown() {

        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
