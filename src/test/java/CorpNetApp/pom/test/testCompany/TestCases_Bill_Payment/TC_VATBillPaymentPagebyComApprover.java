package CorpNetApp.pom.test.testCompany.TestCases_Bill_Payment;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Approver_MenuPages.DPDCBillPaymentPageByComApprover;
import CorpNetApp.pom.util.GeneralUtil;
import CorpNetApp.pom.util.MockData;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_VATBillPaymentPagebyComApprover extends BaseTest {

    DPDCBillPaymentPageByComApprover dpdcBillPaymentPageByComApprover;


    public TC_VATBillPaymentPagebyComApprover() {
        super();
    }
    String actualErrorMessage;


    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        dpdcBillPaymentPageByComApprover =  new CompanyUsersLoginPage().CompApproveUserLogin(getTranCompApproveUser(), getTranMakerPass()).clickDpdcpproveQueue();

    }

    @Test
    public void TC_VATBillPaymentPagebyComApprover (ITestContext context) throws InterruptedException {

        String vatRef = (String) context.getAttribute("dpdcTrxReferenceNumber");

        dpdcBillPaymentPageByComApprover =dpdcBillPaymentPageByComApprover
                .searchDPDCBatchId(vatRef)
                .authorizeButton()
                .otpNumber()
                .approveButton()
                .finalApproveButton();

        System.out.println("Successfully Approve For Vat, Transaction Batch Id :- " + vatRef);

        Thread.sleep(7000);


        MockData mockData=new MockData();
        mockData.updateToExcel(43,vatRef);



    }
    @AfterMethod
    public void TearDown(){
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
