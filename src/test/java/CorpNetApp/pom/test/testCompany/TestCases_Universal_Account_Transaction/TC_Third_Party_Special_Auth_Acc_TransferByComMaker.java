package CorpNetApp.pom.test.testCompany.TestCases_Universal_Account_Transaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages.special_Third_AccountTransferPageByComMaker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_Third_Party_Special_Auth_Acc_TransferByComMaker extends BaseTest {

    special_Third_AccountTransferPageByComMaker special_third_accountTransferPageByComMaker;

    public TC_Third_Party_Special_Auth_Acc_TransferByComMaker() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        special_third_accountTransferPageByComMaker = new CompanyUsersLoginPage().CompSpMakerCUserLogin(getSpTranMakerUser(), getTranMakerPass()).clickThirdBulkTransfer();

    }
    @Test
    public void success_Special_Third_Acc_Transaction_initiate(ITestContext context) throws InterruptedException {
        special_third_accountTransferPageByComMaker = special_third_accountTransferPageByComMaker
                .selectAccountNo(0)
                .uploadIFTFile()
                .fillRemarks("Universal_Third_Account")
                .clickUploadBtn()
                .clickConfirmBtn();

        String universalTrxReferenceNumber = special_third_accountTransferPageByComMaker.UnBatchRef;
        context.setAttribute("UniversalTrxReferenceNumber",universalTrxReferenceNumber);
        System.out.println("Successfully upload the Universal Transaction, Transaction Batch Id :- " + universalTrxReferenceNumber);
    //    MockData mockData = new MockData();
       // mockData.updateToExcel(28,universalTrxReferenceNumber);
        Thread.sleep(5000);


    }
    @AfterMethod
    public void TearDown(){
        GeneralUtil.waitForDomStable();
        driver.quit();
    }


}
