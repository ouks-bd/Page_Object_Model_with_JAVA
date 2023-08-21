package CorpNetApp.pom.test.testCompany.TestCases_IFTTransaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages.SingleIFTTransactionPageByComMaker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_IFT_Single_TransferByComMaker extends BaseTest {
    SingleIFTTransactionPageByComMaker singleIFTTransactionPageByComMaker;


    public TC_IFT_Single_TransferByComMaker() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        singleIFTTransactionPageByComMaker = new CompanyUsersLoginPage().CompMCUserLogin(getTranMCUser(), getTranMakerPass()).clickSingleIFT();
    }

    @Test
    public void success_IFT_Transaction_initiate(ITestContext context) throws InterruptedException {
        singleIFTTransactionPageByComMaker = singleIFTTransactionPageByComMaker
                .selectComAcc(0)
                .selectBeneficiary(1)
                .fillTrxAmount()
                .fillTrxRemarks()
                .clickNextBtn()
                .clickConfirmBtn();

        String SingleIftTrxReferenceNumber = singleIFTTransactionPageByComMaker.SingleIftBatch;
        context.setAttribute("singleIftTrxReferenceNumber",SingleIftTrxReferenceNumber);
        System.out.println("Successfully upload the IFT One To Many Transaction, Transaction Batch Id :- " + SingleIftTrxReferenceNumber);
        Thread.sleep(5000);

    }
    @AfterMethod
    public void TearDown(){
        GeneralUtil.waitForDomStable();
        driver.quit();
    }


}
