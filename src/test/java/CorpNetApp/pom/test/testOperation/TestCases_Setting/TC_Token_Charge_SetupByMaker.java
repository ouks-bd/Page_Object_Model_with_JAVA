package CorpNetApp.pom.test.testOperation.TestCases_Setting;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.OPS_MakerLoginPage;
import CorpNetApp.pom.page.operation_Maker_MenuPages.TokenSetupPageByOpsMaker;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_Token_Charge_SetupByMaker extends BaseTest {

    TokenSetupPageByOpsMaker tokenSetupPageByOpsMaker;

    public TC_Token_Charge_SetupByMaker() {
        PageFactory.initElements(driver, this);

    }

    @BeforeMethod
    public void setUp() {
        initialization();
        tokenSetupPageByOpsMaker = new OPS_MakerLoginPage().MakerLoginCorp(getMakerUser(), getMakerPass()).clickTokenChargeSetupMenu();
    }

    @Test
    public void createTokenChargeSetupSuccess() throws InterruptedException {

        tokenSetupPageByOpsMaker = tokenSetupPageByOpsMaker
                .selectCompany()
                .selectMemberId(1)
                .selectComAcc()
                .fillAllData()
                .clickCreateBtn();
        Thread.sleep(5000);
    }

    @AfterMethod
    public void TearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
