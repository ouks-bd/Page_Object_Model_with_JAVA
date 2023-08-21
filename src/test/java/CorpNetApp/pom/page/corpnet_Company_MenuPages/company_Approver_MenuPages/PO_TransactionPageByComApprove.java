package CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Approver_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class PO_TransactionPageByComApprove extends BaseTest {
    public String DDBatchRefNo;
    @FindBy(css ="div label input.form-control-sm[aria-controls='dataTables-po']" )
    WebElement fillDDApproveBatchIdEl;

    @FindBy(css = "button.btn-light:nth-child(1) > svg:nth-child(1)")
    WebElement clickApproveBtnEl;

    @FindBy(css = "table td div[class='pincode-input-container']")
    WebElement fillOtpEl;
    @FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/div/div[1]/div/form[1]/div[2]/table/tbody/tr[2]/td[2]/div/input[1]")
    WebElement firstTokeNumberEl;

    @FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/div/div[1]/div/form[1]/div[2]/table/tbody/tr[2]/td[2]/div/input[2]")
    WebElement seconedTokeNumberEl;

    @FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/div/div[1]/div/form[1]/div[2]/table/tbody/tr[2]/td[2]/div/input[3]")
    WebElement thirdTokenNumberEl;

    @FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/div/div[1]/div/form[1]/div[2]/table/tbody/tr[2]/td[2]/div/input[4]")
    WebElement fourthTokenNumberEl;

    @FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/div/div[1]/div/form[1]/div[2]/table/tbody/tr[2]/td[2]/div/input[5]")
    WebElement fifthTokenNumberEl;

    @FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/div/div[1]/div/form[1]/div[2]/table/tbody/tr[2]/td[2]/div/input[6]")
    WebElement sixthTokenNumberEl;

    @FindBy(id="approveLink")
    WebElement clickApproveTokenBtnEl;

    @FindBy(id="okModalYes")
    WebElement clickYesBtnEl;


    public PO_TransactionPageByComApprove(){
        PageFactory.initElements(driver,this);
    }
    public PO_TransactionPageByComApprove searchPORemarks(String PORef) throws InterruptedException {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        fillDDApproveBatchIdEl.isDisplayed();
       // iftChBatch = fillIftBatchIdEl.getText();
        fillDDApproveBatchIdEl.sendKeys(PORef);
        Thread.sleep(3000);
        return this;
    }

    public PO_TransactionPageByComApprove clickApproveBtn() throws InterruptedException {
        clickApproveBtnEl.isDisplayed();
        clickApproveBtnEl.click();
        Thread.sleep(2000);
        return this;
    }
    public PO_TransactionPageByComApprove inputTokenNumber(){

        firstTokeNumberEl.isDisplayed();
        firstTokeNumberEl.sendKeys("2");

        seconedTokeNumberEl.isDisplayed();
        seconedTokeNumberEl.sendKeys("3");

        thirdTokenNumberEl.isDisplayed();
        thirdTokenNumberEl.sendKeys("1");

        fourthTokenNumberEl.isDisplayed();
        fourthTokenNumberEl.sendKeys("4");

        fifthTokenNumberEl.isDisplayed();
        fifthTokenNumberEl.sendKeys("0");

        sixthTokenNumberEl.isDisplayed();
        sixthTokenNumberEl.sendKeys("2");

        return this;
    }

    public PO_TransactionPageByComApprove clickApproveTokenBtn() throws InterruptedException {
        clickApproveTokenBtnEl.isDisplayed();
        clickApproveTokenBtnEl.click();
        Thread.sleep(2000);
        return this;
    }

    public PO_TransactionPageByComApprove clickYesBtn() throws InterruptedException {
        clickYesBtnEl.isDisplayed();
        clickYesBtnEl.click();
        Thread.sleep(2000);
        return this;
    }


}
