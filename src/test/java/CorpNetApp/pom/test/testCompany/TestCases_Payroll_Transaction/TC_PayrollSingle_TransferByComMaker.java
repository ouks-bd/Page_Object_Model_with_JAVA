package CorpNetApp.pom.test.testCompany.TestCases_Payroll_Transaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages.Single_Payroll_TransactionPageByComMaker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class TC_PayrollSingle_TransferByComMaker extends BaseTest {
    Single_Payroll_TransactionPageByComMaker single_payroll_transactionPageByComMaker;
    public TC_PayrollSingle_TransferByComMaker() {
        super();
    }

    @BeforeMethod
    public void SetUP() {

        initialization();

    single_payroll_transactionPageByComMaker    = new CompanyUsersLoginPage().CompMakerLogin(getMakerPayrollUser(), getPayrollPassword()).ClickSinglePayroll();

    }
    @Test
    public void initiate_Payroll_Single_TranSuccess(ITestContext context) throws InterruptedException, FileNotFoundException {
        single_payroll_transactionPageByComMaker = single_payroll_transactionPageByComMaker
                .selectComAcc(0)
                .selectBeneficiary(1)
                .fillTrxAmount()
                .fillTrxRemarks()
                .clickNextBtn()
                .clickConfirmBtn();

        String PayrollTrxReferenceNumber = single_payroll_transactionPageByComMaker.PayrollTrxRefNo;
        context.setAttribute("payrollTrxReferenceNumber",PayrollTrxReferenceNumber);
        System.out.println("Successfully upload the RTGS Transaction, Transaction Batch Id :- " + PayrollTrxReferenceNumber);
        Thread.sleep(10000);

    }

    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}

