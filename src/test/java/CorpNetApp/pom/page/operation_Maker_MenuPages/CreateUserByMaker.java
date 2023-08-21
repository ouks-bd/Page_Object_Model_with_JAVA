package CorpNetApp.pom.page.operation_Maker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateUserByMaker extends BaseTest {

    @FindBy(id = "company")
    WebElement selectComFromDWEl;
    @FindBy(css = "input[value='8']")
    WebElement checkUserTypeEl;
    @FindBy(css = "div label[for='userRole11']")
    WebElement checkPOSITIVE_PAY_MAKEREl;
    @FindBy(css = "div label[for='userRole15']")
    WebElement checkMakerBillPaymentEl;
    @FindBy(css = "div label[for='userRole16']")
    WebElement checkVAM_MAKEREl;
    @FindBy(css = "div label[for='userRole17']")
    WebElement checkMakerRevisedEl;
    @FindBy(css = "div label[for='userRole18']")
    WebElement checkMakerCollectionEl;
    @FindBy(css = "div label[for='userRole19']")
    WebElement checkMultiFileModeRestrictedEl;
    @FindBy(css = "div label[for='userRole110']")
    WebElement checkMakerPaymentMultiFileModeEl;
    @FindBy(css = "div label[for='userRole111']")
    WebElement checkMakerPayrollModuleEl;
    @FindBy(css = "div label[for='userRole112']")
    WebElement checkMAKER_PAYORDER_ISSUANCEEl;
    @FindBy(css = "div label[for='userRole113']")
    WebElement checkMultiFile_ReportView_MakerEl;

    //Checker
    @FindBy(css = "input[value='9']")
    WebElement checkUserTypeCheckerEl;

    @FindBy(css = "div label[for='userRole124']")
    WebElement checkCHECKER_PAYORDER_ISSUANCEEl;
    @FindBy(css = "div label[for='userRole123']")
    WebElement CheckerPayrollEl;
    @FindBy(css = "div label[for='userRole122']")
    WebElement checkMultiFileCheckerEl;
    @FindBy(css = "div label[for='userRole121']")
    WebElement checkBillPaymentCheckerEl;
    @FindBy(css = "div label[for='userRole120']")
    WebElement checkCheckerReviseEl;
    @FindBy(css = "div label[for='userRole119']")
    WebElement checkMultiModeRestrictionCheckerEl;
    @FindBy(css = "div label[for='userRole118']")
    WebElement checkCheckerPaymentSpecialMultiFileModeEl;

    @FindBy(css = "div label[for='userRole117']")
    WebElement checkCheckerVamEl;
    @FindBy(css = "div label[for='userRole115']")
    WebElement checkPOSITIVE_PAY_CHECKEREl;

    @FindBy(css = "div label[for='userRole114']")
    WebElement checkCheckerCollectionEl;

    //Approve

    @FindBy(css = "input[value='10']")
    WebElement checkUserTypeApproveEl;
    @FindBy(css = "div label[for='userRole133']")
    WebElement checkApprove_PAYORDER_ISSUANCEEl;
    @FindBy(css = "div label[for='userRole130']")
    WebElement ApprovePayrollEl;
    @FindBy(css = "div label[for='userRole129']")
    WebElement checkMultiFileApproveEl;
    @FindBy(css = "div label[for='userRole126']")
    WebElement checkBillPaymentApproveEl;
    @FindBy(css = "div label[for='userRole127']")
    WebElement checkApproveReviseEl;
    @FindBy(css = "div label[for='userRole128']")
    WebElement checkRevisedCollectionModeEl;
    @FindBy(css = "div label[for='userRole125']")
    WebElement checkApprovePaymentSpecialMultiFileModeEl;
    @FindBy(css = "div label[for='userRole132']")
    WebElement checkApproveCollectionEl;

    @FindBy(id = "memberid")
    WebElement selectSignatoryEl;

    @FindBy(id = "username")
    WebElement fillUserEl;
    @FindBy(id = "fullName")
    WebElement fillFullNameEl;
    @FindBy(id = "email")
    WebElement fillEmailEl;
    @FindBy(id = "phone")
    WebElement fillPhoneEl;
    @FindBy(name = "submit")
    WebElement clickCreateBtn;


    public CreateUserByMaker() {
        PageFactory.initElements(driver, this);
    }

    public CreateUserByMaker selectCompany() throws InterruptedException {
        selectComFromDWEl.isDisplayed();
        Thread.sleep(10000);
        new Select(selectComFromDWEl).selectByVisibleText(getCompanyName());
        Thread.sleep(2000);
        return this;
    }

    public CreateUserByMaker selectUserType() {
        checkUserTypeEl.isDisplayed();
        checkUserTypeEl.click();
        return this;
    }

    public CreateUserByMaker selectRoles() throws InterruptedException {
        checkVAM_MAKEREl.isDisplayed();
        checkPOSITIVE_PAY_MAKEREl.click();
        checkMAKER_PAYORDER_ISSUANCEEl.click();
        checkVAM_MAKEREl.click();
        checkMakerCollectionEl.click();
        checkMakerBillPaymentEl.click();
        checkMakerRevisedEl.click();
        checkMakerPaymentMultiFileModeEl.click();
        Thread.sleep(500);
        checkMultiFileModeRestrictedEl.click();
        Thread.sleep(500);
        checkMakerPayrollModuleEl.click();
        Thread.sleep(1000);
        //  checkMultiFile_ReportView_MakerEl.click();
        Thread.sleep(2000);
        return this;
    }

    public CreateUserByMaker selectUserTypeChecker() throws InterruptedException {
        checkUserTypeCheckerEl.isDisplayed();
        checkUserTypeCheckerEl.click();
        Thread.sleep(2000);
        return this;
    }

    public CreateUserByMaker selectCheckerRole() throws InterruptedException {

        CheckerPayrollEl.click();
        checkMultiFileCheckerEl.click();
        checkBillPaymentCheckerEl.click();
        checkCheckerReviseEl.click();
        checkMultiModeRestrictionCheckerEl.click();
        checkCheckerPaymentSpecialMultiFileModeEl.click();

        checkCheckerVamEl.click();
        checkPOSITIVE_PAY_CHECKEREl.click();
        checkCheckerCollectionEl.click();
        // checkCHECKER_PAYORDER_ISSUANCEEl.click();
        Thread.sleep(2000);
        return this;
    }

    public CreateUserByMaker selectUserTypeApprove() throws InterruptedException {
        checkUserTypeApproveEl.isDisplayed();
        checkUserTypeApproveEl.click();
        return this;
    }

    public CreateUserByMaker selectApproveRole() throws InterruptedException {
        // checkApprove_PAYORDER_ISSUANCEEl.isDisplayed();
        // ApprovePayrollEl.click();
        checkMultiFileApproveEl.click();
        checkBillPaymentApproveEl.click();
        checkApproveReviseEl.click();
        checkRevisedCollectionModeEl.click();
        checkApprovePaymentSpecialMultiFileModeEl.click();
        checkApproveCollectionEl.click();
        Thread.sleep(2000);
        return this;
    }

    public CreateUserByMaker fillUserDetails() throws InterruptedException {

        fillUserEl.isDisplayed();
        fillUserEl.sendKeys(getComMCUser());
        fillFullNameEl.isDisplayed();
        fillFullNameEl.sendKeys("Test MC User");
        fillEmailEl.isDisplayed();
        fillEmailEl.sendKeys(getComEmail());
        fillPhoneEl.isDisplayed();
        fillPhoneEl.sendKeys("01730796749");
        Thread.sleep(2000);
        return this;
    }

    public CreateUserByMaker fillApproveUserDetails() throws InterruptedException {

        fillUserEl.isDisplayed();
        fillUserEl.sendKeys(getComApproveUser());
        //fillFullNameEl.isDisplayed();
        //fillFullNameEl.sendKeys("Test A User");
       // fillEmailEl.isDisplayed();
       // fillEmailEl.sendKeys(getComEmail());
       // fillPhoneEl.isDisplayed();
        //fillPhoneEl.sendKeys("01730796749");
        Thread.sleep(2000);
        return this;
    }

    public CreateUserByMaker selectSignatory(int index) {

        selectSignatoryEl.isDisplayed();
        new Select(selectSignatoryEl).selectByIndex(index);
        return this;
    }

    public CreateUserByMaker clickCreateBtn() {

        clickCreateBtn.isDisplayed();
        clickCreateBtn.click();
        return this;
    }
}
