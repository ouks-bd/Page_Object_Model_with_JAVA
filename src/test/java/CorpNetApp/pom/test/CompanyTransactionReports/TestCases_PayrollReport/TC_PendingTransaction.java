package CorpNetApp.pom.test.CompanyTransactionReports.TestCases_PayrollReport;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.Reports.payrollReportPage.PendingTransactionList;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_PendingTransaction extends BaseTest {

    PendingTransactionList pendingTransactionList;


    public TC_PendingTransaction() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        pendingTransactionList = new CompanyUsersLoginPage().CompMCUserLogin(getTranMCUser(), getTranMakerPass()).clickPendingTransactionList();

    }

    @Test
    public void TC_PendingTransaction () throws InterruptedException {
//        pendingTransactionList = pendingTransactionList
//                .selectDateBetweenField()
//                .selecTransection()
//                .clickSearchButton();



        Thread.sleep(8000);

    }
    @AfterMethod
    public void TearDown(){
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
