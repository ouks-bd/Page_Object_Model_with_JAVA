package CorpNetApp.pom.test.testCompany.TestCases_RTGS_Transaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Checker_MenuPages.RTGS_BulkTransactionPageByComChecker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_RTGS_TransferByComChecker extends BaseTest {


    RTGS_BulkTransactionPageByComChecker rtgs_bulkTransactionPageByComChecker;


    public TC_RTGS_TransferByComChecker() {
        super();
    }

    @BeforeMethod
    public void SetUP() throws InterruptedException {

        initialization();

        rtgs_bulkTransactionPageByComChecker = new CompanyUsersLoginPage().CompMakerLogin(getTranCompCheckerUser(), getTranMakerPass()).click_RTGS_CheckerQueue();

    }

    @Test(priority = 0)
    public void Authorized_RTGS_Bulk_TranSuccess(ITestContext context) throws InterruptedException {

        String rtgsRef = (String) context.getAttribute("rtgsTrxReferenceNumber");

        rtgs_bulkTransactionPageByComChecker = rtgs_bulkTransactionPageByComChecker
                .searchIFTBatchId(rtgsRef)
                .clickAuthorizeBtn()
                .clickSubmitBtn();


        System.out.println("Successfully get Transaction Id, Transaction Batch Id :- " + rtgsRef);

        Thread.sleep(10000);
    }

    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }

}
