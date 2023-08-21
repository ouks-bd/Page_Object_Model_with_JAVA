package CorpNetApp.pom.test.CompanyTransactionReports.TestCases_LegacyTransactionReport;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.Reports.transectionReportPage.PaymentReportPage;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_PaymentReport extends BaseTest {

    PaymentReportPage paymentreportpage;


    public TC_PaymentReport() {
        super();
    }

    @BeforeMethod
    public void setUp() {
//        test();
        initialization();

        paymentreportpage = new CompanyUsersLoginPage().CompMCUserLogin(getTranMCUser(), getTranMakerPass()).clickPaymentReportPage();

    }

    @Test
    public void TC_PaymentReport() throws InterruptedException {
        paymentreportpage = paymentreportpage
                .selectDateBetweenField()
               // .selectTransaction()
                .clickSearchButton()
                .clickOnGenerateButton();


        Thread.sleep(6000);

    }
    @AfterMethod
    public void TearDown(){
        GeneralUtil.waitForDomStable();
        driver.quit();
    }


}
