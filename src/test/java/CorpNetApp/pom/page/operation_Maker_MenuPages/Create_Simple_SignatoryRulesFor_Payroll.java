package CorpNetApp.pom.page.operation_Maker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static CorpNetApp.pom.base.BaseTest.driver;

public class Create_Simple_SignatoryRulesFor_Payroll extends BaseTest {

    @FindBy(id = "selectCompanyId")
    WebElement selectCompanyEl;

    @FindBy(css = "input[name='maxNoSignatory']")
    WebElement signatoryNumberEl;

    @FindBy(css = "select[name='paymentMedia']")
    WebElement paymentMediaEl;

    @FindBy(css = "input[name='lowerLimit']")
    WebElement lowerLimitEl;

    @FindBy(css = "input[name='upperLimit']")
    WebElement upperLimitEl;

    @FindBy(css = "select[name='selection1']")
    WebElement transactionRuleEl;

    @FindBy(css = "#firstGroupNo")
    WebElement groupNumberEl;

    @FindBy(css = "button[name='submit']")
    WebElement createButtonEl;

    public Create_Simple_SignatoryRulesFor_Payroll() {
        PageFactory.initElements(driver, this);
    }

    public Create_Simple_SignatoryRulesFor_Payroll selectCompany() {

        selectCompanyEl.isDisplayed();
        new Select(selectCompanyEl).selectByVisibleText(getCompanyName());
        return this;

    }

    public Create_Simple_SignatoryRulesFor_Payroll signatoryNumber() {

        signatoryNumberEl.isDisplayed();
        signatoryNumberEl.sendKeys("1");
        return this;

    }

    public Create_Simple_SignatoryRulesFor_Payroll paymentMedia() {

        paymentMediaEl.isDisplayed();
        new Select(paymentMediaEl).selectByValue("1");
        return this;
    }

    public Create_Simple_SignatoryRulesFor_Payroll lowerlimit() {

        lowerLimitEl.isDisplayed();
        lowerLimitEl.sendKeys("1");
        return this;

    }

    public Create_Simple_SignatoryRulesFor_Payroll upperlimit() {

        upperLimitEl.isDisplayed();
        upperLimitEl.sendKeys("90000000");
        return this;

    }

    public Create_Simple_SignatoryRulesFor_Payroll transactionRule() {

        transactionRuleEl.isDisplayed();
        new Select(transactionRuleEl).selectByValue("A");
        return this;
    }

    public Create_Simple_SignatoryRulesFor_Payroll transactionNumber() {

        groupNumberEl.isDisplayed();
        groupNumberEl.sendKeys("1");
        return this;

    }

    public Create_Simple_SignatoryRulesFor_Payroll createButton() {

        createButtonEl.isDisplayed();
        createButtonEl.click();
        return this;

    }

}
