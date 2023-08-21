package CorpNetApp.pom.test.testOperation.TestCases_SelfAccountSetUp;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.operation_Maker_MenuPages.CompanySelfAccountSetupPage;
import CorpNetApp.pom.page.operation_Maker_MenuPages.CompanySelfAccountSetupUpdatePage;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_Company_UpdateSelfAccountWithValidData extends BaseTest {

    CompanySelfAccountSetupUpdatePage companySelfAccountSetupUpdatePage;

    public TC_Company_UpdateSelfAccountWithValidData() {
        super();

    }

    @BeforeMethod
    public void setUp() {
        initialization();
        companySelfAccountSetupUpdatePage = new CompanyUsersLoginPage().ComSpAuthLogin(getMakerUser(), getMakerPass()).clickSelfUpdate();
    }

    @Test
    public void Success_Own_Account_Setup_Update() throws InterruptedException {
        companySelfAccountSetupUpdatePage = companySelfAccountSetupUpdatePage
                .searchComp()
                .clickEditBtn()
                .clearSelfName()
                .clickUpdateBtn();
        Assert.assertEquals(CompanySelfAccountSetupUpdatePage.actualMsg,CompanySelfAccountSetupUpdatePage.expectMsg);
     //   Assert.assertTrue(companySelfAccountSetupUpdatePage.hasWelcome());
       // Assert.assertEquals(CompanySelfAccountSetupUpdatePage.)
        System.out.println("Success Massage:" + CompanySelfAccountSetupUpdatePage.Message);
        //.clickModuleRadio()
        //.clickUploadBtn();
        Thread.sleep(20000);
    }

    @AfterMethod
    public void TearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}

