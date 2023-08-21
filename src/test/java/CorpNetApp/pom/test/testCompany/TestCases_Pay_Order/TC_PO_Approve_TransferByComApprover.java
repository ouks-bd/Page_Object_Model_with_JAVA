package CorpNetApp.pom.test.testCompany.TestCases_Pay_Order;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Approver_MenuPages.PO_TransactionPageByComApprove;
import CorpNetApp.pom.util.GeneralUtil;
import CorpNetApp.pom.util.MockData;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_PO_Approve_TransferByComApprover extends BaseTest {

    PO_TransactionPageByComApprove po_transactionPageByComApprove;
    MockData mockData;

    public TC_PO_Approve_TransferByComApprover() {
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        po_transactionPageByComApprove = new CompanyUsersLoginPage().CompApproveUserLogin(getTranCompApproveUser(), getTranMakerPass()).clickPOSingleApproveQueue();

    }

    @Test
    public void Approve_Bulk_PO_TranSuccess(ITestContext context) throws InterruptedException {


        String PORefNo = (String) context.getAttribute("poTranRefNo");
        po_transactionPageByComApprove = po_transactionPageByComApprove
                .searchPORemarks(PORefNo)
                .clickApproveBtn()
                .inputTokenNumber()
                .clickApproveTokenBtn()
                .clickYesBtn();


        System.out.println("Successfully get Approve Transaction Payroll Batch ID , Transaction Batch Id :-"+ PORefNo);
        MockData mockData=new MockData();
        mockData.updateToExcel(73,PORefNo);
        Thread.sleep(5000);
    }


    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
