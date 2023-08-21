package CorpNetApp.pom.test.testCompany.TestCases_IFTTransaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.deshboard.DashboardPageCrop;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Approver_MenuPages.IFT__Single_TransactionPageByComApprove;
import CorpNetApp.pom.util.GeneralUtil;
import CorpNetApp.pom.util.MockData;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_IFT_Approve_Single_TransferByComApprover extends BaseTest {

    IFT__Single_TransactionPageByComApprove ift__single_transactionPageByComApprove;
    DashboardPageCrop dashboardPageCrop;

    public TC_IFT_Approve_Single_TransferByComApprover() {
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        ift__single_transactionPageByComApprove = new CompanyUsersLoginPage().CompApproveUserLogin(getTranCompApproveUser(), getTranMakerPass()).clickSingleIFTApproveQueue();
        Thread.sleep(10000);
    }

    @Test
    public void Approve_IFT_Single_TranSuccess(ITestContext context) throws InterruptedException {

        String iftRef = (String) context.getAttribute("singleIftTrxReferenceNumber");

        System.out.println("Successfully get Approve Transaction Batch ID , Transaction Batch Id :- " + iftRef);
        ift__single_transactionPageByComApprove = ift__single_transactionPageByComApprove
                .searchIFTBatchId(iftRef)
                .clickApproveBtn()
                .inputTokenNumber()
                .clickApproveTokenBtn()
                .clickYesBtn();

        System.out.println("Successfully get Approve Transaction Batch ID , Transaction Batch Id :- " + iftRef);
        MockData mockData = new MockData();
        mockData.updateToExcel(2, iftRef);
        Thread.sleep(10000);
    }


    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }

}
