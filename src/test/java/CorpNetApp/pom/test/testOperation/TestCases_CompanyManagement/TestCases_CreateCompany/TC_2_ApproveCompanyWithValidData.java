package CorpNetApp.pom.test.testOperation.TestCases_CompanyManagement.TestCases_CreateCompany;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.OPS_UsersLoginPage;
import CorpNetApp.pom.page.operation_Checker_MenuPages.UnauthorizedCompaniesPageByChecker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_2_ApproveCompanyWithValidData extends BaseTest {

    UnauthorizedCompaniesPageByChecker unauthorizedCompaniesPageByChecker;
    public TC_2_ApproveCompanyWithValidData(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        initialization();
        unauthorizedCompaniesPageByChecker=new OPS_UsersLoginPage().loginCorp(getUsername(),getPassword()).clickUnAuthorizedCompany();
    }
    @Test
    public void unauthorizedCompanyAuthorizeSuccess(ITestContext context) throws InterruptedException {
        String CompanyName = (String) context.getAttribute("NewCompanyName");
        unauthorizedCompaniesPageByChecker =unauthorizedCompaniesPageByChecker
                .searchCompany(getCompanyName())
                .clickDetailsBtn()
                .clickSubBtn();
        Thread.sleep(5000);
    }

    @AfterMethod
    public void TearDown(){

        GeneralUtil.waitForDomStable();
        driver.quit();
    }

}
