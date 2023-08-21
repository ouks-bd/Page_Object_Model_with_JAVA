package CorpNetApp.pom.test.testCompany.TestCases_Payroll_Transaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages.BulkPayrollTransactionPageByComMaker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_Payroll_Bulk_TransferByComMaker extends BaseTest {


    BulkPayrollTransactionPageByComMaker bulkPayrollTransactionPageByComMaker;

    public TC_Payroll_Bulk_TransferByComMaker() {
        super();
    }

    @BeforeMethod
    public void SetUP() {

        initialization();

        bulkPayrollTransactionPageByComMaker = new CompanyUsersLoginPage().CompMakerLogin(getTranMCUser(), getTranMakerPass()).clickBulkPayroll();
    }

    @Test
    public void initiate_Payroll_Bulk_TranSuccess(ITestContext context) throws InterruptedException, IOException {
        bulkPayrollTransactionPageByComMaker = bulkPayrollTransactionPageByComMaker

                .paymentPurpose(1)
                .selectMonth(2)
                .selectYear(3)
                .fileUpload()
                .clickUploadBtn()
                .clickConfirmBtn();

        String PayrollTrxReferenceNumber = bulkPayrollTransactionPageByComMaker.payrollBatch;

        context.setAttribute("payrollTrxReferenceNumber", PayrollTrxReferenceNumber);
        System.out.println("Successfully upload the IFT One To Many Transaction, Transaction Batch Id :- " + PayrollTrxReferenceNumber);


        Thread.sleep(5000);
    }

    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}