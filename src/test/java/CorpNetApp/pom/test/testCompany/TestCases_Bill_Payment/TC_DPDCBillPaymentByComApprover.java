package CorpNetApp.pom.test.testCompany.TestCases_Bill_Payment;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Approver_MenuPages.DPDCBillPaymentPageByComApprover;
import CorpNetApp.pom.util.GeneralUtil;
import CorpNetApp.pom.util.MockData;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_DPDCBillPaymentByComApprover extends BaseTest {


    DPDCBillPaymentPageByComApprover dpdcBillPaymentPageByComApprover;

    String Message;
    String ActualMessage = "Transaction initiated successfully.";

    public TC_DPDCBillPaymentByComApprover() {
        super();
    }

    String actualErrorMessage;


    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        dpdcBillPaymentPageByComApprover = new CompanyUsersLoginPage().CompApproveUserLogin(getTranCompApproveUser(), getTranMakerPass()).clickDpdcpproveQueue();

    }

    @Test
    public void TC_DPDCBillPaymentPageByComApprover(ITestContext context) throws InterruptedException {

        String DpdcRef = (String) context.getAttribute("dpdcTrxReferenceNumber");

        dpdcBillPaymentPageByComApprover = dpdcBillPaymentPageByComApprover
                .searchDPDCBatchId(DpdcRef)
                .authorizeButton()
                .otpNumber()
                .approveButton()
                .finalApproveButton();

        System.out.println("Successfully Approve For DPDC, Transaction Batch Id :- " + DpdcRef);

        Thread.sleep(3000);

        MockData mockData = new MockData();
        mockData.updateToExcel(47, DpdcRef);
        Thread.sleep(8000);

       // Message = driver.findElement(By.xpath("//p[@id='globalAlertBody']")).getText();
        //Assert.assertEquals(Message, ActualMessage);



    }

    @AfterMethod
    public void TearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }

}
