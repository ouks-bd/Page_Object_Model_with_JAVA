package CorpNetApp.pom.test.testOperation.TestCases_Setting;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.OPS_MakerLoginPage;
import CorpNetApp.pom.page.operation_Maker_MenuPages.AddNewCompanyCutoffTimePage;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_CreateCompanyCutOffByMaker extends BaseTest {

    AddNewCompanyCutoffTimePage addNewCompanyCutoffTimePage;

    public TC_CreateCompanyCutOffByMaker() {
        PageFactory.initElements(driver, this);
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        addNewCompanyCutoffTimePage = new OPS_MakerLoginPage().MakerLoginCorp(getMakerUser(), getMakerPass()).clickCutOffEl();
    }

    @Test
    public void addCompanyCutOffSuccess() throws InterruptedException {
        addNewCompanyCutoffTimePage = addNewCompanyCutoffTimePage
                .selectCom()
                .clickSubBt();
        Thread.sleep(5000);
    }

    @AfterMethod
    public void TearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
