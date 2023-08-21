package CorpNetApp.pom.test.testCompany.TestCases_EFT_Transaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Checker_MenuPages.EFT_TransactionPageByComChecker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_BEFT_Single_TransferByComChecker extends BaseTest {
    EFT_TransactionPageByComChecker eft_transactionPageByComChecker;

    public TC_BEFT_Single_TransferByComChecker() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        eft_transactionPageByComChecker = new CompanyUsersLoginPage().CompMCUserLogin(getTranCompCheckerUser(), getTranMakerPass()).clickEFT_One_Many_CheckerQueue();
    }

    @Test
    public void authorizedEFT_Single_TranSuccess(ITestContext context) throws InterruptedException {
        String eftSingleRef = (String) context.getAttribute("singleEftTrxReferenceNumber");

        eft_transactionPageByComChecker = eft_transactionPageByComChecker
                .searchIFTBatchId(eftSingleRef)
                .clickAuthorizeBtn()
                .clickSubmitBtn();

        System.out.println("Successfully fetched the Single IFT Ref:" + eftSingleRef);
        Thread.sleep(5000);

    }

    @AfterMethod
    public void TearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }

}

