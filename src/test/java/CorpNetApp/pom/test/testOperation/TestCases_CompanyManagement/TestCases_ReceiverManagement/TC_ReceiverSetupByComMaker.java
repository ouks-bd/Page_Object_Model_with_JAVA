package CorpNetApp.pom.test.testOperation.TestCases_CompanyManagement.TestCases_ReceiverManagement;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.OPS_UsersLoginPage;
import CorpNetApp.pom.page.operation_Maker_MenuPages.ReceiverSetupByComMaker;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TC_ReceiverSetupByComMaker extends BaseTest {

    ReceiverSetupByComMaker receiverSetupByComMaker;

    String Message;
    String ActualMessage = "Receiver Saved Successfully!";

    public TC_ReceiverSetupByComMaker() {
        super();
    }

    @BeforeMethod
    public void SetUP() {

        initialization();

        receiverSetupByComMaker = new OPS_UsersLoginPage().loginCorp(getMakerUser(), getMakerPass()).clickReciverSetup();
    }

    @Test()
    public void TC_ReceiverSetupByComMakerSuccess(ITestContext context) throws InterruptedException {
        receiverSetupByComMaker = receiverSetupByComMaker
                .selectCompany()
                .clickUploadBtn()
                .clickNextBtn();

        String receiverLimitSetupReferenceNumber = receiverSetupByComMaker.receiverLimitSetup;
        context.setAttribute("ReferenceNumber", receiverLimitSetupReferenceNumber);
        System.out.println("Receiver Saved Successfully! :- " + receiverLimitSetupReferenceNumber);

        Message = driver.findElement(By.xpath("//p[@id='globalAlertBody']")).getText();
        Assert.assertEquals(Message, ActualMessage);


        Thread.sleep(1000);

    }

    @AfterMethod
    public void TearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }


}
