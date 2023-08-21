package CorpNetApp.pom.test.testCompany.TestCases_EFT_Transaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages.EFT_BulkTransactionPageByComMaker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_BEFT_Many_Many_TransferByComMaker extends BaseTest {
    EFT_BulkTransactionPageByComMaker eft_bulkTransactionPageByComMaker;

    public TC_BEFT_Many_Many_TransferByComMaker() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        eft_bulkTransactionPageByComMaker = new CompanyUsersLoginPage().CompMCUserLogin(getTranMCUser(), getTranMakerPass()).clickBulkOneToManyEFT();

    }
    @Test
    public void success_EFT_Many_Many_Transaction_initiate(ITestContext context) throws InterruptedException {
        eft_bulkTransactionPageByComMaker = eft_bulkTransactionPageByComMaker
                .selectAccountNo(0)
                .uploadIFTMultiFile()
                .fillRemarks("EFT_Many_To_Many")
                .clickRadioMulti()
                .clickUploadBtn()
                .clickConfirmBtn();

        String eftTrxReferenceNumber = eft_bulkTransactionPageByComMaker.EftBatchRef;
        context.setAttribute("EftTrxReferenceNumber",eftTrxReferenceNumber);
        System.out.println("Successfully upload the EFT One To Many Transaction, Transaction Batch Id :- " + eftTrxReferenceNumber);
        Thread.sleep(10000);

    }
    @AfterMethod
    public void TearDown(){
        GeneralUtil.waitForDomStable();
        driver.quit();
    }


}
