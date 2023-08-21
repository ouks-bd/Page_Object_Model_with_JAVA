package CorpNetApp.pom.test.testCompany.TestCases_RTGS_Transaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages.RTGS_BulkTransactionPageByComMaker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_RTGS_Bulk_TransferByComMaker extends BaseTest {


    RTGS_BulkTransactionPageByComMaker rtgs_bulkTransactionPageByComMaker;

    public TC_RTGS_Bulk_TransferByComMaker() {
        super();
    }

    @BeforeMethod
    public void SetUP() {

        initialization();

        rtgs_bulkTransactionPageByComMaker = new CompanyUsersLoginPage().CompMakerLogin(getTranMCUser(), getTranMakerPass()).ClickBulkRTGS();
    }

    @Test(priority = 0)
    public void initiate_RTGS_Bulk_TranSuccess(ITestContext context) throws InterruptedException, IOException {
        rtgs_bulkTransactionPageByComMaker = rtgs_bulkTransactionPageByComMaker
                .selectAccountNo(0)
                .uploadIFTFile()
                .fillRemarks("RTGS_Bulk_Transaction")
                .clickUploadBtn()
                .clickConfirmBtn();

        String RTGSTrxReferenceNumber = rtgs_bulkTransactionPageByComMaker.rtgsBatchRef;

        context.setAttribute("rtgsTrxReferenceNumber", RTGSTrxReferenceNumber);
        System.out.println("Successfully upload the IFT One To Many Transaction, Transaction Batch Id :- " + RTGSTrxReferenceNumber);


        Thread.sleep(5000);
    }

    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}