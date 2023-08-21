package CorpNetApp.pom.page.operation_Maker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CompanySelfAccountSetupUpdatePage extends BaseTest {

    public static String Message;
    public static  String actualMsg;
    public static String expectMsg="Test Case Failed:Invalid password";
    @FindBy(css = "input.form-control-sm")
    WebElement searchComEl;
    @FindBy(css = "div button[type='submit']")
    WebElement clickUpdateBtn;
    @FindBy(css = "div tbody a[href*='/selfAccount/edit']")
    WebElement clickEditEl;

    @FindBy(id = "selfAccountName")
    WebElement clearSelfNameEl;
    @FindBy(id = "globalAlertBody")
    WebElement getSuccessMsgEl;

    public CompanySelfAccountSetupUpdatePage() {
        PageFactory.initElements(driver, this);
    }

    public CompanySelfAccountSetupUpdatePage searchComp() throws InterruptedException {
        searchComEl.isDisplayed();
        searchComEl.sendKeys(getCompanyName());
        //Thread.sleep(10000);
        // new Select(searchComEl).selectByVisibleText(getCompanyName());

        return this;

    }

    public CompanySelfAccountSetupUpdatePage clickEditBtn() {
        clickEditEl.isDisplayed();
        clickEditEl.click();
        return this;

    }

    public CompanySelfAccountSetupUpdatePage clearSelfName() {
        clearSelfNameEl.isDisplayed();
        clearSelfNameEl.clear();
        return this;

    }

    public CompanySelfAccountSetupUpdatePage clickUpdateBtn() {
        clickUpdateBtn.isDisplayed();
        clickUpdateBtn.click();
        return this;

    }

    public boolean hasWelcome() {
        CompanySelfAccountSetupUpdatePage.Message = getSuccessMsgEl.getText();
        System.out.println("test:" + Message);
        return getSuccessMsgEl.getText().trim().contains("updated successfully!");


    }

    public CompanySelfAccountSetupUpdatePage getSuccessMsg() {
        String expMsg="Test Case Failed:Invalid password";
        getSuccessMsgEl.isDisplayed();
        actualMsg=getSuccessMsgEl.getText();
        String ActualMsg=getSuccessMsgEl.getText();
        String ExpectMsg=expMsg;

        return this;

    }
}
