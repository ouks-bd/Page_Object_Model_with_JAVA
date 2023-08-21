package CorpNetApp.pom.test.testOperation.TestCases_CompanyManagement.TestCases_ReceiverManagement;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.OPS_UsersLoginPage;
import CorpNetApp.pom.page.operation_Maker_MenuPages.ReceiverLimitSetupByComMaker;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_ReceiverLimitSetupByComMaker extends BaseTest {

    ReceiverLimitSetupByComMaker receiverLimitSetupByComMaker;

    String Message;
    String ActualMessage = "Receiver Limit Setup Successful!";

    public TC_ReceiverLimitSetupByComMaker() {
        super();
    }

    @BeforeMethod
    public void SetUP() {

        initialization();

        receiverLimitSetupByComMaker = new OPS_UsersLoginPage().loginCorp(getMakerUser(), getMakerPass()).clickReceiverLimitSetup();
    }

    @Test()
    public void TC_ReceiverLimitSetupByComMaker(ITestContext context) throws InterruptedException {
        receiverLimitSetupByComMaker = receiverLimitSetupByComMaker
                .selectCompany()
                .clickUploadBtn()
                .clickNextBtn();


        String receiverLimitSetupReferenceNumber = receiverLimitSetupByComMaker.receiverLimitSetup;
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
