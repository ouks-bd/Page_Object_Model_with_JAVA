package CorpNetApp.pom.test.testCompany.TestCases_DD_Transaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Approver_MenuPages.DD_TransactionPageByComApprove;
import CorpNetApp.pom.util.GeneralUtil;
import CorpNetApp.pom.util.MockData;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_DD_Approve_TransferByComApprover extends BaseTest {

    DD_TransactionPageByComApprove dd_transactionPageByComApprove;
    MockData mockData;

    public TC_DD_Approve_TransferByComApprover() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        dd_transactionPageByComApprove = new CompanyUsersLoginPage().CompApproveUserLogin(getTranCompApproveUser(), getTranMakerPass()).clickDDBulkApproveQueue();

    }

    @Test(priority = 2)
    public void Approve_DD_Third_Party_EFT_IFT_TranSuccess(ITestContext context) throws InterruptedException {

        String DDBatchRefID = (String) context.getAttribute("DDTranBatchRefNo");
            dd_transactionPageByComApprove = dd_transactionPageByComApprove
                    .searchDDBatchId(DDBatchRefID)
                    .clickApproveBtn()
                    .inputTokenNumber()
                    .clickApproveTokenBtn()
                    .clickYesBtn();



            System.out.println("Successfully get Approve DD Transaction Batch ID ,DD Transaction Batch Id :- " + DDBatchRefID);
            MockData mockData=new MockData();
            mockData.updateToExcel(40,DDBatchRefID);

            Thread.sleep(10000);
        }


    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
