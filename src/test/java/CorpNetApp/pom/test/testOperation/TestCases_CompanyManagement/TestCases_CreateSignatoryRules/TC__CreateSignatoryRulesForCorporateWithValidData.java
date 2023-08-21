package CorpNetApp.pom.test.testOperation.TestCases_CompanyManagement.TestCases_CreateSignatoryRules;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.OPS_UsersLoginPage;
import CorpNetApp.pom.page.operation_Maker_MenuPages.CreateComplexSignatoryRulesByMaker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC__CreateSignatoryRulesForCorporateWithValidData extends BaseTest {

    CreateComplexSignatoryRulesByMaker createComplexSignatoryRulesByMaker;

    public TC__CreateSignatoryRulesForCorporateWithValidData() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        createComplexSignatoryRulesByMaker = new OPS_UsersLoginPage().loginCorp(getMakerUser(), getMakerPass()).clickComplexSignatoryRuleMenu();
    }

    @Test

    public void CreateComplexSignatoryRulesSuccess() throws InterruptedException {
        createComplexSignatoryRulesByMaker = createComplexSignatoryRulesByMaker
                .selectCompany()
                .selectPaymentMedia()
                .selectPaymentMediaItem()
                .fillLowerLimit()
                .fillUpperLimit()
                .clickAddRulesBtn()
                .clickAddRow()
                .selectSigGroupB()
                .selectSigGroupA()
                .clickGenerateBtn()
                .clickCreateBtn();

        Thread.sleep(10000);

    }

    @AfterMethod
    public void TearDown() {

        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
