package CorpNetApp.pom.page.operation_Checker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UnAuthSelfAccountSetupByCheckerPage extends BaseTest {

    @FindBy(id = "selectCompanyId")
    WebElement selectCompanyEl;
    @FindBy(css = "select.custom-select")
    WebElement selectPageNo;
    @FindBy(css = "div label input.form-control-sm")
    WebElement searchUnAuthorizedEl;

    @FindBy(id = "globalAlertOk")
    WebElement clickOkBtnEl;


    @FindBy(css = "div td a[href*='/selfAccount/details']")
    WebElement clickSelfAccountDetailsEl1;

    @FindBy(css = "div td a[href$='details/22']")
    WebElement clickSelfAccountDetailsEl16;
    @FindBy(css = "div td a[href$='details/220']")
    WebElement clickSelfAccountDetailsEl2;
    @FindBy(css = "div td a[href$='details/219']")
    WebElement clickSelfAccountDetailsEl3;
    @FindBy(css = "div td a[href$='details/218']")
    WebElement clickSelfAccountDetailsEl4;
    @FindBy(css = "div td a[href$='details/217']")
    WebElement clickSelfAccountDetailsEl5;
    @FindBy(css = "div td a[href$='details/216']")
    WebElement clickSelfAccountDetailsEl6;


    @FindBy(css = "div td a[href$='details/215']")
    WebElement clickSelfAccountDetailsEl7;
    @FindBy(css = "div td a[href$='details/214']")
    WebElement clickSelfAccountDetailsEl8;
    @FindBy(css = "div td a[href$='details/213']")
    WebElement clickSelfAccountDetailsEl9;
    @FindBy(css = "div td a[href$='details/212']")
    WebElement clickSelfAccountDetailsEl10;
    @FindBy(css = "div td a[href$='details/211']")
    WebElement clickSelfAccountDetailsEl11;
    @FindBy(css = "div td a[href$='details/210']")
    WebElement clickSelfAccountDetailsEl12;


    @FindBy(css = "div td a[href$='details/209']")
    WebElement clickSelfAccountDetailsEl13;

    @FindBy(css = "div td a[href$='details/207']")
    WebElement clickSelfAccountDetailsEl14;

    @FindBy(css = "div td a[href$='details/208']")
    WebElement clickSelfAccountDetailsEl15;

    @FindBy(css = "div td a[href$='details/206']")
    WebElement clickSelfAccountDetailsEl17;

    @FindBy(css = "div td a[href$='details/208']")
    WebElement clickSelfAccountDetailsEl18;

    @FindBy(css = "div button[type='submit']")
    WebElement clickAuthorizeButtonEl;

    public UnAuthSelfAccountSetupByCheckerPage() {
        PageFactory.initElements(driver, this);
    }


    public UnAuthSelfAccountSetupByCheckerPage selectCompany() throws InterruptedException {
        //   new Select(selectCompanyEl).selectByIndex(index);

        selectCompanyEl.isDisplayed();
        new Select(selectCompanyEl).selectByVisibleText(getCompanyName());
        Thread.sleep(2000);
        searchUnAuthorizedEl.isDisplayed();
        searchUnAuthorizedEl.sendKeys("UnAuthorized");

        // driver.findElements(By.cssSelector("form table tr td >select option")).get(index).click();
        //driver.findElement(By.cssSelector("body")).click();
        return this;

    }

    public UnAuthSelfAccountSetupByCheckerPage selectPageNo(int index1) {
        new Select(selectPageNo).selectByIndex(index1);
        return this;

    }

    public UnAuthSelfAccountSetupByCheckerPage clickSelfAccountDetails1() {
        clickSelfAccountDetailsEl1.isDisplayed();
        clickSelfAccountDetailsEl1.click();
        return this;
    }

    public UnAuthSelfAccountSetupByCheckerPage clickAuthorizeButton() throws InterruptedException {
        clickAuthorizeButtonEl.isDisplayed();
        clickAuthorizeButtonEl.click();
        Thread.sleep(1000);
        clickOkBtnEl.isDisplayed();
        clickOkBtnEl.click();
        Thread.sleep(1000);
        return this;
    }



        /*

    }
    public UnAuthSelfAccountSetupByCheckerPage clickSelfAccountDetails2() {
        clickSelfAccountDetailsEl2.isDisplayed();
        clickSelfAccountDetailsEl12.click();
        return this;

    }
    public UnAuthSelfAccountSetupByCheckerPage clickSelfAccountDetails3() {
        clickSelfAccountDetailsEl3.isDisplayed();
        clickSelfAccountDetailsEl3.click();
        return this;

    }
    public UnAuthSelfAccountSetupByCheckerPage clickSelfAccountDetails4() {
        clickSelfAccountDetailsEl4.isDisplayed();
        clickSelfAccountDetailsEl4.click();
        return this;

    } public UnAuthSelfAccountSetupByCheckerPage clickSelfAccountDetails5() {
        clickSelfAccountDetailsEl5.isDisplayed();
        clickSelfAccountDetailsEl5.click();
        return this;

    }
    public UnAuthSelfAccountSetupByCheckerPage clickSelfAccountDetails6() {
        clickSelfAccountDetailsEl6.isDisplayed();
        clickSelfAccountDetailsEl6.click();
        return this;

    }
    public UnAuthSelfAccountSetupByCheckerPage clickSelfAccountDetails7() {
        clickSelfAccountDetailsEl7.isDisplayed();
        clickSelfAccountDetailsEl7.click();
        return this;

    }
    public UnAuthSelfAccountSetupByCheckerPage clickSelfAccountDetails8() {
        clickSelfAccountDetailsEl8.isDisplayed();
        clickSelfAccountDetailsEl8.click();
        return this;

    } public UnAuthSelfAccountSetupByCheckerPage clickSelfAccountDetails9() {
        clickSelfAccountDetailsEl9.isDisplayed();
        clickSelfAccountDetailsEl9.click();
        return this;

    } public UnAuthSelfAccountSetupByCheckerPage clickSelfAccountDetails10() {
        clickSelfAccountDetailsEl10.isDisplayed();
        clickSelfAccountDetailsEl10.click();
        return this;

    } public UnAuthSelfAccountSetupByCheckerPage clickSelfAccountDetails11() {
        clickSelfAccountDetailsEl11.isDisplayed();
        clickSelfAccountDetailsEl11.click();
        return this;

    } public UnAuthSelfAccountSetupByCheckerPage clickSelfAccountDetails12() {
        clickSelfAccountDetailsEl12.isDisplayed();
        clickSelfAccountDetailsEl12.click();
        return this;


    }

    public UnAuthSelfAccountSetupByCheckerPage clickSelfAccountDetails13() {
        clickSelfAccountDetailsEl13.isDisplayed();
        clickSelfAccountDetailsEl13.click();
        return this;


    }
    public UnAuthSelfAccountSetupByCheckerPage clickSelfAccountDetails14() {
        clickSelfAccountDetailsEl14.isDisplayed();
        clickSelfAccountDetailsEl14.click();
        return this;


    }
    public UnAuthSelfAccountSetupByCheckerPage clickSelfAccountDetails15() {
        clickSelfAccountDetailsEl15.isDisplayed();
        clickSelfAccountDetailsEl15.click();
        return this;


    }
    public UnAuthSelfAccountSetupByCheckerPage clickSelfAccountDetails16() {
        clickSelfAccountDetailsEl16.isDisplayed();
        clickSelfAccountDetailsEl16.click();
        return this;


    }*/
}