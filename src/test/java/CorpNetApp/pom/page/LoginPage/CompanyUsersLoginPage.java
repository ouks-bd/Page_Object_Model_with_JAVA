package CorpNetApp.pom.page.LoginPage;

import CorpNetApp.pom.deshboard.DashboardPageCrop;
import CorpNetApp.pom.deshboard.Ops_DashboardPageCrop;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static CorpNetApp.pom.base.BaseTest.driver;

public class CompanyUsersLoginPage {


    @FindBy(id = "user2")
    WebElement usernameE1;

    // @FindBy(css = "div input[placeholder='Password']")
    @FindBy(id = "pass2")

    WebElement passwordE1;

    @FindBy(css = "div.w-full:nth-child(3)")
    WebElement loginButton;

    public CompanyUsersLoginPage() {
        PageFactory.initElements(driver, this);
    }

    public DashboardPageCrop CompMakerLogin(String MakerUser, String MakerPass) {
        usernameE1.isDisplayed();
        usernameE1.clear();
        usernameE1.sendKeys(MakerUser);

        passwordE1.clear();
        passwordE1.sendKeys(MakerPass);

        GeneralUtil.waitForDomStable();

        loginButton.isDisplayed();
        loginButton.click();
        GeneralUtil.waitForDomStable();
        return new DashboardPageCrop();
    }

    public DashboardPageCrop CompMCUserLogin(String MakerUser, String MakerPass) {
        usernameE1.isDisplayed();
        usernameE1.clear();
        usernameE1.sendKeys(MakerUser);

        passwordE1.clear();
        passwordE1.sendKeys(MakerPass);

        GeneralUtil.waitForDomStable();

        loginButton.isDisplayed();
        loginButton.click();
        GeneralUtil.waitForDomStable();
        return new DashboardPageCrop();
    }    public DashboardPageCrop CompSpMakerCUserLogin(String MakerUser, String MakerPass) {
        usernameE1.isDisplayed();
        usernameE1.clear();
        usernameE1.sendKeys(MakerUser);

        passwordE1.clear();
        passwordE1.sendKeys(MakerPass);

        GeneralUtil.waitForDomStable();

        loginButton.isDisplayed();
        loginButton.click();
        GeneralUtil.waitForDomStable();
        return new DashboardPageCrop();
    }

    public DashboardPageCrop CompApproveUserLogin(String MakerUser, String MakerPass) {
        usernameE1.isDisplayed();
        usernameE1.clear();
        usernameE1.sendKeys(MakerUser);

        passwordE1.clear();
        passwordE1.sendKeys(MakerPass);

        GeneralUtil.waitForDomStable();

        loginButton.isDisplayed();
        loginButton.click();
        GeneralUtil.waitForDomStable();
        return new DashboardPageCrop();
    }  public Ops_DashboardPageCrop ComSpAuthLogin(String MakerUser, String MakerPass) {
        usernameE1.isDisplayed();
        usernameE1.clear();
        usernameE1.sendKeys(MakerUser);

        passwordE1.clear();
        passwordE1.sendKeys(MakerPass);

        GeneralUtil.waitForDomStable();

        loginButton.isDisplayed();
        loginButton.click();
        GeneralUtil.waitForDomStable();
        return new Ops_DashboardPageCrop();
    }


}
