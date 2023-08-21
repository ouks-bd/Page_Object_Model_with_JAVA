package CorpNetApp.pom.test.testOperation.TestCases_CompanyManagement.TestCases_CreateCompany;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.OPS_MakerLoginPage;
import CorpNetApp.pom.page.operation_Maker_MenuPages.CreateNewCompanyPageByMaker;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_1_CreateCompanyWithAllValidData extends BaseTest {
    CreateNewCompanyPageByMaker createNewCompanyPageByMaker;

    public TC_1_CreateCompanyWithAllValidData() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        // newCompanyAddPage = new LoginPageCorp().loginCorp(getUsername(), getPassword()).clickAddNewCompany();

        createNewCompanyPageByMaker = new OPS_MakerLoginPage().MakerLoginCorp(getMakerUser(), getMakerPass()).clickAddNewCompany();
    }

    @Test
    public void addNewCompanyShouldSuccess(ITestContext context) throws InterruptedException {

        String newCompanyName = createNewCompanyPageByMaker.company;
        createNewCompanyPageByMaker = createNewCompanyPageByMaker
                .fillCompanyName()
                .fillCompanyCode()
                .fillCompanyPhone("01730796749")
                .fillCompanyEmail(getComEmail())
                .fillAddress("121/KHA,RAMPURA")
                .fillCompanyCif(getCIF())
                .fillContactPerson("Md Alimun Hasan")
                .fillContactPhn("01915777041")
                .ClickRadioButton()
                .FillEmpId()
                .fillRm("23852")
                .ClickCreateBtn();

        Thread.sleep(8000);
        context.setAttribute("NewCompanyName", newCompanyName);
        System.out.println("Successfully Create a new company, Company Name:- " + newCompanyName);

        String ExpectedTitle = "Company Created Successfully";
        String ActualTitle = driver.findElement(By.cssSelector("h1.card-title > label")).getText();
        Assert.assertEquals(ActualTitle, ExpectedTitle);


        Thread.sleep(8000);

    }

    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }


}
