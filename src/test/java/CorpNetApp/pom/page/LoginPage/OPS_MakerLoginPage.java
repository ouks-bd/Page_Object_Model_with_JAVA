package CorpNetApp.pom.page.LoginPage;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.deshboard.Ops_DashboardPageCrop;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OPS_MakerLoginPage extends BaseTest {

   // @FindBy(css = "div input[name$='j_username']")

    @FindBy(id = "user2")
    WebElement usernameE1;

   // @FindBy(css = "div input[placeholder='Password']")
    @FindBy(id = "pass2")

    WebElement passwordE1;

    @FindBy(css = "div.w-full:nth-child(3)")
    WebElement loginButton;

    public OPS_MakerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    public Ops_DashboardPageCrop MakerLoginCorp(String MakerUser, String MakerPass) {
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

