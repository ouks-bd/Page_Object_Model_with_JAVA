package CorpNetApp.pom.test.testOperation.TestCases_CompanyManagement.TestCase_MemberSetupAndSignatorySetup;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.OPS_UsersLoginPage;
import CorpNetApp.pom.page.operation_Maker_MenuPages.MemberSetupPageByMaker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_CreateMemberWithAllValidDataForBoth extends BaseTest {
    MemberSetupPageByMaker memberSetupPage;

    public TC_CreateMemberWithAllValidDataForBoth() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        memberSetupPage = new OPS_UsersLoginPage().loginCorp(getMakerUser(), getMakerPass()).selectMemberSetupMenu();
    }

    @Test(priority = 0)
    public void CreateMemberSetupSuccess() throws InterruptedException {
        memberSetupPage = memberSetupPage
                .selectCompany()
                .searchCompany()
                .selectMemberGroupA()
                .FillComDivision("Dhaka")
                .fillMemberID()
                .fillEmail()
                .fillMob("01730796759")
                .fillAddress("121/K,Banasree,Dhaka-1219")
                .fillMemberName(getMemberName())
                .fillDesignation("SQA")
                .clickMemberSetupPurpose()
                .clickCreateBtn();
        Thread.sleep(4000);


    }

    @Test(priority = 1)
    public void CreateMemberSetupGroupBSuccess() throws InterruptedException {
        memberSetupPage = memberSetupPage
                .selectCompany()
                .searchCompany()
                .selectMemberGroupB()
                .FillComDivision("Dhaka")
                .fillMemberID()
                .fillEmail()
                .fillMob("01730796759")
                .fillAddress("121/K,Banasree,Dhaka-1219")
                .fillMemberName(getMemberNameB())
                .fillDesignation("SQA")
                .clickMemberSetupPurpose()
                .clickCreateBtn();
        Thread.sleep(4000);


    }

    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
