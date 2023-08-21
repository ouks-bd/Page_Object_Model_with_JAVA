package CorpNetApp.pom.page.operation_Checker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReciverLimitSetupByComChecker extends BaseTest {

    @FindBy(css = "input[type='search']")
    WebElement searchButtonEl;

    @FindBy (css = "a[class='btn btn-primary']")
    WebElement detailsButttonEl;

    @FindBy(css = ".btn.btn-success")
    WebElement approveButtonEl;

    public ReciverLimitSetupByComChecker() {
        PageFactory.initElements(driver, this);
    }


    public ReciverLimitSetupByComChecker searchButton(String reciverlimitSetupReferenceNumber) throws InterruptedException {


        searchButtonEl.isDisplayed();
        System.out.println("Batch Approved Successfully! :- " + reciverlimitSetupReferenceNumber);
        searchButtonEl.sendKeys(reciverlimitSetupReferenceNumber);


        Thread.sleep(20000);


        return this;
    }

    public ReciverLimitSetupByComChecker detailsButton(){

        detailsButttonEl.isDisplayed();
        detailsButttonEl.click();

        return this;
    }
    public ReciverLimitSetupByComChecker approveButton(){

        approveButtonEl.isDisplayed();
        approveButtonEl.click();

        return this;
    }
}
