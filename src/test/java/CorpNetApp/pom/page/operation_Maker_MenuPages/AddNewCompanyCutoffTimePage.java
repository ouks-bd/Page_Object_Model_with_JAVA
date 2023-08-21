package CorpNetApp.pom.page.operation_Maker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import cucumber.api.java.en_lol.WEN;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewCompanyCutoffTimePage extends BaseTest {
    @FindBy(name = "companyId")
    WebElement selectComIdEl;
    @FindBy(name = "paymentMediaId")
    WebElement selectPayMediaIdEl;
    @FindBy(id = "startHour")
    WebElement selectStHourEl;
    @FindBy(id = "endHour")
    WebElement selectEndHourEl;
    @FindBy(id = "endMin")
    WebElement selectEndMinEl;

    @FindBy(name = "submit")
    WebElement clickSubBtnEl;

    public AddNewCompanyCutoffTimePage() {
        PageFactory.initElements(driver, this);
    }

    public AddNewCompanyCutoffTimePage selectCom() {

        selectComIdEl.isDisplayed();
        new Select(selectComIdEl).selectByVisibleText(getCompanyName());
        selectPayMediaIdEl.isDisplayed();
        new Select(selectPayMediaIdEl).selectByVisibleText(getPaymentTypeTest());
        selectStHourEl.isDisplayed();
        new Select(selectStHourEl).selectByValue("10");
        selectEndHourEl.isDisplayed();
        new Select(selectEndHourEl).selectByValue("23");
        selectEndMinEl.isDisplayed();
        new Select(selectEndMinEl).selectByValue("45");
        return this;
    }
    public AddNewCompanyCutoffTimePage clickSubBt(){
        clickSubBtnEl.isDisplayed();
        clickSubBtnEl.click();
        return this;
    }

}
