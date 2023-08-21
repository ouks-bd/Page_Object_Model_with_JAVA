package CorpNetApp.pom.test.testCompany.TestCases_Pay_Order;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Checker_MenuPages.PO_Issuance_CheckerPage;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_PO_Issuance_BulkTranByChecker extends BaseTest {
    PO_Issuance_CheckerPage po_issuance_checkerPage;

    public TC_PO_Issuance_BulkTranByChecker() {
        super();
    }

    @BeforeMethod
    public void SetUP() {
        initialization();

        po_issuance_checkerPage = new CompanyUsersLoginPage().CompMCUserLogin(getTranMCUser(), getTranMakerPass()).clickPOCheckerQueue();

    }

    @Test(priority = 1)
    public void initiate_DD_ThirdParty_TranShouldSuccess(ITestContext context) throws InterruptedException {
        po_issuance_checkerPage = po_issuance_checkerPage
                .searchPORemarks()
                .clickAuthorizeBtn()
                .clickSubmitBtn();
        //String Ift_Batch_id = ift1ToManyBulkTransactionPageByComMaker.iftBatch;

        Thread.sleep(5000);

    }

    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }


}
