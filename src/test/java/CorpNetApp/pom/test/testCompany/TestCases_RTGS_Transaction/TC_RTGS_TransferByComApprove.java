package CorpNetApp.pom.test.testCompany.TestCases_RTGS_Transaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Approver_MenuPages.RTGS_BulkTransactionPageByComApprover;
import CorpNetApp.pom.util.GeneralUtil;
import CorpNetApp.pom.util.MockData;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_RTGS_TransferByComApprove extends BaseTest {
    RTGS_BulkTransactionPageByComApprover rtgs_bulkTransactionPageByComApprover;
    public TC_RTGS_TransferByComApprove() {
        super();
    }

    @BeforeMethod
    public void SetUP() throws InterruptedException {

        initialization();

        rtgs_bulkTransactionPageByComApprover = new CompanyUsersLoginPage().CompMakerLogin(getTranCompApproveUser(), getTranMakerPass()).clickRTGSBulkApproveQueue();

    }
    @Test(priority = 0)
    public void Rtgs_ApproveByApprover(ITestContext context) throws InterruptedException {

        String rtgsRef = (String) context.getAttribute("rtgsTrxReferenceNumber");

        rtgs_bulkTransactionPageByComApprover = rtgs_bulkTransactionPageByComApprover
                .searchIFTBatchId(rtgsRef)
                .clickAuthorised()
                .inputTokenNumber()
                .clickApproveBtn()
                .clickOkButton();

        MockData mockData=new MockData();
        mockData.updateToExcel(15,rtgsRef);

        System.out.println("Successfully get Approve Transaction Batch ID , Transaction Batch Id :- " + rtgsRef);
        Thread.sleep(10000);
    }

    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
