package CorpNetApp.pom.test.testCompany.TestCases_DD_Transaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages.DD_Transaction_Page_ByComMaker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TC_DD_Others_TransferByComMaker extends BaseTest {


    DD_Transaction_Page_ByComMaker dd_transaction_page_byComMaker;

    public TC_DD_Others_TransferByComMaker() {
        super();
    }

    @BeforeMethod
    public void SetUP() {
        initialization();

        dd_transaction_page_byComMaker = new CompanyUsersLoginPage().CompMCUserLogin(getTranMCUser(), getTranMakerPass()).clickDDThirdPartyTransfer();

    }

    @Test(priority = 0)
    public void initiate_DD_ThirdParty_TranShouldSuccess(ITestContext context) throws InterruptedException {
        //String Ift_Batch_id = ift1ToManyBulkTransactionPageByComMaker.iftBatch;


        dd_transaction_page_byComMaker = dd_transaction_page_byComMaker

                .selectAccountNo(0)
                .uploadDDOthersIFTFile()
                .fillRemarks("DD_ThirdParty_Transaction")
                .clickUploadBtn()
                .clickConfirmBtn();
        // IFT1ToManyBulkTransactionPageByComMaker batchId = new IFT1ToManyBulkTransactionPageByComMaker();
        String DDTransactionBatchRefNo = dd_transaction_page_byComMaker.DDBatchRefNo;
        context.setAttribute("DDTranBatchRefNo", DDTransactionBatchRefNo);
        System.out.println("Successfully upload DD Bulk Transaction, DD Transaction Batch Id :- " + DDTransactionBatchRefNo);

        Thread.sleep(1000);

    }

    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }


}
