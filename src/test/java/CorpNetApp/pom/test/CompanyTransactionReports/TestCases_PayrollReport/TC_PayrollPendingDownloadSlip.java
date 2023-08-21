package CorpNetApp.pom.test.CompanyTransactionReports.TestCases_PayrollReport;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.Reports.payrollReportPage.PayrollDownloadPaymentSlip;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_PayrollPendingDownloadSlip extends BaseTest {
    PayrollDownloadPaymentSlip payrolldownloadpaymentslip;


    public TC_PayrollPendingDownloadSlip() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        payrolldownloadpaymentslip = new CompanyUsersLoginPage().CompMCUserLogin(getTranMCUser(), getTranMakerPass()).clickPayrollDownloadSlip();

    }

    @Test
    public void TC_PayrollPendingDownloadSlip() throws InterruptedException {

        payrolldownloadpaymentslip = payrolldownloadpaymentslip
                .selectDateBetweenField()
                .selectTransaction()
                .clickSearchButton()
                .clickDownloadBtn();

        Thread.sleep(8000);

    }

    @AfterMethod
    public void TearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }

}
