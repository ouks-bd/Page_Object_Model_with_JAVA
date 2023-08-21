package CorpNetApp.pom.page.operation_Checker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnAuthorizeCutOffTimeByCheckerPage extends BaseTest {

    @FindBy(css = "div td a[href*='/company/cutoff-details']")
    WebElement clickDetailsBtnEl;
    @FindBy(css = "div input.form-control-sm")
    WebElement searchUnAuthorizeEl;
    @FindBy(css = "div div p button.btn-primary[type='submit']")
    WebElement clickSubBtnEl;


    public UnAuthorizeCutOffTimeByCheckerPage(){
        PageFactory.initElements(driver,this);
    }

    public UnAuthorizeCutOffTimeByCheckerPage searchUnAuth(){
        searchUnAuthorizeEl.isDisplayed();
        searchUnAuthorizeEl.sendKeys(getCompanyName());
        return this;
    }
    public UnAuthorizeCutOffTimeByCheckerPage clickBtn() throws InterruptedException {
        clickDetailsBtnEl.isDisplayed();
        clickDetailsBtnEl.click();
        Thread.sleep(3000);
        clickSubBtnEl.isDisplayed();
        clickSubBtnEl.click();
        return this;
    }
}
