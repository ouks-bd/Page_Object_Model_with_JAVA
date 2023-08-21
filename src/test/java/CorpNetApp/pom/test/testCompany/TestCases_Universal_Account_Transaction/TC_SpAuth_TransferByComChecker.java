package CorpNetApp.pom.test.testCompany.TestCases_Universal_Account_Transaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Checker_MenuPages.SpAuth_TransactionPageByComChecker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_SpAuth_TransferByComChecker extends BaseTest {


    SpAuth_TransactionPageByComChecker spAuth_transactionPageByComChecker;


    public TC_SpAuth_TransferByComChecker() {
        super();
    }

    @BeforeMethod
    public void SetUP() throws InterruptedException {

        initialization();

        spAuth_transactionPageByComChecker = new CompanyUsersLoginPage().CompMakerLogin(getSpAuthCheckerUser(), getTranMakerPass()).click_SpAuth_CheckerQueue();

    }

    @Test(priority = 0)
    public void Authorized_SpAuth_Bulk_TranSuccess(ITestContext context) throws InterruptedException {

        String SpAuthBatchId = (String) context.getAttribute("UniversalTrxReferenceNumber");

        spAuth_transactionPageByComChecker = spAuth_transactionPageByComChecker
                .searchSpAuthBatchId(SpAuthBatchId)
                .clickAuthorizeBtn()
                .clickSubmitBtn();


        System.out.println("Successfully get Transaction Id, Transaction Special Auth Batch Id :- " +SpAuthBatchId);

        Thread.sleep(10000);
    }

    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }

}
