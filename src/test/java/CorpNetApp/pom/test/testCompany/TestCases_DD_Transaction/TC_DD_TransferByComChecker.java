package CorpNetApp.pom.test.testCompany.TestCases_DD_Transaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Checker_MenuPages.DD_TransactionPageByComChecker;
import CorpNetApp.pom.util.GeneralUtil;
import com.google.appengine.api.datastore.EntityNotFoundException;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

;

public class TC_DD_TransferByComChecker extends BaseTest {
    DD_TransactionPageByComChecker dd_transactionPageByComChecker;


    public TC_DD_TransferByComChecker() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        dd_transactionPageByComChecker = new CompanyUsersLoginPage().CompMCUserLogin(getTranCompCheckerUser(), getTranMakerPass()).click_DD_CheckerQueue();

    }

    @Test(priority = 1)
    public void authorized_DD_Tran_ShouldSuccess(ITestContext context) throws InterruptedException, EntityNotFoundException {
        String DDRefID = (String) context.getAttribute("DDTranBatchRefNo");
       // iftTransactionPageByComChecker.searchIFTBatchId(iftRef);
        dd_transactionPageByComChecker = dd_transactionPageByComChecker
                .searchDDBatchId(DDRefID)
                .clickAuthorizeBtn()
               .clickSubmitBtn();

        System.out.println("Successfully get DD Id,DD Transaction Batch Id :- " + DDRefID);

        Thread.sleep(5000);


    }


    /*  @Test(priority = 1)
      public void rejectedIFT_1_Many_Tran_Success() throws InterruptedException {
          mockData = mockData;
          List<String> data = new ArrayList<>();
          data = mockData.readMockBatchId("CheckerTransactionBatchId");
          for (String iftBatch : data) {
              System.out.println("Get Transaction Ref : - " + iftBatch);
              iftBulkTransactionPageByComChecker = iftBulkTransactionPageByComChecker
                      .searchIFTBatchId(iftBatch)
                      .clickAuthorizeBtn()
                      .clickRejectBtn()
                      .fillRejectReason("data invalid");
              Thread.sleep(10000);


          }
      }
  */
    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
