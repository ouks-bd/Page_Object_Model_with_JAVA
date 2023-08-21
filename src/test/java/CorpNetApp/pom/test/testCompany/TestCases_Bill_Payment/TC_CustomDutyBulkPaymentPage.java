package CorpNetApp.pom.test.testCompany.TestCases_Bill_Payment;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages.CustomDutyBulkPaymentPageByComMaker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_CustomDutyBulkPaymentPage extends BaseTest {


    CustomDutyBulkPaymentPageByComMaker CustomDutyBulkPaymentPageBycommaker;


    public TC_CustomDutyBulkPaymentPage() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
       CustomDutyBulkPaymentPageBycommaker = new CompanyUsersLoginPage().CompMCUserLogin(getTranMCUser(), getMakerPass()).clickCustomDutyBulk();

    }

    @Test
    public void TC_CustomDutyBulkPaymentPage (ITestContext context) throws InterruptedException {
        CustomDutyBulkPaymentPageBycommaker =CustomDutyBulkPaymentPageBycommaker
                .uploadCustomDutyBulk()
                .fillRemarks("Automation_Test")
                .clickUploadBtn()
                .clickConfirmBtn();


        String DpdcTrxReferenceNumber = CustomDutyBulkPaymentPageBycommaker.customDutyRefId;
        context.setAttribute("dpdcTrxReferenceNumber",DpdcTrxReferenceNumber);
        System.out.println("Successfully Payment For custom Duty Bulk, Transaction Batch Id :- " + DpdcTrxReferenceNumber);

        Thread.sleep(5000);

    }
    @AfterMethod
    public void TearDown(){
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
