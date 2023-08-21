package CorpNetApp.pom.page.operation_Maker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static CorpNetApp.pom.base.BaseTest.driver;

public class ReceiverLimitSetupByComMaker extends BaseTest {
    public String receiverLimitSetup;
    public String TCSALimitFileUpload;
    @FindBy(id = "companyId")
    WebElement selectCompanyEl;

    @FindBy(id = "file")
    WebElement fileUploadEL;

    @FindBy(id = "next")
    WebElement nextButtonEl;

    @FindBy(css = "button[type='submit']")
    WebElement limitsetupButtonEl;

    @FindBy(css = "body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(3)")
    WebElement selectBatchEl;


    public ReceiverLimitSetupByComMaker() {
        PageFactory.initElements(driver, this);
    }


    public ReceiverLimitSetupByComMaker selectCompany() {

        selectCompanyEl.isDisplayed();
        new Select(selectCompanyEl).selectByVisibleText(getCompanyName());
        return this;
    }


    public ReceiverLimitSetupByComMaker clickUploadBtn() {
        TCSALimitFileUpload=System.getProperty("user.dir")+getTCSALimitFileUpload();
        fileUploadEL.isDisplayed();
        fileUploadEL.sendKeys(TCSALimitFileUpload);

        return this;
    }


    public ReceiverLimitSetupByComMaker clickNextBtn() throws InterruptedException {

        nextButtonEl.isDisplayed();
        nextButtonEl.click();

        selectBatchEl.isDisplayed();
        receiverLimitSetup = selectBatchEl.getText();

        System.out.println("Receiver Is " + receiverLimitSetup);

        limitsetupButtonEl.isDisplayed();
        limitsetupButtonEl.click();
        Thread.sleep(10000);
        return this;
    }

}
