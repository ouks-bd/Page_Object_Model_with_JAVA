package CorpNetApp.pom.test.CompanyTransactionReports.TestCases_LegacyTransactionReport;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.Reports.transectionReportPage.FileSummaryReportBy;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_FileSummaryReport extends BaseTest {

    FileSummaryReportBy fileSummaryReportBy;

    public TC_FileSummaryReport() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        fileSummaryReportBy = new CompanyUsersLoginPage().CompMCUserLogin(getTranMCUser(), getTranMakerPass()).clickFileSummaryReport();

    }

    @Test
    public void TC_FileSummaryReport() throws InterruptedException {
        fileSummaryReportBy = fileSummaryReportBy
                .selectDateBetweenField()
                .clickOnSearchButton()
                .clickOnDetailsButton()
                .clickonGenerateButton();


        Thread.sleep(6000);

    }

    @AfterMethod
    public void TearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }


}
