package CorpNetApp.pom.test.testCompany.TestCases_Pay_Order;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages.BulkPayOrderTransactionPageByComMaker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_PO_Single_Bulk_TransactionByMaker extends BaseTest {
    BulkPayOrderTransactionPageByComMaker bulkPayOrderTransactionPageByComMaker;

    public TC_PO_Single_Bulk_TransactionByMaker() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        bulkPayOrderTransactionPageByComMaker = new CompanyUsersLoginPage().CompMCUserLogin(getTranMCUser(), getMakerPass()).clickPOBulkMenu();
    }

    @Test
    public void initiateSingleBulkPayOrderTransactionSuccess(ITestContext context) throws InterruptedException {


        bulkPayOrderTransactionPageByComMaker = bulkPayOrderTransactionPageByComMaker
                .fileUpload()
                .fillRemarks()
                .selectBearer(1)
                .selectDeliveryLocation(1)
                .clickUploadBtn()
                .clickConfirmBtn();
        String POSingleBulkRefNo=bulkPayOrderTransactionPageByComMaker.PORefNumber;
        context.setAttribute("poTranRefNo",POSingleBulkRefNo);
        System.out.println("Successfully upload the PO Transaction, Transaction Batch Id :- " + POSingleBulkRefNo);

        Thread.sleep(10000);
    }

    @AfterMethod
    public void TearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }

}
