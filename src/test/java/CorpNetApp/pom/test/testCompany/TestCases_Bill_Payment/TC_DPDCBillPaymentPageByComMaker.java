package CorpNetApp.pom.test.testCompany.TestCases_Bill_Payment;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages.DPDCBillPaymentPageByComMaker;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_DPDCBillPaymentPageByComMaker extends BaseTest {

    String Message;
    String ActualMessage="Transaction initiated successfully.";

    DPDCBillPaymentPageByComMaker dpdcBillPaymentPageByComMaker;


    public TC_DPDCBillPaymentPageByComMaker() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        dpdcBillPaymentPageByComMaker = new CompanyUsersLoginPage().CompMCUserLogin(getTranMCUser(), getTranMakerPass()).clickBillPaymentDPDC();

    }

    @Test
    public void TC_DPDCBillPaymentPageByComMaker (ITestContext context) throws InterruptedException {
        dpdcBillPaymentPageByComMaker =dpdcBillPaymentPageByComMaker
                .customerNumber()
                .amount()
                .remarks()
                .validatebuttonClick()
                .submitButton()
                .confirmButton()
                .finalsubmitButton();

        String DpdcTrxReferenceNumber = dpdcBillPaymentPageByComMaker.DpdcBatchRef;
        context.setAttribute("dpdcTrxReferenceNumber",DpdcTrxReferenceNumber);
        System.out.println("Successfully Payment For DPDC, Transaction Batch Id :- " + DpdcTrxReferenceNumber);
        Thread.sleep(3000);
        Message = driver.findElement(By.xpath("//p[@id='globalAlertBody']")).getText();
        Assert.assertEquals(Message,ActualMessage);
        Thread.sleep(5000);

    }
    @AfterMethod
    public void TearDown(){
        GeneralUtil.waitForDomStable();
        driver.quit();
    }

}
