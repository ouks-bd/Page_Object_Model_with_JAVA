package CorpNetApp.pom.test.testCompany.TestCases_EFT_Transaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Approver_MenuPages.EFT_TransactionPageByComApprove;
import CorpNetApp.pom.util.GeneralUtil;
import CorpNetApp.pom.util.MockData;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_EFT_1_Many_Approve_TransferByComApprover extends BaseTest {

    EFT_TransactionPageByComApprove eft_transactionPageByComApprove;
    MockData mockData;

    public TC_EFT_1_Many_Approve_TransferByComApprover() {
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        eft_transactionPageByComApprove = new CompanyUsersLoginPage().CompApproveUserLogin(getTranCompApproveUser(), getTranMakerPass()).clickEFTBulkApproveQueue();

    }

    @Test
    public void Approve_EFT_1_Many_TranSuccess(ITestContext context) throws InterruptedException {

        String EftRef = (String) context.getAttribute("EftTrxReferenceNumber");
        System.out.println("Successfully get Approve Transaction Batch ID , Transaction Batch Id :- " + EftRef);

        eft_transactionPageByComApprove = eft_transactionPageByComApprove
                .searchIFTBatchId(EftRef)
                .clickApproveBtn()
                .clickOkkBtn()
                .inputTokenNumber()
                .clickApproveTokenBtn()
                .clickYesBtn();


        System.out.println("Successfully get Approve Transaction Batch ID , Transaction Batch Id :- " + EftRef);
        MockData mockData = new MockData();
        mockData.updateToExcel(9, EftRef);
        Thread.sleep(10000);
    }


    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
