package CorpNetApp.pom.page.operation_Maker_MenuPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static CorpNetApp.pom.base.BaseTest.driver;

public class CompanyGLAccountSetupPage {

    @FindBy(name = "companyId")
    WebElement selectCompany;

    @FindBy(id = "paymentType")
    WebElement paymentTypeEl;

    @FindBy(css = "#amountPerTransaction")
    WebElement amountPerTransactionEl;

    @FindBy(css = "#vatPercentage")
    WebElement vatPercentageEl;

    @FindBy(css = "button[type='submit']")
    WebElement createButtonEl;

    public CompanyGLAccountSetupPage() {
        PageFactory.initElements(driver, this);
    }

    public CompanyGLAccountSetupPage selectCompany() {

        selectCompany.isDisplayed();
        new Select(selectCompany).selectByValue("3013");
        return this;

    }

    public CompanyGLAccountSetupPage paymentMethod() {

        paymentTypeEl.isDisplayed();
        new Select(paymentTypeEl).selectByValue("1");
        return this;

    }

    public CompanyGLAccountSetupPage fillAmount() {

        amountPerTransactionEl.isDisplayed();
        amountPerTransactionEl.sendKeys("100");
        return this;

    }

    public CompanyGLAccountSetupPage vatAmount() {

        vatPercentageEl.isDisplayed();
        vatPercentageEl.sendKeys("15");
        return this;

    }

    public CompanyGLAccountSetupPage createButton() {

        createButtonEl.isDisplayed();
        createButtonEl.click();
        return this;

    }

}
