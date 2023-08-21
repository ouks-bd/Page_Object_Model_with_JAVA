package CorpNetApp.pom.page.operation_Checker_MenuPages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static CorpNetApp.pom.base.BaseTest.driver;

public class ReceiverSummaryByComChecker {

    @FindBy(css = "input[type='search']")
    WebElement searchButtonEl;

    @FindBy (css = "a[class='btn btn-primary']")
    WebElement detailsButttonEl;

    @FindBy(css = ".btn.btn-success")
    WebElement approveButtonEl;

    public ReceiverSummaryByComChecker() {
        PageFactory.initElements(driver, this);
    }


    public ReceiverSummaryByComChecker searchButton(String receiverLimitSetupReferenceNumber) throws InterruptedException {


        searchButtonEl.isDisplayed();
        System.out.println("Batch Approved Successfully! :- " + receiverLimitSetupReferenceNumber);
        searchButtonEl.sendKeys(receiverLimitSetupReferenceNumber);


        Thread.sleep(20000);


        return this;
    }

    public ReceiverSummaryByComChecker detailsButton(){

        detailsButttonEl.isDisplayed();
        detailsButttonEl.click();

        return this;
    }
    public ReceiverSummaryByComChecker approveButton(){

        approveButtonEl.isDisplayed();
        approveButtonEl.click();

        return this;
    }
}
