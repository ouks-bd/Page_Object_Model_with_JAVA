package CorpNetApp.pom.test.testCompany.TestCases_EFT_Transaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages.SingleEFT_TransactionPageByComMaker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_BEFT_Single_TransferByComMaker extends BaseTest {
    SingleEFT_TransactionPageByComMaker singleEFT_transactionPageByComMaker;

    public TC_BEFT_Single_TransferByComMaker() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        singleEFT_transactionPageByComMaker = new CompanyUsersLoginPage().CompMCUserLogin(getTranMCUser(), getTranMakerPass()).clickSingleEFT();

    }

    @Test
    public void success_EFT_Single_Transaction_initiate(ITestContext context) throws InterruptedException {
        singleEFT_transactionPageByComMaker = singleEFT_transactionPageByComMaker
                .selectComAcc(0)
                .selectBeneficiary(1)
                .fillTrxAmount()
                .fillTrxRemarks()
                .clickNextBtn()
                .clickConfirmBtn();

        String SingleEftTrxReferenceNumber = singleEFT_transactionPageByComMaker.SingleEftBatch;
        context.setAttribute("singleEftTrxReferenceNumber",SingleEftTrxReferenceNumber);
        System.out.println("Successfully upload the EFT One To Many Transaction, Transaction Batch Id :- " + SingleEftTrxReferenceNumber);
        Thread.sleep(10000);

    }
    @AfterMethod
    public void TearDown(){
        GeneralUtil.waitForDomStable();
        driver.quit();
    }


}
