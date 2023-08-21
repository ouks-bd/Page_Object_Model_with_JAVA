package CorpNetApp.pom.test.testCompany.TestCases_IFTTransaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Approver_MenuPages.IFT_TransactionPageByComApprove;
import CorpNetApp.pom.util.GeneralUtil;
import CorpNetApp.pom.util.MockData;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_IFT_Single_Bulk_Approve_TransferByComApprove extends BaseTest {

    IFT_TransactionPageByComApprove ift_transactionPageByComApprove;
    MockData mockData;

    public TC_IFT_Single_Bulk_Approve_TransferByComApprove() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        mockData = new MockData();
        ift_transactionPageByComApprove = new CompanyUsersLoginPage().CompApproveUserLogin(getTranCompApproveUser(), getTranMakerPass()).clickIFTApproveQueue();

    }

    @Test
    public void Approve_IFT_1_Many_TranSuccess(ITestContext context) throws InterruptedException {

        String iftRef = (String) context.getAttribute("ift1to1TrxReferenceNumber");
            ift_transactionPageByComApprove = ift_transactionPageByComApprove
                    .searchIFTBatchId(iftRef)
                    .clickApproveBtn()
                    .inputTokenNumber()
                    .clickApproveTokenBtn()
                    .clickYesBtn();



            System.out.println("Successfully get Approve Transaction Batch ID , Transaction Batch Id :- " + ift_transactionPageByComApprove.iftChBatch);
            MockData mockData=new MockData();
            mockData.updateToExcel(3,iftRef);

            Thread.sleep(10000);
        }


    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
