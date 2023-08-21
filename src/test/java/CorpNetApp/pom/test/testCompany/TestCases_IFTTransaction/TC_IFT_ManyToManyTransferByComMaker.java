package CorpNetApp.pom.test.testCompany.TestCases_IFTTransaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages.IFT1ToManyBulkTransactionPageByComMaker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_IFT_ManyToManyTransferByComMaker extends BaseTest {
    IFT1ToManyBulkTransactionPageByComMaker ift1ToManyBulkTransactionPageByComMaker;

    public TC_IFT_ManyToManyTransferByComMaker() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        ift1ToManyBulkTransactionPageByComMaker = new CompanyUsersLoginPage().CompMCUserLogin(getTranMCUser(), getTranMakerPass()).ClickBulkIFT();
    }

    @Test
    public void initiateIFT_Many_Many_TranSuccess(ITestContext context) throws InterruptedException {

        ift1ToManyBulkTransactionPageByComMaker = ift1ToManyBulkTransactionPageByComMaker

                .selectAccountNo(0)
                .uploadIFTMultiFile()
                .fillRemarks("IFT_ManyToMany_Transaction")
                .clickRadioMulti()
                .clickUploadBtn()
               .clickConfirmBtn();
        // IFT1ToManyBulkTransactionPageByComMaker batchId = new IFT1ToManyBulkTransactionPageByComMaker();
        String IFT1to1TrxReferenceNumber = ift1ToManyBulkTransactionPageByComMaker.iftBatch;
        context.setAttribute("ift1to1TrxReferenceNumber", IFT1to1TrxReferenceNumber);
        System.out.println("Successfully upload the IFT One To Many Transaction, Transaction Batch Id :- " + IFT1to1TrxReferenceNumber);
        Thread.sleep(10000);

    }

    @AfterMethod
    public void TearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }

}
