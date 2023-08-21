package CorpNetApp.pom.test.testOperation.TestCases_Setting;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.OPS_MakerLoginPage;
import CorpNetApp.pom.page.operation_Maker_MenuPages.ChargeSetupPage;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_ChargeSetupForMemberWithValidData extends BaseTest {

    ChargeSetupPage chargeSetupPage;

    public TC_ChargeSetupForMemberWithValidData() {
        super();

    }

    @BeforeMethod
    public void setUp() {
        initialization();
        chargeSetupPage = new OPS_MakerLoginPage().MakerLoginCorp(getMakerUser(), getMakerPass()).clickChargeSetupMenu();
    }

    @Test
    public void TC_ChargeSetupForMemberWithValidData() throws InterruptedException {
        chargeSetupPage = chargeSetupPage
                .selectCompany()
                .paymentMethod()
                .fillAmount()
                .vatAmount()
               .createButton();
        Thread.sleep(12000);
    }

    @AfterMethod
    public void TearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }

}
