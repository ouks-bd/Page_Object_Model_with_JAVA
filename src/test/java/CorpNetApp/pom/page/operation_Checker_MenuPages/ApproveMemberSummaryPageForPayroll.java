package CorpNetApp.pom.page.operation_Checker_MenuPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static CorpNetApp.pom.base.BaseTest.driver;

public class ApproveMemberSummaryPageForPayroll {

    @FindBy(css = "#inlineCheckbox1")
    WebElement unAuthorizeEl;

    @FindBy(css = "tr[class='odd'] a[class='btn btn-success']")
    WebElement detailsButtonEl;

    @FindBy(css = "#checkAll")
    WebElement checkAllClickEl;

    @FindBy (css = "button[type='submit']")
    WebElement submitButtonEl;

    @FindBy(css = "#idRejectButton")
    WebElement rejectButtonEl;

    @FindBy(css = "#rejectionReason")
    WebElement rejectReasonEl;

    @FindBy(css = "#messageModalYes")
    WebElement rejectYesButtonEl;

    public ApproveMemberSummaryPageForPayroll() {
        PageFactory.initElements(driver, this);
    }

    public ApproveMemberSummaryPageForPayroll clickOnUnAuthorize()  {

        unAuthorizeEl.isDisplayed();
        unAuthorizeEl.click();
        return this;
    }

    public ApproveMemberSummaryPageForPayroll clickOnDetails()  {

        detailsButtonEl.isDisplayed();
        detailsButtonEl.click();
        return this;
    }

    public ApproveMemberSummaryPageForPayroll clickOnAllButton()  {

        checkAllClickEl.isDisplayed();
        checkAllClickEl.click();
        return this;
    }

    public ApproveMemberSummaryPageForPayroll clickOnSubmitButton(){

        submitButtonEl.isDisplayed();
        submitButtonEl.click();

        return this;
    }

    public ApproveMemberSummaryPageForPayroll clickOnRejectButton(){

        rejectButtonEl.isDisplayed();
        rejectButtonEl.click();

        rejectReasonEl.isDisplayed();
        rejectReasonEl.sendKeys("test");

        rejectYesButtonEl.isDisplayed();
        rejectYesButtonEl.click();

        return this;
    }

}
