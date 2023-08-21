package CorpNetApp.pom.test.testCompany.TestCases_IFTTransaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Checker_MenuPages.IFT_Single_TransactionPageByComChecker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_IFT_Single_TransferByComChecker extends BaseTest {

    IFT_Single_TransactionPageByComChecker ift_single_transactionPageByComChecker;

    public TC_IFT_Single_TransferByComChecker() {
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        ift_single_transactionPageByComChecker = new CompanyUsersLoginPage().CompMCUserLogin(getTranMCUser(), getTranMakerPass()).clickIFT_Single_CheckerQueue();
    }

        @Test
        public void authorizedIFT_Single_TranSuccess(ITestContext context) throws InterruptedException {
            String iftSingleRef = (String) context.getAttribute("singleIftTrxReferenceNumber");
            ift_single_transactionPageByComChecker = ift_single_transactionPageByComChecker
                    .searchIFTSingleBatchId(iftSingleRef)
                    .clickAuthorizeBtn()
                    .clickSubmitBtn();

            System.out.println("Successfully fetched the Single IFT Ref:" + iftSingleRef);
            Thread.sleep(15000);

        }

        @AfterMethod
        public void TearDown() {
            GeneralUtil.waitForDomStable();
            driver.quit();
        }

    }
