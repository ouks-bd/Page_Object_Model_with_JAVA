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

public class TC_CustomDutySinglePaymentPageByApprover extends BaseTest {

    DPDCBillPaymentPageByComApprover dpdcbillpaymentpagecomapprover;


    public TC_CustomDutySinglePaymentPageByApprover() {
        super();
    }
    String actualErrorMessage;


    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        dpdcbillpaymentpagecomapprover = new CompanyUsersLoginPage().CompApproveUserLogin(getTranCompApproveUser(), getTranMakerPass()).clickDpdcpproveQueue();

    }

    @Test
    public void TC_CustomDutySinglePaymentPageByApprover (ITestContext context) throws InterruptedException {

        String DpdcRef = (String) context.getAttribute("dpdcTrxReferenceNumber");

        dpdcbillpaymentpagecomapprover =dpdcbillpaymentpagecomapprover
                .searchDPDCBatchId(DpdcRef)
                .authorizeButton()
                .otpNumber()
                .approveButton()
                .finalApproveButton();

        System.out.println("Successfully Approve For CustomDuty Single Transection, Transaction Batch Id :- " + DpdcRef);

        Thread.sleep(7000);


        MockData mockData=new MockData();
        mockData.updateToExcel(45,DpdcRef);


    }
    @AfterMethod
    public void TearDown(){
        GeneralUtil.waitForDomStable();
        driver.quit();
    }

}
