package CorpNetApp.pom.test.testOperation.TestCases_SelfAccountSetUp;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.operation_Maker_MenuPages.CompanySelfAccountSetupPage;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_Company_CreateSelfAccountWithValidData extends BaseTest {

    CompanySelfAccountSetupPage companySelfAccountSetupPage;


    public TC_Company_CreateSelfAccountWithValidData() {
        super();

    }

    @BeforeMethod
    public void setUp() {
        initialization();
        companySelfAccountSetupPage = new CompanyUsersLoginPage().ComSpAuthLogin(getMakerUser(), getTranMakerPass()).clickSelf();
    }

    @Test
    public void Success_Own_Account_Setup_SpAuth_Bulk_Upload() throws InterruptedException {
        companySelfAccountSetupPage = companySelfAccountSetupPage
                .selectComp()
                .uploadFile()
                .clickModuleRadio()
                .clickUploadBtn();
        Thread.sleep(20000);
    }

    @AfterMethod
    public void TearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}

