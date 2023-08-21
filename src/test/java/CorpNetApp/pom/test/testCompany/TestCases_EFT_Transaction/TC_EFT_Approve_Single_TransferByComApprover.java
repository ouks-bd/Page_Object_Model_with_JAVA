package CorpNetApp.pom.test.testCompany.TestCases_EFT_Transaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Approver_MenuPages.EFT__Single_TransactionPageByComApprove;
import CorpNetApp.pom.util.GeneralUtil;
import CorpNetApp.pom.util.MockData;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_EFT_Approve_Single_TransferByComApprover extends BaseTest {

    EFT__Single_TransactionPageByComApprove eft__single_transactionPageByComApprove;

    public TC_EFT_Approve_Single_TransferByComApprover() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();

        eft__single_transactionPageByComApprove = new CompanyUsersLoginPage().CompApproveUserLogin(getTranCompApproveUser(), getTranMakerPass()).clickSingleEFTApproveQueue();

    }

    @Test
    public void Approve_EFT_Single_TranSuccess(ITestContext context) throws InterruptedException {

       // String eftSingleRef = (String) context.getAttribute("singleEftTrxReferenceNumber");
        String eftSingleRef = (String) context.getAttribute("singleEftTrxReferenceNumber");

        System.out.println("Successfully get Approve Transaction Batch ID , Transaction Batch Id :- " + eftSingleRef);
        eft__single_transactionPageByComApprove = eft__single_transactionPageByComApprove
                .searchIFTBatchId(eftSingleRef)
                .clickApproveBtn()
                .clickOkkBtn()
                .inputTokenNumber()
                .clickApproveTokenBtn()
                .clickYesBtn();

        System.out.println("Successfully get Approve Transaction Batch ID , Transaction Batch Id :- " + eftSingleRef);
        MockData mockData=new MockData();
        mockData.updateToExcel(8,eftSingleRef);
        Thread.sleep(10000);
    }


    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }

}
