package CorpNetApp.pom.test.testOperation.TestCases_CompanyManagement.TestCases_CreateAccount;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.OPS_MakerLoginPage;
import CorpNetApp.pom.page.operation_Maker_MenuPages.CreateComAccountManaPageByMaker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_CreateCompanyAccountWithValidData extends BaseTest {
    CreateComAccountManaPageByMaker createComAccountManaPageByMaker;

    public TC_CreateCompanyAccountWithValidData() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        createComAccountManaPageByMaker = new OPS_MakerLoginPage().MakerLoginCorp(getMakerUser(), getMakerPass()).clickCompanyAccountManageMenu();

        // companyAccountManagement=new MakerLoginCrop().MakerLoginCorp(getMakerUser(), getMakerPass());
    }

    @Test
    public void showCompanyAccountDetailsAndCreateSuccess(ITestContext context) throws InterruptedException {
        String CompanyName = (String) context.getAttribute("NewCompanyName");
        createComAccountManaPageByMaker = createComAccountManaPageByMaker
                .clickRadioBtn()
                .searchCompany(getCompanyName())
                .ClickCompanyAccountBtn()
                .clickCheckBoxCompanyAccount()
                .selectTCSAAcc()
                .clickSubmitBtn();
        Thread.sleep(10000);
    }

    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}

