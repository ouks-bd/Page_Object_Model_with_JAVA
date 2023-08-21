package CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Checker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PO_Issuance_CheckerPage extends BaseTest {
    public String PORefID;
    @FindBy(css = "div label input[aria-controls='POTransaction']")
    WebElement fillPayrollBatchIdEl;
    @FindBy(css = "div tr td input.checkbox-po-trx-ref")
    WebElement getPORefID;

    @FindBy(css = "#POTransaction > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(13) > button:nth-child(1) > svg:nth-child(1)")
    WebElement clickAuthorizeBtnEl;

    @FindBy(css = ".even > td:nth-child(1) > div:nth-child(1) > input:nth-child(1)")
    WebElement clickSigRadioBtnEl;
    @FindBy(id = "idSubmitButton")
    WebElement clickSubmitButtonEl;

    @FindBy(id = "idRejectButton")
    WebElement clickRejectBtnEl;

    @FindBy(css = "input#idRejectionReason")
    WebElement fillRejectReasonEl;

    @FindBy(id = "messageModalCancleTransactionYesAll")
    WebElement clickYesButtonEl;


    public PO_Issuance_CheckerPage() {
        PageFactory.initElements(driver, this);
    }

    public PO_Issuance_CheckerPage searchPORemarks() throws InterruptedException {

        fillPayrollBatchIdEl.isDisplayed();
        fillPayrollBatchIdEl.sendKeys("PO_Beneficiary_Transaction");
        Thread.sleep(3000);
        getPORefID.isDisplayed();
        PORefID=getPORefID.getAttribute("value");

        return this;
    }

    public PO_Issuance_CheckerPage getPORefID() {
        getPORefID.isDisplayed();
        PORefID=getPORefID.getAttribute("value");
        return this;
    }

    public PO_Issuance_CheckerPage clickAuthorizeBtn() throws InterruptedException {
        clickAuthorizeBtnEl.isDisplayed();
        clickAuthorizeBtnEl.click();
        Thread.sleep(8000);
        return this;

    }

    public PO_Issuance_CheckerPage clickSubmitBtn() throws InterruptedException {

        clickSubmitButtonEl.isDisplayed();
        clickSubmitButtonEl.click();
        return this;

    }
}
