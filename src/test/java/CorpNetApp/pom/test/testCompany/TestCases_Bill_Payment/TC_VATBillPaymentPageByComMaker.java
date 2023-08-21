package CorpNetApp.pom.test.testCompany.TestCases_Bill_Payment;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages.VATBillPaymentPageByCom;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_VATBillPaymentPageByComMaker extends BaseTest {

    VATBillPaymentPageByCom vatbillpaymentpagebyCom;


    public TC_VATBillPaymentPageByComMaker() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        vatbillpaymentpagebyCom = new CompanyUsersLoginPage().CompMCUserLogin(getTranMCUser(), getTranMakerPass()).clickOnVat();

    }

    @Test
    public void TC_VATBillPaymentPageByComMaker (ITestContext context) throws InterruptedException {


        vatbillpaymentpagebyCom =vatbillpaymentpagebyCom
                .binNumberSearch()
                .taxType()
                .taxMonth()
                .taxYear()
                .vatAmount()
                .remarksAdd()
                .submitButton()
                .confirmButton()
                .finalSubmitButton();

        String VATTrxReferenceNumber = vatbillpaymentpagebyCom.DpdcBatchRef;
        context.setAttribute("dpdcTrxReferenceNumber",VATTrxReferenceNumber);
        System.out.println("Successfully Payment For Vat, Transaction Batch Id :- " + VATTrxReferenceNumber);


        Thread.sleep(5000);

    }
    @AfterMethod
    public void TearDown(){
        GeneralUtil.waitForDomStable();
        driver.quit();
    }

}
