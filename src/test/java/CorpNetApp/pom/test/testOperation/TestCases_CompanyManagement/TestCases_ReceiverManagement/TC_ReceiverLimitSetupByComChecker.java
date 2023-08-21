package CorpNetApp.pom.test.testOperation.TestCases_CompanyManagement.TestCases_ReceiverManagement;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.OPS_UsersLoginPage;
import CorpNetApp.pom.page.operation_Checker_MenuPages.ReciverLimitSetupByComChecker;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_ReceiverLimitSetupByComChecker extends BaseTest {

    ReciverLimitSetupByComChecker reciverLimitSetupByComChecker;

    String Message;
    String ActualMessage="1 Batch Authorized Successfully!";

    public TC_ReceiverLimitSetupByComChecker() {
        super();
    }

    @BeforeMethod
    public void SetUP() {

        initialization();

        reciverLimitSetupByComChecker = new OPS_UsersLoginPage().loginCorp(getUsername(),getPassword()).clickReceiverLimitSetupSummary();

    }
    @Test()
    public void TC_ReceiverLimitSetupByComChecker(ITestContext context) throws InterruptedException {

        String reciverlimitSetupReferenceNumber = (String) context.getAttribute("ReferenceNumber");

        reciverLimitSetupByComChecker =reciverLimitSetupByComChecker
                .searchButton(reciverlimitSetupReferenceNumber)
                .detailsButton()
                .approveButton();

        System.out.println(" Batch Approved Successfully! :- " + reciverlimitSetupReferenceNumber);

        Thread.sleep(5000);

        Message = driver.findElement(By.xpath("//p[@id='globalAlertBody']")).getText();
        Assert.assertEquals(Message,ActualMessage);


        Thread.sleep(10000);

    }
    @AfterMethod
    public void tearDown()
    {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }

}
