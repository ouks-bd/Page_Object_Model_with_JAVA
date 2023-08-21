package CorpNetApp.pom.test.testCompany.TestCases_Universal_Account_Transaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Approver_MenuPages.Special__Auth_TransactionPageByComApprove;
import CorpNetApp.pom.util.GeneralUtil;
import CorpNetApp.pom.util.MockData;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_Sp_Auth_Own_Account_TransferByComApprove extends BaseTest {
    Special__Auth_TransactionPageByComApprove special__auth_transactionPageByComApprove;

    public TC_Sp_Auth_Own_Account_TransferByComApprove() {
        super();
    }

    @BeforeMethod
    public void SetUP() throws InterruptedException {

        initialization();

        special__auth_transactionPageByComApprove = new CompanyUsersLoginPage().CompMakerLogin(getSpAuthApproveUser(), getTranMakerPass()).clickSpAuthBulkApproveQueue();

    }

    @Test(priority = 0)
    public void approve_SpAuth_OwnAccount_ByApproveSuccess(ITestContext context) throws InterruptedException {

        String SpAuthRefId = (String) context.getAttribute("UniversalTrxReferenceNumber");

        special__auth_transactionPageByComApprove = special__auth_transactionPageByComApprove
                .searchIFTBatchId(SpAuthRefId)
                .clickApproveBtn()
                .inputTokenNumber()
                .clickApproveTokenBtn()
                .clickYesBtn();

        MockData mockData = new MockData();
        mockData.updateToExcel(21, SpAuthRefId);


        System.out.println("Successfully get Approve Transaction Batch ID , Transaction Batch Id :- " + SpAuthRefId);
        Thread.sleep(10000);
    }

    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
