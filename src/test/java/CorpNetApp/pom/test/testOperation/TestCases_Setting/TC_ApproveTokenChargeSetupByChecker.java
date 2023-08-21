package CorpNetApp.pom.test.testOperation.TestCases_Setting;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.OPS_UsersLoginPage;
import CorpNetApp.pom.page.operation_Checker_MenuPages.ListOfTokenPageByCheckerForApprove;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_ApproveTokenChargeSetupByChecker extends BaseTest {
    ListOfTokenPageByCheckerForApprove listOfTokenPageByCheckerForApprove;

    public TC_ApproveTokenChargeSetupByChecker() {
        PageFactory.initElements(driver, this);
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        listOfTokenPageByCheckerForApprove = new OPS_UsersLoginPage().loginCorp(getUsername(), getPassword()).clickChargeTokenListMenu();
    }

    @Test
    public void authorizeTokenChargeSuccess() throws InterruptedException {
        listOfTokenPageByCheckerForApprove = listOfTokenPageByCheckerForApprove
                .selectCom()
                .clickDetailsBtn()
                .clickSubBtn();
        Thread.sleep(5000);
    }

    @AfterMethod
    public void TearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
