package CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CustomDutyBulkPaymentPageByComMaker extends BaseTest {

    public String customDutyRefId;
    public String CustomDutyFileUpload;
    @FindBy(css = "input#file")
    WebElement browseEl;

    @FindBy(name = "debitRemarks")
    WebElement fillRemarksEl;

    @FindBy(id = "uploadBtn")
    WebElement clickUploadEl;

    @FindBy(css = "button.btn-primary[name='submit']")
    WebElement clickConfirmBtnEl;

    @FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/div/div/div/form[1]/div[1]/table/tbody/tr/td[2]")
    WebElement selectBatchEl;

    @FindBy(id = "submitButton")
    WebElement clickSubButtonEl;

    public CustomDutyBulkPaymentPageByComMaker() {
        PageFactory.initElements(driver, this);
    }

    public CustomDutyBulkPaymentPageByComMaker uploadCustomDutyBulk() {
        CustomDutyFileUpload=System.getProperty("user.dir")+getUploadCustomDutyBulk();
        browseEl.isDisplayed();
        browseEl.sendKeys(CustomDutyFileUpload);
        return this;

    }

    public CustomDutyBulkPaymentPageByComMaker fillRemarks(String remarks) {

        fillRemarksEl.isDisplayed();
        fillRemarksEl.sendKeys(remarks);
        return this;

    }


    public CustomDutyBulkPaymentPageByComMaker clickUploadBtn() throws InterruptedException {

        clickUploadEl.isDisplayed();
        clickUploadEl.click();
        Thread.sleep(10000);
        // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        return this;

    }


    public CustomDutyBulkPaymentPageByComMaker clickConfirmBtn() throws InterruptedException {
        Thread.sleep(5000);

        selectBatchEl.isDisplayed();
        customDutyRefId = selectBatchEl.getText();

        clickConfirmBtnEl.isDisplayed();
        clickConfirmBtnEl.click();
        Thread.sleep(2000);

        clickSubButtonEl.isDisplayed();
        clickSubButtonEl.click();

        Thread.sleep(3000);
        return this;
    }


}
