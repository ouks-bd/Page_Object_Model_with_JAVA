package CorpNetApp.pom.test.testCompany.TestCases_Payroll_Transaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Approver_MenuPages.Payroll_Single_TransactionPageByComApprove;
import CorpNetApp.pom.util.GeneralUtil;
import CorpNetApp.pom.util.MockData;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_Payroll_Single_Approve_TransferByComApprover extends BaseTest {

    Payroll_Single_TransactionPageByComApprove payroll_single_transactionPageByComApprove;
    MockData mockData;

    public TC_Payroll_Single_Approve_TransferByComApprover() {
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        payroll_single_transactionPageByComApprove = new CompanyUsersLoginPage().CompApproveUserLogin(getApprovePayrollUser(), getPayrollPassword()).clickPayrollBulkApproveQueue();

    }

    @Test
    public void Approve_Single_Payroll_TranSuccess(ITestContext context) throws InterruptedException {

        String payrollRef = (String) context.getAttribute("payrollTrxReferenceNumber");
        System.out.println("Successfully get Approve Transaction Payroll Batch ID , Transaction Batch Id :- " + payrollRef);
        payroll_single_transactionPageByComApprove = payroll_single_transactionPageByComApprove
                .searchIFTBatchId(payrollRef)
                .clickApproveBtn()
                .inputTokenNumber()
                .clickApproveTokenBtn()
                .clickYesBtn();



        System.out.println("Successfully get Approve Transaction Payroll Batch ID , Transaction Batch Id :- " + payrollRef);
        MockData mockData = new MockData();
        mockData.updateToExcel(53,payrollRef);
        Thread.sleep(5000);
    }


    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
