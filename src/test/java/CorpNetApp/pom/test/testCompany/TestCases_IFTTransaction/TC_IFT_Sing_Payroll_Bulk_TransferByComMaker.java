package CorpNetApp.pom.test.testCompany.TestCases_IFTTransaction;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages.IFT1ToManyBulkTransactionPageByComMaker;
import CorpNetApp.pom.storage.DataServices;
import CorpNetApp.pom.util.GeneralUtil;
import CorpNetApp.pom.util.MockData;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TC_IFT_Sing_Payroll_Bulk_TransferByComMaker extends BaseTest {


    private static final DataServices dataServices = new DataServices();

    IFT1ToManyBulkTransactionPageByComMaker ift1ToManyBulkTransactionPageByComMaker;
    MockData mockData;

    public TC_IFT_Sing_Payroll_Bulk_TransferByComMaker() {
        super();
    }

    @BeforeMethod
    public void SetUP() {
        initialization();
        mockData = new MockData();
        //ift1ToManyBulkTransactionPageByComMaker = new CompanyUsersLoginPage().CompMCUserLogin(getTranMCUser(), getTranMakerPass()).ClickBulkIFT();
        ift1ToManyBulkTransactionPageByComMaker = new CompanyUsersLoginPage().CompMCUserLogin(getMakerPayrollUser(), getPayrollPassword()).ClickBulkIFT();


    }


    @Test
    public void initiateIFT_Payroll_TranSuccess(ITestContext context) throws InterruptedException {
        //String Ift_Batch_id = ift1ToManyBulkTransactionPageByComMaker.iftBatch;


        ift1ToManyBulkTransactionPageByComMaker = ift1ToManyBulkTransactionPageByComMaker

                .selectAccountNo(0)
                .SelectPayrollRedioButton()
                .SelectPayrollPurpose()
                .uploadIFTFile()
                .clickUploadBtn()
                .clickPayrollConfirmBtn();
        String IFTPayrollReferenceNumber = ift1ToManyBulkTransactionPageByComMaker.iftPayrollBatch;
        context.setAttribute("iftPayrollTrxReferenceNumber", IFTPayrollReferenceNumber);
        System.out.println("Successfully upload the IFT payroll Transaction, Transaction Batch Id :- " + IFTPayrollReferenceNumber);

        Thread.sleep(10000);

    }

    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }


}
