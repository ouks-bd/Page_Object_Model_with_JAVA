package CorpNetApp.pom.test.testCompany.TestCases_Pay_Order;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages.PO_Issuance_SinglePageByComMaker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_PO_Issuance_Single_BeneficiaryTranByMaker extends BaseTest {
    PO_Issuance_SinglePageByComMaker poIssuanceSinglePageByComMaker;

    public TC_PO_Issuance_Single_BeneficiaryTranByMaker() {
        super();
    }

    @BeforeMethod
    public void SetUP() {
        initialization();

        poIssuanceSinglePageByComMaker = new CompanyUsersLoginPage().CompMCUserLogin(getTranMCUser(), getTranMakerPass()).clickPOSingleMenu();

    }

    @Test(priority = 1)
    public void initiate_POSingle_TranShouldSuccess(ITestContext context) throws InterruptedException {
        poIssuanceSinglePageByComMaker = poIssuanceSinglePageByComMaker
                .selectComAcc(0)
                .selectBeneficiary(1)
                .selectBearer(1)
                .entryAllBeneficiaryData(1)
                .clickConfirmBtn();
        //String Ift_Batch_id = ift1ToManyBulkTransactionPageByComMaker.iftBatch;

        Thread.sleep(5000);

    }

    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }


}
