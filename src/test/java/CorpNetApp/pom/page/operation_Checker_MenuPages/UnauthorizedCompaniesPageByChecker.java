package CorpNetApp.pom.page.operation_Checker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnauthorizedCompaniesPageByChecker extends BaseTest {

    @FindBy(css="div label input.form-control-sm")
    WebElement searchComEl;
    @FindBy(css="div tr td a[class ='btn btn-success']")
    WebElement clickComDetailsEl;
   @FindBy(id="submitButton")
    WebElement clickSubmitEl;



    public UnauthorizedCompaniesPageByChecker(){

        PageFactory.initElements(driver,this);
    }

    public UnauthorizedCompaniesPageByChecker searchCompany(String Company) {
        searchComEl.isDisplayed();
        searchComEl.sendKeys(Company);
        return this;

    }  public UnauthorizedCompaniesPageByChecker clickDetailsBtn( ) {
        clickComDetailsEl.isDisplayed();
        clickComDetailsEl.click();
        return this;


    }  public UnauthorizedCompaniesPageByChecker clickSubBtn( ) {
        clickSubmitEl.isDisplayed();
        clickSubmitEl.click();
        return this;

    }
}
