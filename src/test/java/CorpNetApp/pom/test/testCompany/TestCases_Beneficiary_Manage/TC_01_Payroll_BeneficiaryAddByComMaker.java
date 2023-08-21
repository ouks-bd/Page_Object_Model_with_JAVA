package CorpNetApp.pom.test.testCompany.TestCases_Beneficiary_Manage;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.Company_Beneficiary_Management.Add_Beneficiary_Page;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_01_Payroll_BeneficiaryAddByComMaker extends BaseTest {

    Add_Beneficiary_Page _add_beneficiary_page;

    public TC_01_Payroll_BeneficiaryAddByComMaker(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        initialization();
        _add_beneficiary_page =new CompanyUsersLoginPage().CompMCUserLogin(getTranMCUser(),getTranMakerPass()).clickPayrollBeneficiaryMenu();
    }
    @Test
    public void addPayrollBeneficiarySuccess() throws InterruptedException {
        _add_beneficiary_page = _add_beneficiary_page
                .fillBeneficiaryInfo()
                .clickBtn();

        Thread.sleep(10000);

    }
    @AfterMethod
    public void TearDown(){
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
