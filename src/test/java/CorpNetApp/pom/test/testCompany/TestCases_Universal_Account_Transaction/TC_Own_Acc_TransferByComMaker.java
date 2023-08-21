package CorpNetApp.pom.test.testCompany.TestCases_Universal_Account_Transaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages.Own_AccountTransferPageByComMaker;
import CorpNetApp.pom.util.GeneralUtil;
import CorpNetApp.pom.util.MockData;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_Own_Acc_TransferByComMaker extends BaseTest {
    Own_AccountTransferPageByComMaker own_accountTransferByComMaker;

    public TC_Own_Acc_TransferByComMaker() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        own_accountTransferByComMaker = new CompanyUsersLoginPage().CompSpMakerCUserLogin(getSpTranMakerPass(), getTranMakerPass()).clickOwnBulkTransfer();

    }
    @Test
    public void success_Own_Acc_Transaction_initiate(ITestContext context) throws InterruptedException {
        own_accountTransferByComMaker = own_accountTransferByComMaker
                .selectAccountNo(0)
                .uploadIFTFile()
                .fillRemarks("Universal_Own_Account")
                .clickUploadBtn()
                .clickConfirmBtn();

        String universalTrxReferenceNumber = own_accountTransferByComMaker.UnBatchRef;
        context.setAttribute("UniversalTrxReferenceNumber",universalTrxReferenceNumber);
        System.out.println("Successfully upload the SP Transaction, Transaction Batch Id :- " + universalTrxReferenceNumber);
      //  MockData mockData = new MockData();
       // mockData.updateToExcel(21,universalTrxReferenceNumber);
        Thread.sleep(5000);


    }
    @AfterMethod
    public void TearDown(){
        GeneralUtil.waitForDomStable();
        driver.quit();
    }


}
