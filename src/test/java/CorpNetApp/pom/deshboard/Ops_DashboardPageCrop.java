package CorpNetApp.pom.deshboard;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.operation_Checker_MenuPages.*;
import CorpNetApp.pom.page.operation_Maker_MenuPages.*;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ops_DashboardPageCrop extends BaseTest {
    @FindBy(css = "div li i[class$='mdi mdi-settings']")
    WebElement dashboardSettingE1;
    @FindBy(css = "li ul a[href$='unAuthSelfAccountSummary']")
    WebElement selfAuthorizeAccountEl;
    // Transaction Module
    //Setting Menu elements
    @FindBy(css = "ul li a[href$='/selfAccount/accountSetup']")
    WebElement clickSelfAccSetupEl;
    @FindBy(css = "ul li a[href$='/selfAccount/selfAccountSummary']")
    WebElement clickSelfAccSummaryEl;


    @FindBy(css = "li.nav-menuItem:nth-child(2) > a:nth-child(1) > span")
    WebElement transactionModuleEl;
    @FindBy(css = "li.nav-menuItem:nth-child(2) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1) > span:nth-child(1) > svg")
    WebElement iftMenuEl;
    @FindBy(css = "ul li a[href='/upload/uploadbulkfileBrac']")
    WebElement iftBulkEl;
    //EFT Module
    @FindBy(css = "li.nav-menuItem:nth-child(2) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1) > span:nth-child(1) > svg:nth-child(1)")
    WebElement eftMenuEl;
    @FindBy(css = "ul li ul a[href$='/upload/uploadbulkfileOther']")
    WebElement eftBulkEl;
    //RTGS Module
    @FindBy(css = "li.nav-menuItem:nth-child(2) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1) > span:nth-child(1) > svg:nth-child(1)")
    WebElement rtgsMenuEl;
    @FindBy(css = "ul li ul a[href$='/upload/uploadBulkFileRTGS']")
    WebElement rtgsBulkEl;

    //Company Management Module
    @FindBy(linkText = "Company Management")
    WebElement mouseCompanyManagementEl;
    @FindBy(linkText = "Create Company")
    WebElement addCompanyEl;
    @FindBy(css = "div ul a[href='/company/un-auth-company-list']")
    WebElement unAuthorizeCompanyEl;


    @FindBy(css = "ul li a[href$='/company_account_management']")
    WebElement companyAccountManageEl;

    @FindBy(css = "div ul li a[href='/company/createSignatory']")
    WebElement memberSetupEl;
    //Member Summary Menu

    @FindBy(css = "div ul li a[href='/company/memberSummary']")
    WebElement clickMemberSummaryMenuEl;

    //Complex Signatory Rule Menu
    @FindBy(css = "div ul li a[href='/company/createSignatoryMatrixWithRule']")
    WebElement clickComplexSigRuleMenuEl;

    // Complex Signatory Summary Page

    @FindBy(css = "div ul li a[href='/company/signatoryLimitSummary']")
    WebElement clickTransComplexSigSummaryMenuEl;
    // Receiver Setup
    @FindBy(linkText = "Receiver Management")
    WebElement receiverManagementEl;

    @FindBy(css = "a[href='/receiver/mgmt/uploadCompanyWiseReceiver']")
    WebElement receiverSetupEl;

    @FindBy(css = "a[href='/receiver/mgmt/receiverSummary']")
    WebElement receiverSummaryEl;

    @FindBy(css = "a[href='/receiver/mgmt/receiverDelete']")
    WebElement receiverDeleteEl;

    @FindBy(css = "a[href='/receiver/mgmt/uploadCompanyWiseReceiverLimit']")
    WebElement receiverLimitSetupEl;

    @FindBy(css = "a[href='/receiver/mgmt/receiverLimitSummaryDetails']")
    WebElement receiverLimitSummaryDetailsEl;


    //User Management Module Maker
    @FindBy(linkText = "User Management")
    WebElement mouseUserManagementEl;

    @FindBy(css = "div ul a[href='/account/create_by_admin']")
    WebElement clickCreateUserMenuEl;

    //User Management Module Checker

    @FindBy(css = "div ul a[href='/account/un-authorize-user']")
    WebElement clickUnAuthorizedUserListMenuEl;

    @FindBy(css = "ul li a[href$='role/add']")
    WebElement addUserRole;

    @FindBy(css = "ul li a[href$='role/list']")
    WebElement userRoleList;
    //PayRoll Setting Maker module
    @FindBy(css = "div ul li a[href='/pr-company/createSignatoryMatrix']")
    WebElement clickSimpleSigRuleMenuEl;
    // Payroll Setting Checker Module
    @FindBy(linkText = "Payroll Settings")
    WebElement payrollSettingModuleMouseEl;

    @FindBy(xpath = "//a[@href='/pr-company/memberSummary']")
    WebElement memberSummaryEl;

    //Payroll checker

    @FindBy(css = "div ul li a[href='/pr-company/signatoryLimitSummary']")
    WebElement clickTransSimpleSigAuthMenuEl;

    @FindBy(css = "ul.nav:nth-child(1) > li:nth-child(5) > a:nth-child(1) > p:nth-child(1)")
    WebElement mouseE2;


    @FindBy(css = "li a[href$='user/list']")
    WebElement userListE1;


    @FindBy(css = "div ul li div[class$='bg-inverse-primary text-primary']")
    WebElement userLogoutEl;
    @FindBy(css = "div ul li div[class$='bg-inverse-primary text-primary']")
    WebElement Logout;
    @FindBy(css = "ul>li a[href$='dashboard']")
    WebElement Board;

    @FindBy(css = "div.display-avatar")
    WebElement displayAvatar;


    @FindBy(css = "div table tbody a[href='/account-switch/2494']")
    WebElement clickCompanyEl;

    //Setting Setup
    @FindBy(linkText = "Settings")
    WebElement settingMouseE2;
    @FindBy(css = "div ul li a[href='/company/chargeSetup']")
    WebElement chargeSetupEl;

    @FindBy(css = "div ul li a[href*='/company/searchCharges']")
    WebElement chargeAuthorizeEl;

    @FindBy(css = "div ul li a[href*='/settings/listToken']")
    WebElement chargeTokenListEl;
    //Token charge
    @FindBy(css = "div ul li a[href='/settings/setupToken']")
    WebElement tokenChargeSetupEl;

    @FindBy(css = "div ul li a[href='/company/create-cutt-off']")
    WebElement clickCutOffEl;
    @FindBy(css = "div ul li a[href='/company/un-auth-cutt-off']")
    WebElement clickUnAuthCutOffEl;



    public Ops_DashboardPageCrop() {
        PageFactory.initElements(driver, this);
    }

    public boolean hasLogoutLink() {
        GeneralUtil.waitForDomStable();
        return Logout.isDisplayed();
    }


    public UnAuthSelfAccountSetupByCheckerPage clickAuthorizeSelf() {

        //  new Actions(driver).click(mouseEl).perform();

        dashboardSettingE1.isDisplayed();
        dashboardSettingE1.click();

        selfAuthorizeAccountEl.isDisplayed();
        selfAuthorizeAccountEl.click();

        return new UnAuthSelfAccountSetupByCheckerPage();

    }

    public CompanySelfAccountSetupPage clickSelf() {

        //  new Actions(driver).click(mouseEl).perform();

        dashboardSettingE1.isDisplayed();
        dashboardSettingE1.click();

        clickSelfAccSetupEl.isDisplayed();
        clickSelfAccSetupEl.click();

        return new CompanySelfAccountSetupPage();

    }
    public CompanySelfAccountSetupUpdatePage clickSelfUpdate() {

        //  new Actions(driver).click(mouseEl).perform();

        dashboardSettingE1.isDisplayed();
        dashboardSettingE1.click();

        clickSelfAccSummaryEl.isDisplayed();
        clickSelfAccSummaryEl.click();

        return new CompanySelfAccountSetupUpdatePage();

    }
    public CreateNewCompanyPageByMaker clickAddNewCompany() {
        new Actions(driver)
                .click(mouseCompanyManagementEl).perform();
        addCompanyEl.isDisplayed();
        addCompanyEl.click();

        // addTokenEl.isDisplayed();
        //addTokenEl.click();

        return new CreateNewCompanyPageByMaker();


    }

    public UnauthorizedCompaniesPageByChecker clickUnAuthorizedCompany() {
        new Actions(driver)
                .click(mouseCompanyManagementEl).perform();
        unAuthorizeCompanyEl.isDisplayed();
        unAuthorizeCompanyEl.click();

        // addTokenEl.isDisplayed();
        //addTokenEl.click();

        return new UnauthorizedCompaniesPageByChecker();


    }

    public MemberSummaryPageForApproveByChecker clickMemberSummary() {
        new Actions(driver)
                .click(mouseCompanyManagementEl).perform();
        clickMemberSummaryMenuEl.isDisplayed();
        clickMemberSummaryMenuEl.click();

        // addTokenEl.isDisplayed();
        //addTokenEl.click();

        return new MemberSummaryPageForApproveByChecker();


    }

    public CreateComAccountManaPageByMaker clickCompanyAccountManageMenu() {

        new Actions(driver)
                .click(mouseCompanyManagementEl)
                .perform();
        companyAccountManageEl.isDisplayed();
        companyAccountManageEl.click();

        return new CreateComAccountManaPageByMaker();

    }

    public ApproveComAccountPageByChecker clickCompanyAccountManageMenuForApprove() {

        new Actions(driver)
                .click(mouseCompanyManagementEl)
                .perform();
        companyAccountManageEl.isDisplayed();
        companyAccountManageEl.click();

        return new ApproveComAccountPageByChecker();

    }

    //Transaction Complex Signatory summery menu by Checker
    public TransactionRuleSummaryPageByChecker clickSignatorySummaryMenu() {

        new Actions(driver)
                .click(mouseCompanyManagementEl)
                .perform();
        clickTransComplexSigSummaryMenuEl.isDisplayed();
        clickTransComplexSigSummaryMenuEl.click();

        return new TransactionRuleSummaryPageByChecker();

    }

    public MemberSetupPageByMaker selectMemberSetupMenu() {
        new Actions(driver)
                .click(mouseCompanyManagementEl).perform();

        memberSetupEl.isDisplayed();
        memberSetupEl.click();

        return new MemberSetupPageByMaker();
    }

    //Complex Signatory Rule Page by Maker
    public CreateComplexSignatoryRulesByMaker clickComplexSignatoryRuleMenu() {

        new Actions(driver)
                .click(mouseCompanyManagementEl)
                .perform();
        clickComplexSigRuleMenuEl.isDisplayed();
        clickComplexSigRuleMenuEl.click();

        return new CreateComplexSignatoryRulesByMaker();

    }

    // Receiver Setup

    public ReceiverLimitSetupByComMaker clickReceiverLimitSetup() {

        new Actions(driver).click(mouseCompanyManagementEl).perform();

        receiverManagementEl.isDisplayed();
        receiverManagementEl.click();

        receiverLimitSetupEl.isDisplayed();
        receiverLimitSetupEl.click();


        return new ReceiverLimitSetupByComMaker();

    }

    public ReciverLimitSetupByComChecker clickReceiverLimitSetupSummary() {

        new Actions(driver).click(mouseCompanyManagementEl).perform();

        receiverManagementEl.isDisplayed();
        receiverManagementEl.click();

        receiverLimitSummaryDetailsEl.isDisplayed();
        receiverLimitSummaryDetailsEl.click();

        return new ReciverLimitSetupByComChecker();

    }

    public ReceiverSummaryByComChecker clickReciverSetupSummary() {

        new Actions(driver).click(mouseCompanyManagementEl).perform();

        receiverManagementEl.isDisplayed();
        receiverManagementEl.click();

        receiverSummaryEl.isDisplayed();
        receiverSummaryEl.click();

        return new ReceiverSummaryByComChecker();
    }

    public ReceiverSetupByComMaker clickReciverSetup() {

        new Actions(driver).click(mouseCompanyManagementEl).perform();

        receiverManagementEl.isDisplayed();
        receiverManagementEl.click();

        receiverSetupEl.isDisplayed();
        receiverSetupEl.click();

        return new ReceiverSetupByComMaker();
    }


    //User Management Maker Module

    public CreateUserByMaker clickCreateUserMenu() {

        new Actions(driver)
                .click(mouseUserManagementEl)
                .perform();
        clickCreateUserMenuEl.isDisplayed();
        clickCreateUserMenuEl.click();

        return new CreateUserByMaker();

    }

    //User Management Checker Module

    public ApproveComUnAuthorizeUserPageByChecker clickUnAuthorizedUserList() {

        new Actions(driver)
                .click(mouseUserManagementEl).perform();
        clickUnAuthorizedUserListMenuEl.isDisplayed();
        clickUnAuthorizedUserListMenuEl.click();

        return new ApproveComUnAuthorizeUserPageByChecker();

    }

    //Payroll Setting
    public ApproveMemberSummaryPageForPayroll clickPayrollMemberSummaryMenu() {

        new Actions(driver).click(payrollSettingModuleMouseEl).perform();

        memberSummaryEl.isDisplayed();
        memberSummaryEl.click();

        return new ApproveMemberSummaryPageForPayroll();
    }

    public Create_Simple_SignatoryRulesFor_Payroll SimpleSignatoryRuleMenu() {

        new Actions(driver)
                .click(payrollSettingModuleMouseEl)
                .perform();
        clickSimpleSigRuleMenuEl.isDisplayed();
        clickSimpleSigRuleMenuEl.click();

        return new Create_Simple_SignatoryRulesFor_Payroll();
    }

    public TransactionRuleSummaryPageForPayrollByChecker clickSimpleSignatoryAuthMenu() {

        new Actions(driver)
                .click(payrollSettingModuleMouseEl)
                .perform();
        clickTransSimpleSigAuthMenuEl.isDisplayed();
        clickTransSimpleSigAuthMenuEl.click();

        return new TransactionRuleSummaryPageForPayrollByChecker();
//Setting
    }

    public ChargeSetupPage clickChargeSetupMenu() {

        new Actions(driver)
                .click(settingMouseE2)
                .perform();
        chargeSetupEl.isDisplayed();
        chargeSetupEl.click();

        return new ChargeSetupPage();

    }

    public ChargePageByChecker clickChargeApproveMenu() {
        new Actions(driver)
                .click(settingMouseE2)
                .perform();
        chargeAuthorizeEl.isDisplayed();
        chargeAuthorizeEl.click();

        return new ChargePageByChecker();

    }

    public TokenSetupPageByOpsMaker clickTokenChargeSetupMenu() {

        new Actions(driver)
                .click(settingMouseE2)
                .perform();
        tokenChargeSetupEl.isDisplayed();
        tokenChargeSetupEl.click();

        return new TokenSetupPageByOpsMaker();

    }

    public ListOfTokenPageByCheckerForApprove clickChargeTokenListMenu() {
        new Actions(driver)
                .click(settingMouseE2)
                .perform();
        chargeTokenListEl.isDisplayed();
        chargeTokenListEl.click();

        return new ListOfTokenPageByCheckerForApprove();

    }

    public AddNewCompanyCutoffTimePage clickCutOffEl() {

        new Actions(driver)
                .click(settingMouseE2)
                .perform();
        clickCutOffEl.isDisplayed();
        clickCutOffEl.click();

        return new AddNewCompanyCutoffTimePage();

    }

    public UnAuthorizeCutOffTimeByCheckerPage clickUnAuthCutOffEl() {

        new Actions(driver)
                .click(settingMouseE2)
                .perform();
        clickUnAuthCutOffEl.isDisplayed();
        clickUnAuthCutOffEl.click();

        return new UnAuthorizeCutOffTimeByCheckerPage();

    }
    /*public NewCompanyAddPage clickAddNewCompany() {
        new Actions(driver)
                .click(mouseCompanyManagementEl).perform();
        addCompanyEl.isDisplayed();
        addCompanyEl.click();

        // addTokenEl.isDisplayed();
        //addTokenEl.click();

        return new NewCompanyAddPage();


    }

    public CompanyAccountManagementPage clickCompanyAccountManageMenu() {

        new Actions(driver)
                .click(mouseCompanyManagementEl)
                .perform();

        //mouseCompanyManagementEl.isDisplayed();
        // mouseCompanyManagementEl.click();

        companyAccountManageEl.isDisplayed();
        companyAccountManageEl.click();

        return new CompanyAccountManagementPage();

    }

    public MemberSetupPage selectMemberSetupMenu() {
        new Actions(driver)
                .click(mouseCompanyManagementEl).perform();

        memberSetupEl.isDisplayed();
        memberSetupEl.click();

        return new MemberSetupPage();
    }

    public AddUserRolePage clickAddUserRole() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        new Actions(driver)
                .click(mouseCompanyManagementEl)
                .perform();


        addUserRole.isDisplayed();
        addUserRole.click();

        return new AddUserRolePage();
    }
*/


}

