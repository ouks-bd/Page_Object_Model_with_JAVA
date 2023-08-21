package CorpNetApp.pom.test.testOperation.TestCases_CompanyManagement.TestCases_ReceiverManagement;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.OPS_UsersLoginPage;
import CorpNetApp.pom.page.operation_Checker_MenuPages.ReceiverSummaryByComChecker;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_ReceiverSetupByComChecker extends BaseTest {

    ReceiverSummaryByComChecker receiverSummaryByComChecker;

    String Message;
    String ActualMessage = "Batch Approved Successfully!";

    public TC_ReceiverSetupByComChecker() {
        super();
    }

    @BeforeMethod
    public void SetUP() {

        initialization();

        receiverSummaryByComChecker = new OPS_UsersLoginPage().loginCorp(getUsername(), getPassword()).clickReciverSetupSummary();
    }

    @Test()
    public void TC_ReceiverSetupByComCheckerSuccess(ITestContext context) throws InterruptedException {

        String receiverLimitSetupReferenceNumber = (String) context.getAttribute("ReferenceNumber");

        receiverSummaryByComChecker = receiverSummaryByComChecker
                .searchButton(receiverLimitSetupReferenceNumber)
                .detailsButton()
                .approveButton();

        System.out.println(" Batch Approved Successfully! :- " + receiverLimitSetupReferenceNumber);

        Thread.sleep(5000);

        Message = driver.findElement(By.xpath("//p[@id='globalAlertBody']")).getText();
        Assert.assertEquals(Message, ActualMessage);


        Thread.sleep(10000);

    }
    @AfterMethod
    public void TearDown()
    {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }

}
