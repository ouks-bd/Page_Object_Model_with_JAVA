package CorpNetApp.pom.test.testCompany.TestCases_EFT_Transaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages.EFT_BulkTransactionPageByComMaker;
import CorpNetApp.pom.util.GeneralUtil;
import CorpNetApp.pom.util.MockData;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_BEFT_One_Many_TransferByComMaker extends BaseTest {
    EFT_BulkTransactionPageByComMaker eft_bulkTransactionPageByComMaker;

    public TC_BEFT_One_Many_TransferByComMaker() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        eft_bulkTransactionPageByComMaker = new CompanyUsersLoginPage().CompMCUserLogin(getTranMCUser(), getTranMakerPass()).clickBulkOneToManyEFT();

    }
    @Test
    public void success_EFT_Single_Many_Transaction_initiate(ITestContext context) throws InterruptedException {
        eft_bulkTransactionPageByComMaker = eft_bulkTransactionPageByComMaker
                .selectAccountNo(0)
                .uploadIFTFile()
                .fillRemarks("EFT_One_To_Many")
                .clickUploadBtn()
                .clickConfirmBtn();

        String eftTrxReferenceNumber = eft_bulkTransactionPageByComMaker.EftBatchRef;
        context.setAttribute("EftTrxReferenceNumber",eftTrxReferenceNumber);
        System.out.println("Successfully upload the EFT One To Many Transaction, Transaction Batch Id :- " + eftTrxReferenceNumber);
        MockData mockData = new MockData();
        mockData.updateToExcel(9,eftTrxReferenceNumber);
        Thread.sleep(5000);


    }
    @AfterMethod
    public void TearDown(){
        GeneralUtil.waitForDomStable();
        driver.quit();
    }


}
