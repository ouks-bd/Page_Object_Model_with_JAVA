package CorpNetApp.pom.page.LoginPage;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.deshboard.DashboardPageCrop;
import CorpNetApp.pom.deshboard.Ops_DashboardPageCrop;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OPS_UsersLoginPage extends BaseTest {

    @FindBy(css = "div input[name$='j_username2']")


    WebElement usernameE1;

    @FindBy(css = "div input[placeholder='Password']")
    WebElement passwordE1;

    @FindBy(css = "div.w-full:nth-child(3)")
    WebElement loginButton;

    @FindBy(css = "div table tbody a[href='/account-switch/2494']")
    WebElement clickCompanyEl;

    public OPS_UsersLoginPage() {
        PageFactory.initElements(driver, this);
    }

    public Ops_DashboardPageCrop loginCorp(String username, String password) {
        usernameE1.isDisplayed();
        usernameE1.clear();
        usernameE1.sendKeys(username);

        passwordE1.clear();
        passwordE1.sendKeys(password);

        GeneralUtil.waitForDomStable();

        loginButton.isDisplayed();
        loginButton.click();
        GeneralUtil.waitForDomStable();
        return new Ops_DashboardPageCrop();
    }

    public DashboardPageCrop companyMakerLogin(String comMakerUser, String password) {
        usernameE1.isDisplayed();
        usernameE1.clear();
        usernameE1.sendKeys(comMakerUser);

        passwordE1.clear();
        passwordE1.sendKeys(password);

        GeneralUtil.waitForDomStable();

        loginButton.isDisplayed();
        loginButton.click();

        clickCompanyEl.isDisplayed();
        clickCompanyEl.click();
        GeneralUtil.waitForDomStable();
        return new DashboardPageCrop();


    }
}


