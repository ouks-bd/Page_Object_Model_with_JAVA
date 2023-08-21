package CorpNetApp.pom.test.testOperation.TestCases_UserManagement;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.OPS_UsersLoginPage;
import CorpNetApp.pom.page.operation_Maker_MenuPages.CreateUserByMaker;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_CreateCompanyApproverUserByOPS_Maker extends BaseTest {
    CreateUserByMaker createUserByMaker;

    TC_CreateCompanyApproverUserByOPS_Maker() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        createUserByMaker = new OPS_UsersLoginPage().loginCorp(getMakerUser(), getMakerPass()).clickCreateUserMenu();
    }

    @Test
    public void createComApproverUserSuccess() throws InterruptedException {
        createUserByMaker = createUserByMaker
                .selectCompany()
                .selectUserTypeApprove()
                .selectApproveRole()
                .selectSignatory(2)
                .fillApproveUserDetails()
                .clickCreateBtn();

        Thread.sleep(10000);
    }

    @AfterMethod
    public void TearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
