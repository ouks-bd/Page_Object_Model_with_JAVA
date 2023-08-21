package CorpNetApp.pom.page.operation_Maker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static CorpNetApp.pom.base.BaseTest.driver;

public class ChargeSetupPage extends BaseTest {

    @FindBy(name = "companyId")
    WebElement selectCompany;

    @FindBy(id = "paymentTypeId")
    WebElement paymentTypeEl;

    @FindBy(css = "#amountPerTransaction")
    WebElement amountPerTransactionEl;

    @FindBy(css = "#vatPercentage")
    WebElement vatPercentageEl;

    @FindBy(css = "button[type='submit']")
    WebElement createButtonEl;

    public ChargeSetupPage() {
        PageFactory.initElements(driver, this);
    }

    public ChargeSetupPage selectCompany() {

        selectCompany.isDisplayed();
        new Select(selectCompany).selectByVisibleText(getCompanyName());
        return this;

    }

    public ChargeSetupPage paymentMethod() {

        paymentTypeEl.isDisplayed();
        new Select(paymentTypeEl).selectByVisibleText(getPaymentTypeTest());
        return this;

    }

    public ChargeSetupPage fillAmount() {

        amountPerTransactionEl.isDisplayed();
        amountPerTransactionEl.sendKeys("100");
        return this;

    }

    public ChargeSetupPage vatAmount() {

        vatPercentageEl.isDisplayed();
        vatPercentageEl.sendKeys("15");
        return this;

    }

    public ChargeSetupPage createButton() {

        createButtonEl.isDisplayed();
        createButtonEl.click();
        return this;

    }

}
