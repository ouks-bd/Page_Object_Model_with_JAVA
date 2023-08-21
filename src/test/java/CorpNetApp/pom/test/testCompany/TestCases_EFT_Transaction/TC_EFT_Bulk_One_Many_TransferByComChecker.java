package CorpNetApp.pom.test.testCompany.TestCases_EFT_Transaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Checker_MenuPages.EFT_TransactionPageByComChecker;
import CorpNetApp.pom.util.GeneralUtil;
import com.google.appengine.api.datastore.EntityNotFoundException;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

;

public class TC_EFT_Bulk_One_Many_TransferByComChecker extends BaseTest {
    EFT_TransactionPageByComChecker eft_transactionPageByComChecker;


    public TC_EFT_Bulk_One_Many_TransferByComChecker() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        eft_transactionPageByComChecker = new CompanyUsersLoginPage().CompMCUserLogin(getTranCompCheckerUser(), getTranMakerPass()).clickEFT_One_Many_CheckerQueue();

    }

    @Test(priority = 0)
    public void authorized_EFT_1_Many_TranSuccess(ITestContext context) throws InterruptedException, EntityNotFoundException {
        //  Object entity =  dataServices.getTask("123");
        // String FN = (String) context.getAttribute("");
        String eftRef = (String) context.getAttribute("EftTrxReferenceNumber");
        // iftTransactionPageByComChecker.searchIFTBatchId(iftRef);
        eft_transactionPageByComChecker = eft_transactionPageByComChecker
                .searchIFTBatchId(eftRef)
                .clickAuthorizeBtn()
                .clickSubmitBtn();

        System.out.println("Successfully get Transaction Id, Transaction Batch Id :- " + eftRef);

        Thread.sleep(30000);


    }


    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
