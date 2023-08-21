package CorpNetApp.pom.test.CompanyTransactionReports.TestCases_LegacyTransactionReport;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.Reports.transectionReportPage.DownLoadPaymentSlip;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_DownloadPaymentSlip extends BaseTest {

    DownLoadPaymentSlip downloadpaymentslip;


    public TC_DownloadPaymentSlip() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        downloadpaymentslip = new CompanyUsersLoginPage().CompMCUserLogin(getTranMCUser(), getTranMakerPass()).clickPaymentSlip();

    }

    @Test(priority = 1)
    public void TC_DownloadPaymentSlip() throws InterruptedException {
        downloadpaymentslip = downloadpaymentslip
                .selectDateBetweenField()
                .selectTransaction()
                .clickSearchButton()
                .clickOnDownloadButton();


        Thread.sleep(8000);
    }

    @Test(priority = 2)
    public void TC_DownloadPaymentSlipEFT() throws InterruptedException {
        downloadpaymentslip = downloadpaymentslip
                .selectDateBetweenField()
                .selectTransactionEFT()
                .clickSearchButton()
                .clickOnDownloadButton();


        Thread.sleep(8000);

    }

    @Test(priority = 3)
    public void TC_DownloadPaymentSlipRTGS() throws InterruptedException {
        downloadpaymentslip = downloadpaymentslip
                .selectDateBetweenField()
                .selectTransactionRTGS()
                .clickSearchButton()
                .clickOnDownloadButton();


        Thread.sleep(8000);

    }

    @AfterMethod
    public void TearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }

}
