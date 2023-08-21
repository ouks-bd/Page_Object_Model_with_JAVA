package CorpNetApp.pom.page.operation_Maker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static CorpNetApp.pom.base.BaseTest.driver;

public class ReceiverSetupByComMaker extends BaseTest {

    public String receiverLimitSetup;
    public String TCSAFileUpload;

    @FindBy (id = "companyId")
    WebElement selectCompanyEl;

    @FindBy(id = "file")
    WebElement fileUploadEL;

    @FindBy(id = "next")
    WebElement nextButtonEl;

    @FindBy(css = "button[type='submit']")
    WebElement receiverButtonEl;

    @FindBy(css = "body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > table:nth-child(5) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2)")
    WebElement selectBatchEl;


    public ReceiverSetupByComMaker() {
        PageFactory.initElements(driver, this);
    }


    public ReceiverSetupByComMaker selectCompany() {

        selectCompanyEl.isDisplayed();
        new Select(selectCompanyEl).selectByVisibleText(getCompanyName());
        return this;
    }


    public ReceiverSetupByComMaker clickUploadBtn()  {
        TCSAFileUpload=System.getProperty("user.dir")+getTCSAFileUpload();
        fileUploadEL.isDisplayed();
        fileUploadEL.sendKeys(TCSAFileUpload);

        return this;
    }


    public ReceiverSetupByComMaker clickNextBtn() throws InterruptedException {

        nextButtonEl.isDisplayed();
        nextButtonEl.click();

        selectBatchEl.isDisplayed();
        receiverLimitSetup = selectBatchEl.getText();

        System.out.println("Receiver Is "+receiverLimitSetup);

        receiverButtonEl.isDisplayed();
        receiverButtonEl.click();
        Thread.sleep(10000);
        return this;
    }

}
