package CorpNetApp.pom.test.testCompany.TestCases_Payroll_Transaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Checker_MenuPages.Payroll_TransactionPageByComChecker;
import CorpNetApp.pom.util.GeneralUtil;
import com.google.appengine.api.datastore.EntityNotFoundException;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_PayrollSingle_TransferByComChecker extends BaseTest {
    Payroll_TransactionPageByComChecker payroll_transactionPageByComChecker;

    public TC_PayrollSingle_TransferByComChecker() {
        super();
    }

    @BeforeMethod
    public void SetUP() {

        initialization();

        payroll_transactionPageByComChecker = new CompanyUsersLoginPage().CompMakerLogin(getCheckerPayrollUser(), getPayrollPassword()).ClickVerifyPayroll();

    }

    @Test
    public void authorized_Single_Payroll_TranSuccess(ITestContext context) throws InterruptedException, EntityNotFoundException {
        String payrollRef = (String) context.getAttribute("payrollTrxReferenceNumber");
        payroll_transactionPageByComChecker = payroll_transactionPageByComChecker

                .searchIFTBatchId(payrollRef)
                .clickAuthorizeBtn()
                .clickSigRadioBtn()
                .clickSubmitBtn();

        System.out.println("Successfully get Transaction Id, Transaction Batch Id :- " + payrollRef);

        Thread.sleep(10000);

    }

    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}

