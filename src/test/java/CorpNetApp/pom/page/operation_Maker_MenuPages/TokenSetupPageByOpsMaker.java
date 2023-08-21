package CorpNetApp.pom.page.operation_Maker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.antlr.v4.runtime.tree.Tree;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TokenSetupPageByOpsMaker extends BaseTest {

    @FindBy(id="company")
    WebElement selectCompanyEl;
    @FindBy(name = "tokenCode")
    WebElement fillTokenCodeEl;
    @FindBy(id="memberId")
    WebElement selectMemberIdEl;
    @FindBy(name = "amount")
    WebElement fillChAmountEl;
    @FindBy(id="companyAccountId")
    WebElement selectComAccEl;

    @FindBy(name = "vatAmount")
    WebElement fillVatAmtEl;
    @FindBy(css = "div.col-lg-12 button.btn-primary")
    WebElement clickCreateBtnEl;


    public TokenSetupPageByOpsMaker(){
        PageFactory.initElements(driver,this);
    }

    public TokenSetupPageByOpsMaker selectCompany(){
        selectCompanyEl.isDisplayed();
        //new Select(selectCompanyEl).selectByValue(getSelectCompanyValue());
        new Select(selectCompanyEl).selectByVisibleText(getCompanyName());
        return this;
    }
    public TokenSetupPageByOpsMaker selectMemberId(int index){
        selectMemberIdEl.isDisplayed();
        new Select(selectMemberIdEl).selectByIndex(index);
        return this;
    } public TokenSetupPageByOpsMaker selectComAcc(){
        selectComAccEl.isDisplayed();
        new Select(selectComAccEl).selectByValue("1501101613623002");
        return this;
    }

    public TokenSetupPageByOpsMaker fillAllData() throws InterruptedException {
        fillTokenCodeEl.isDisplayed();
        fillTokenCodeEl.sendKeys("98098766");
        fillChAmountEl.isDisplayed();
        fillChAmountEl.sendKeys("350");
        fillVatAmtEl.isDisplayed();
        fillVatAmtEl.sendKeys("52");
        Thread.sleep(5000);
        return this;
    }  public TokenSetupPageByOpsMaker clickCreateBtn() throws InterruptedException {
        clickCreateBtnEl.isDisplayed();
        clickCreateBtnEl.click();
        Thread.sleep(1000);
        return this;
    }


}
