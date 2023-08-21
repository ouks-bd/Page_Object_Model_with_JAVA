package CorpNetApp.pom.test.testCompany.TestCases_Bill_Payment;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages.CustomDutySinglePaymentPageByComMaker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_CustomDutySinglePaymentPage extends BaseTest {

    CustomDutySinglePaymentPageByComMaker customdutysinglepaymentpagebycommaker;


    public TC_CustomDutySinglePaymentPage() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        customdutysinglepaymentpagebycommaker = new CompanyUsersLoginPage().CompMCUserLogin(getTranMCUser(), getTranMakerPass()).clickCustomDutySingle();

    }

    @Test
    public void TC_CustomDutySinglePaymentPageMaker (ITestContext context) throws InterruptedException {
        customdutysinglepaymentpagebycommaker =customdutysinglepaymentpagebycommaker
                .customOfiiceCode()
                .registrationNumber()
                .registrationYear()
                .declarantCode()
                .mobileNumber()
                .amount()
                .documentType()
                .documentref()
                .remarks()
                .submitButton()
                .confirmButton()
                .finalsubmitButton();

        String DpdcTrxReferenceNumber = customdutysinglepaymentpagebycommaker.DpdcBatchRef;
        context.setAttribute("dpdcTrxReferenceNumber",DpdcTrxReferenceNumber);
        System.out.println("Successfully Payment For custom Duty, Transaction Batch Id :- " + DpdcTrxReferenceNumber);

        Thread.sleep(5000);

    }
    @AfterMethod
    public void TearDown(){
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
