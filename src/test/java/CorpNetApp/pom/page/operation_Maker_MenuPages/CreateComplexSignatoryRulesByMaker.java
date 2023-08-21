package CorpNetApp.pom.page.operation_Maker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateComplexSignatoryRulesByMaker extends BaseTest {


    @FindBy(id = "selectCompanyId")
    WebElement selectCompanyEl;
    @FindBy(css = "div td div.bootstrap-select")
    WebElement clickPaymentMediaEl;
    @FindBy(id = "bs-select-1-1")
    WebElement selectBBlEl;
    @FindBy(id = "bs-select-1-2")
    WebElement selectEFTEl;
    @FindBy(id = "bs-select-1-3")
    WebElement selectRTGSEl;
    @FindBy(id = "bs-select-1-4")
    WebElement selectDDOWNl;
    @FindBy(id = "bs-select-1-5")
    WebElement selectDDThirdEl;
    @FindBy(id = "bs-select-1-6")
    WebElement selectSpWonEl;
    @FindBy(id = "bs-select-1-7")
    WebElement selectSpThirdEl;
    @FindBy(id = "bs-select-1-8")
    WebElement selectDDCanEl;
    @FindBy(id = "bs-select-1-9")
    WebElement selectBillPayEl;
    @FindBy(id = "bs-select-1-10")
    WebElement selectPayOrderEl;


    @FindBy(name = "lowerLimit")
    WebElement fillLowerLimitEl;
    @FindBy(name = "upperLimit")
    WebElement upperLimitEl;
    @FindBy(id = "addRulesButtonId1")
    WebElement clickAddRuleBtn;
    @FindBy(id = "group11")
    WebElement clickGroupDropDownEl;
    @FindBy(css = "select option[value='A']")
    WebElement selectGroupAEl;
    @FindBy(id = "number11")
    WebElement fillGroupNumberEl;
    @FindBy(css = "input[value='Add Row']")
    WebElement clickAddRowEl;

    @FindBy(id = "group21")
    WebElement clickGroupDropDownBEl;
    //@FindBy(css = "select option[value='B']")
    @FindBy(css = "#group21 > option:nth-child(2)")
    WebElement selectGroupBEl;

    @FindBy(id = "number21")
    WebElement fillGroupNumberBEl;
    @FindBy(css = "button[onclick*='generateRule']")
    WebElement clickGenerateBtnEl;
    @FindBy(css = "button.btn:nth-child(6)")
    WebElement clickCreateBtnEl;


    public CreateComplexSignatoryRulesByMaker() {
        PageFactory.initElements(driver, this);
    }

    public CreateComplexSignatoryRulesByMaker selectCompany() {
        selectCompanyEl.isDisplayed();
        new Select(selectCompanyEl).selectByVisibleText(getCompanyName());
        return this;

    }

    public CreateComplexSignatoryRulesByMaker selectPaymentMedia() throws InterruptedException {
        clickPaymentMediaEl.isDisplayed();
        clickPaymentMediaEl.click();
        Thread.sleep(2000);

        return this;

    }

    public CreateComplexSignatoryRulesByMaker selectPaymentMediaItem() throws InterruptedException {

        selectBBlEl.click();
        selectEFTEl.click();
        selectRTGSEl.click();
        selectDDOWNl.click();
        selectDDThirdEl.click();
        selectSpWonEl.click();
        selectSpThirdEl.click();
        selectDDCanEl.click();
        selectBillPayEl.click();
        selectPayOrderEl.click();
        return this;

    }

    public CreateComplexSignatoryRulesByMaker fillLowerLimit() {
        fillLowerLimitEl.isDisplayed();
        fillLowerLimitEl.sendKeys("0");
        return this;

    }

    public CreateComplexSignatoryRulesByMaker fillUpperLimit() {
        upperLimitEl.isDisplayed();
        upperLimitEl.sendKeys("999999999");
        return this;

    }

    public CreateComplexSignatoryRulesByMaker clickAddRulesBtn() {
        clickAddRuleBtn.isDisplayed();
        clickAddRuleBtn.click();
        return this;

    }


    public CreateComplexSignatoryRulesByMaker selectSigGroupA() throws InterruptedException {
        clickGroupDropDownEl.isDisplayed();
        clickGroupDropDownEl.click();
        Thread.sleep(2000);
        selectGroupAEl.isDisplayed();
        selectGroupAEl.click();
        fillGroupNumberEl.isDisplayed();
        fillGroupNumberEl.sendKeys("1");
        Thread.sleep(2000);
        return this;

    }
    public CreateComplexSignatoryRulesByMaker clickAddRow() throws InterruptedException {
        clickAddRowEl.isDisplayed();
        clickAddRowEl.click();
        Thread.sleep(2000);
        return this;

    }

    public CreateComplexSignatoryRulesByMaker selectSigGroupB() throws InterruptedException {
        clickGroupDropDownBEl.isDisplayed();
        clickGroupDropDownBEl.click();
        Thread.sleep(2000);
        selectGroupBEl.isDisplayed();
        selectGroupBEl.click();
        Thread.sleep(2000);
        fillGroupNumberBEl.isDisplayed();
        fillGroupNumberBEl.sendKeys("1");
        return this;


    }

    public CreateComplexSignatoryRulesByMaker clickGenerateBtn() {
        clickGenerateBtnEl.isDisplayed();
        clickGenerateBtnEl.click();
        return this;

    }    public CreateComplexSignatoryRulesByMaker clickCreateBtn() throws InterruptedException {
        Thread.sleep(4000);
        clickCreateBtnEl.isDisplayed();
        clickCreateBtnEl.click();
        return this;

    }
}
