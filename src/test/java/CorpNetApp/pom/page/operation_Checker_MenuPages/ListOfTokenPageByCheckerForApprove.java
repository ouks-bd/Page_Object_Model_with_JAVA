package CorpNetApp.pom.page.operation_Checker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.WatchEvent;

public class ListOfTokenPageByCheckerForApprove extends BaseTest {
    @FindBy(id = "company")
    WebElement selectComEl;
    @FindBy(css = "div td a[href*='/settings/details/']")
    WebElement clickDetailBtnEl;
    @FindBy(id = "submitButton")
    WebElement clickSubBtnEl;

   public ListOfTokenPageByCheckerForApprove(){
       PageFactory.initElements(driver,this);
   }
   public ListOfTokenPageByCheckerForApprove selectCom(){

       selectComEl.isDisplayed();
       new Select(selectComEl).selectByVisibleText(getCompanyName());
       return this;
   }
   public ListOfTokenPageByCheckerForApprove clickDetailsBtn(){

       clickDetailBtnEl.isDisplayed();
       clickDetailBtnEl.click();
       return this;
   }
   public ListOfTokenPageByCheckerForApprove clickSubBtn(){

       clickSubBtnEl.isDisplayed();
       clickSubBtnEl.click();
       return this;
   }


}
