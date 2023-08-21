package CorpNetApp.pom.test.testCompany.TestCases_RTGS_Transaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages.RTGSSingleTransactionPageByComMaker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class TC_RTGS_Single_TransferByComMaker extends BaseTest {
    RTGSSingleTransactionPageByComMaker rtgsSSingleTransactionPageByComMaker;
    public TC_RTGS_Single_TransferByComMaker() {
        super();
    }

    @BeforeMethod
    public void SetUP() {

        initialization();

        rtgsSSingleTransactionPageByComMaker = new CompanyUsersLoginPage().CompMakerLogin(getTranMCUser(), getTranMakerPass()).ClickSingleRTGS();

    }
    @Test(priority = 0)
    public void initiateRTGS_Single_TranSuccess(ITestContext context) throws InterruptedException, FileNotFoundException {
        rtgsSSingleTransactionPageByComMaker = rtgsSSingleTransactionPageByComMaker
                .selectBeneficiary(1)
                .fillAmount("100000")
                .fillRemarks("RTGS_Single_Transaction")
                .nextButton()
                .confirmButton();

        String RTGSTrxReferenceNumber = rtgsSSingleTransactionPageByComMaker.SingleIftBatch;
        context.setAttribute("rtgsTrxReferenceNumber",RTGSTrxReferenceNumber);
        System.out.println("Successfully upload the RTGS Transaction, Transaction Batch Id :- " + RTGSTrxReferenceNumber);
        Thread.sleep(10000);

    }

    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}

