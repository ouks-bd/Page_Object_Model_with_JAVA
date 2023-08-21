package CorpNetApp.pom.page.operation_Maker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CompanySelfAccountSetupPage extends BaseTest {

public String SelfAccSetupFileUpload;
    @FindBy(id = "companyName")
    WebElement selectComEl;
    @FindBy(css = "input#file")
    WebElement browseEl;

    @FindBy(css = "div label input[value='4']")
    WebElement selectModuleRadioEl;
    @FindBy(id = "uploadBtn")
    WebElement clickUploadEl;

    public CompanySelfAccountSetupPage() {
        PageFactory.initElements(driver, this);
    }

    public CompanySelfAccountSetupPage selectComp(){
        selectComEl.isDisplayed();
        new Select(selectComEl).selectByVisibleText(getCompanyName());


        return this;

    }public CompanySelfAccountSetupPage uploadFile(){
        SelfAccSetupFileUpload=System.getProperty("user.dir")+getselfAccntSetUp();
        browseEl.isDisplayed();
        browseEl.sendKeys(SelfAccSetupFileUpload);
        return this;

    }public CompanySelfAccountSetupPage clickModuleRadio(){
        selectModuleRadioEl.isDisplayed();
        selectModuleRadioEl.click();
        return this;

    }public CompanySelfAccountSetupPage clickUploadBtn(){
        clickUploadEl.isDisplayed();
        clickUploadEl.click();
        return this;

    }
}
