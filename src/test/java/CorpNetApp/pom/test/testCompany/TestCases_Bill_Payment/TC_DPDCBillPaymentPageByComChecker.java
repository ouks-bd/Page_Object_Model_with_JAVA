package CorpNetApp.pom.test.testCompany.TestCases_Bill_Payment;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Checker_MenuPages.DPDC_PaymentCheckPageByComChecker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_DPDCBillPaymentPageByComChecker extends BaseTest {

    DPDC_PaymentCheckPageByComChecker dpdc_paymentCheckPageByComChecker;


    public TC_DPDCBillPaymentPageByComChecker() {
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        dpdc_paymentCheckPageByComChecker = new CompanyUsersLoginPage().CompMCUserLogin(getTranCompCheckerUser(), getTranMakerPass()).clickBillPaymentChecker();

    }

    @Test
    public void TC_DPDCBillPaymentPageByComChecker (ITestContext context) throws InterruptedException {

        String BillRef = (String) context.getAttribute("dpdcTrxReferenceNumber");

        dpdc_paymentCheckPageByComChecker =dpdc_paymentCheckPageByComChecker
                .searchDPDCBatchId(BillRef)
                .authorizeButton()
                .finalCheckButton();

//        String DpdcTrxReferenceNumber = dpdcbillpaymentpagecomchecker.DpdcBatchRef;
//        context.setAttribute("DpdcTrxReferenceNumber",DpdcTrxReferenceNumber);
        System.out.println("Successfully Check For Bill, Transaction Batch Id :- " + BillRef);

        Thread.sleep(5000);

    }
    @AfterMethod
    public void TearDown(){
        GeneralUtil.waitForDomStable();
        driver.quit();
    }

}
