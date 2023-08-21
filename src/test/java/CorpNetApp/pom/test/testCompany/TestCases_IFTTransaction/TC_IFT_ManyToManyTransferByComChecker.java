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

public class TC_IFT_ManyToManyTransferByComChecker extends BaseTest {


    IFT_TransactionPageByComChecker iftTransactionPageByComChecker;
    MockData mockData;

    public TC_IFT_ManyToManyTransferByComChecker() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        iftTransactionPageByComChecker = new CompanyUsersLoginPage().CompMCUserLogin(getTranCompCheckerUser(), getTranMakerPass()).clickIFTCheckerQueue();

    }

    @Test(priority = 0)
    public void authorizedIFT_Many_Many_TranSuccess(ITestContext context) throws InterruptedException, EntityNotFoundException {
        String iftRef = (String) context.getAttribute("ift1to1TrxReferenceNumber");
        iftTransactionPageByComChecker = iftTransactionPageByComChecker
                .searchIFTBatchId(iftRef)
                .clickAuthorizeBtn()
                .clickSubmitBtn();

        System.out.println("Successfully get Transaction Id, Transaction Batch Id :- " + iftRef);

        Thread.sleep(20000);


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
