package CorpNetApp.pom.test.testCompany.TestCases_IFTTransaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Checker_MenuPages.IFT_TransactionPageByComChecker;
import CorpNetApp.pom.util.GeneralUtil;
import CorpNetApp.pom.util.MockData;
import com.google.appengine.api.datastore.EntityNotFoundException;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

;

public class TC_IFT_Payroll_Bulk_TransferByComChecker extends BaseTest {
    IFT_TransactionPageByComChecker iftTransactionPageByComChecker;
    MockData mockData;

    public TC_IFT_Payroll_Bulk_TransferByComChecker() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        mockData = new MockData();
        iftTransactionPageByComChecker = new CompanyUsersLoginPage().CompMCUserLogin(getCheckerPayrollUser(), getPayrollPassword()).clickIFTCheckerQueue();

    }

    @Test()
    public void authorizedIFT_Payroll_TranSuccess(ITestContext context) throws InterruptedException, EntityNotFoundException {
        //  Object entity =  dataServices.getTask("123");
        // String FN = (String) context.getAttribute("");
        String iftPayrollRef = (String) context.getAttribute("iftPayrollTrxReferenceNumber");
        // iftTransactionPageByComChecker.searchIFTBatchId(iftRef);
        iftTransactionPageByComChecker = iftTransactionPageByComChecker
                .searchIFTBatchId(iftPayrollRef)
                .clickAuthorizeBtn()
                .clickSubmitBtn();

        System.out.println("Successfully get Transaction Id, Transaction Batch Id :- " + iftPayrollRef);

        Thread.sleep(3000);


    }

    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
