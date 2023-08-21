package CorpNetApp.pom.test.CompanyTransactionReports.TestCases_PayrollReport;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.Reports.payrollReportPage.TransactionReport;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_TransactionReport extends BaseTest {

    TransactionReport transactionReport;

    public TC_TransactionReport() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        transactionReport = new CompanyUsersLoginPage().CompMCUserLogin(getTranMCUser(), getTranMakerPass()).clickTransactionReport();

    }
    @Test
    public void TC_TransactionReport () throws InterruptedException {
        transactionReport = transactionReport
                .selectDateBetweenField()
                .selectTransaction(1)
                .clickSearchButton();



        Thread.sleep(8000);

    }
    @AfterMethod
    public void TearDown(){
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
