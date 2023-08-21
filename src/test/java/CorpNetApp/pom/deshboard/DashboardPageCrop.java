package CorpNetApp.pom.deshboard;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.Reports.payrollReportPage.PayrollDownloadPaymentSlip;
import CorpNetApp.pom.page.Reports.payrollReportPage.PendingTransactionList;
import CorpNetApp.pom.page.Reports.payrollReportPage.TransactionReport;
import CorpNetApp.pom.page.Reports.transectionReportPage.DownLoadPaymentSlip;
import CorpNetApp.pom.page.Reports.transectionReportPage.FileSummaryReportBy;
import CorpNetApp.pom.page.Reports.transectionReportPage.PaymentReportPage;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.Company_Beneficiary_Management.Add_Beneficiary_Page;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Approver_MenuPages.*;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Checker_MenuPages.*;
import CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages.*;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPageCrop extends BaseTest {
    @FindBy(css = "div li i[class$='mdi mdi-settings']")
    WebElement dashboardSettingE1;
    @FindBy(css = "li ul a[href$='unAuthSelfAccountSummary']")
    WebElement selfAuthorizeAccountEl;
    // Transaction Module
    @FindBy(linkText = "Transaction")
    WebElement transactionModuleEl;

    //IFT Transaction
    @FindBy(css = "a[href='/upload/single_transaction']")
    WebElement iftSingleMenuEl;

    @FindBy(linkText = "IFT")
    WebElement iftMenuEl;
    @FindBy(css = "ul li a[href='/upload/uploadbulkfileBrac']")
    WebElement iftBulkEl;

    @FindBy(css = "ul li a[href='/upload/single_transaction']")
    WebElement iftSingleEl;

    @FindBy(css = "div ul li a[href$='controller/company-checker']")
    WebElement iftCheckerQueueEl;

    @FindBy(css = "div ul li a[href$='dashboard-controller/company-approver']")
    WebElement iftApproveQueueEl;


    //EFT Module
    @FindBy(linkText = "EFT")
    WebElement eftMenuEl;

    @FindBy(css = "a[href='/upload/single_transaction_eft']")
    WebElement eftSingleMenuEl;
    @FindBy(css = "ul li ul a[href$='/upload/uploadbulkfileOther']")
    WebElement eftBulkEl;


    //RTGS Module
    @FindBy(linkText = "RTGS")
    WebElement rtgsMenuEl;
    @FindBy(css = "ul li ul a[href$='/upload/uploadBulkFileRTGS']")
    WebElement rtgsBulkEl;

    @FindBy(css = "a[href='/upload/single_transaction_rtgs']")
    WebElement rtgsSingleEl;

    // Payroll Module

    @FindBy(linkText = "Payroll")
    WebElement PayrollMenuEl;
    @FindBy(css = "ul li ul a[href$='/pr-upload/single_transaction']")
    WebElement payrollSingleMenuEl;

    @FindBy(css = "a[href='/pr-upload/uploadbulkfileBrac']")
    WebElement payrollBulkMenuEl;

    @FindBy(linkText = "Payroll Add Beneficiary")
    WebElement payrollAddBeneficiaryEl;
    @FindBy(linkText = "Add Beneficiary")
    WebElement BBAddBeneficiaryEl;
    @FindBy(linkText = "Add Other Beneficiary")
    WebElement OthersAddBeneficiaryEl;

    //Special Auth


    @FindBy(linkText = "Own Account Transfer")
    WebElement clickOwnAcTrnMenu;

    @FindBy(css = "ul li a[href$='/universalTrxUpload/universalUpload']")
    WebElement clickUsBulkMenu;

    @FindBy(css = "ul li a[href$='/universalTrxUpload/universalOtherUpload']")
    WebElement clickUsThirdBulkMenu;

    @FindBy(linkText = "Third Party Transfer")
    WebElement clickThirdAcTrnMenu;

    //Pay Order Config
    @FindBy(linkText = "Pay Order")
    WebElement clickPOTrnMenu;

    @FindBy(css = "ul li a[href$='/po/single']")
    WebElement clickPOSingleMenu;

    @FindBy(css = "ul li a[href$='/po/bulk/upload']")
    WebElement clickPOBulkMenu;
    //Direct Debit Config

    @FindBy(linkText = "Direct Debit")
    WebElement clickDDTrnMenu;

    @FindBy(css = "ul li a[href$='/direct-debit/other/upload-initiate']")
    WebElement clickDDThirdBulkMenu;

    @FindBy(css = "ul li a[href$='/direct-debit/own/upload-initiate']")
    WebElement clickDDOWNBulkMenu;

    @FindBy(css = "ul li a[href$='/direct-debit/own/upload-initiate']")
    WebElement clickDDOwnBulkMenu;


    // Bill Payment Menu

    @FindBy(xpath = "//a[normalize-space()='Bill Payment']")
    WebElement transactionBillPaymentEl;
    // Custom Duty Menu
    @FindBy(linkText = "CUSTOMS DUTY")
    WebElement customDutyEl;

    @FindBy(css = "a[href*='/bill/payment//CUSTOMSDUTY']")
    WebElement customDutySingleEl;

    @FindBy(css = "a[href*='/bill/payment//BULKCUSTOMSDUTY']")
    WebElement getCustomDutyBulkEl;
    @FindBy(css = "a[href='/dashboard-controller/company-checker']")
    WebElement checkerPageEl;

    @FindBy(linkText = "Bill Payment")
    WebElement transectionBillPaymentEl;

    @FindBy(css = "a[href='/bill/payment/ /DPDC/3']")
    WebElement selectDpdcEl;
    @FindBy(css = "a[href='/tax/payment/vat']")
    WebElement vatPaymentEL;


    @FindBy(css = "ul li a[href$='/company_account_management']")
    WebElement companyAccountManageEl;

    @FindBy(css = "div ul li a[href='/company/createSignatory']")
    WebElement memberSetupEl;
    @FindBy(css = "ul li a[href$='role/add']")
    WebElement addUserRole;

    @FindBy(css = "ul li a[href$='role/list']")
    WebElement userRoleList;


    @FindBy(css = "ul.nav:nth-child(1) > li:nth-child(5) > a:nth-child(1) > p:nth-child(1)")
    WebElement mouseE2;
    @FindBy(css = "li a[href$='user/add']")
    WebElement addNewUser;

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

    //Report

    @FindBy(linkText = "Reports")
    WebElement reportsEl;

    @FindBy(linkText = "Payroll Reports")
    WebElement payrollReportsEl;
    @FindBy(xpath = "//a[@href='/pr-transaction/transaction-report']")
    WebElement transactionReportEl;
    @FindBy(xpath = "//a[@href='/pr-transaction/approvedSummary']")
    WebElement payrollPaymentSlipEl;

    @FindBy(xpath = "//a[@href='/pr-transaction/transummary']")
    WebElement pendingTransactionListEl;


    //Legacy
    @FindBy(linkText = "Transaction Reports")
    WebElement transactionReportsEl;

    @FindBy(css = "a[href='/transaction/transaction-report']")
    WebElement transactionPaymentReportEl;

    @FindBy(css = "a[href='/transaction/uploadedFileSummary']")
    WebElement fileSummaryReportClickEl;

    @FindBy(css = "a[href='/transaction/approvedSummary']")
    WebElement paymentSlipEl;

    @FindBy(linkText = "Beneficiary Management")
    WebElement BeneficiaryModuleEl;

    public DashboardPageCrop() {
        PageFactory.initElements(driver, this);
    }

    public boolean hasLogoutLink() {
        GeneralUtil.waitForDomStable();
        return Logout.isDisplayed();
    }

    public SingleIFTTransactionPageByComMaker clickSingleIFT() {

        new Actions(driver).click(transactionModuleEl).perform();

        iftMenuEl.isDisplayed();
        iftMenuEl.click();

        iftSingleMenuEl.isDisplayed();
        iftSingleMenuEl.click();

        return new SingleIFTTransactionPageByComMaker();
    }

    public IFT1ToManyBulkTransactionPageByComMaker ClickBulkIFT() {

        //  new Actions(driver).click(mouseEl).perform();
        //clickCompanyEl.isDisplayed();
        // clickCompanyEl.click();

        new Actions(driver).click(transactionModuleEl).perform();
        //  transactionModuleEl.isDisplayed();
        //transactionModuleEl.click();

        iftMenuEl.isDisplayed();
        iftMenuEl.click();

        iftBulkEl.isDisplayed();
        iftBulkEl.click();

        return new IFT1ToManyBulkTransactionPageByComMaker();
    }

    public IFT1ToManyBulkTransactionPageByComMaker ClickSingleIFT() {

        //  new Actions(driver).click(mouseEl).perform();
        // clickCompanyEl.isDisplayed();
        //clickCompanyEl.click();
        transactionModuleEl.isDisplayed();
        transactionModuleEl.click();

        iftMenuEl.isDisplayed();
        iftMenuEl.click();

        iftSingleEl.isDisplayed();
        iftSingleEl.click();

        return new IFT1ToManyBulkTransactionPageByComMaker();
    }

    public IFT_TransactionPageByComChecker clickIFTCheckerQueue() {

        new Actions(driver).click(transactionModuleEl).perform();
        iftCheckerQueueEl.isDisplayed();
        iftCheckerQueueEl.click();
        return new IFT_TransactionPageByComChecker();
    }

    public IFT_Single_TransactionPageByComChecker clickIFT_Single_CheckerQueue() throws InterruptedException {

        new Actions(driver).click(transactionModuleEl).perform();
        iftCheckerQueueEl.isDisplayed();
        iftCheckerQueueEl.click();
        Thread.sleep(3000);
        return new IFT_Single_TransactionPageByComChecker();
    }


    public IFT_TransactionPageByComApprove clickIFTApproveQueue() {

        //   clickCompanyEl.isDisplayed();
        // clickCompanyEl.click();
        return new IFT_TransactionPageByComApprove();
    }

    public IFT__Single_TransactionPageByComApprove clickSingleIFTApproveQueue() throws InterruptedException {
        Thread.sleep(3000);
        // clickCompanyEl.isDisplayed();
        //  clickCompanyEl.click();
        // Thread.sleep(5000);
        return new IFT__Single_TransactionPageByComApprove();
    }

    //Starting EFT

    public SingleEFT_TransactionPageByComMaker clickSingleEFT() {

        new Actions(driver).click(transactionModuleEl).perform();

        eftMenuEl.isDisplayed();
        eftMenuEl.click();

        eftSingleMenuEl.isDisplayed();
        eftSingleMenuEl.click();

        return new SingleEFT_TransactionPageByComMaker();
    }

    public EFT_Single_TransactionPageByComChecker clickEFT_Single_CheckerQueue() {

        new Actions(driver).click(transactionModuleEl).perform();
        iftCheckerQueueEl.isDisplayed();
        iftCheckerQueueEl.click();
        return new EFT_Single_TransactionPageByComChecker();
    }

    public EFT__Single_TransactionPageByComApprove clickSingleEFTApproveQueue() {

        // clickCompanyEl.isDisplayed();
        //  clickCompanyEl.click();
        return new EFT__Single_TransactionPageByComApprove();
    }

    public EFT_BulkTransactionPageByComMaker clickBulkOneToManyEFT() {

        new Actions(driver).click(transactionModuleEl).perform();
        eftMenuEl.isDisplayed();
        eftMenuEl.click();

        eftBulkEl.isDisplayed();
        eftBulkEl.click();
        return new EFT_BulkTransactionPageByComMaker();
    }

    public EFT_TransactionPageByComChecker clickEFT_One_Many_CheckerQueue() {
        new Actions(driver).click(transactionModuleEl).perform();
        iftCheckerQueueEl.isDisplayed();
        iftCheckerQueueEl.click();
        return new EFT_TransactionPageByComChecker();
    }

    public EFT_TransactionPageByComApprove clickEFTBulkApproveQueue() throws InterruptedException {

        // clickCompanyEl.isDisplayed();
        //  clickCompanyEl.click();
        return new EFT_TransactionPageByComApprove();
    }

    //RTGS Transaction

    public RTGS_BulkTransactionPageByComMaker ClickBulkRTGS() {

        //  new Actions(driver).click(mouseEl).perform();

        new Actions(driver).click(transactionModuleEl).perform();
        rtgsMenuEl.isDisplayed();
        rtgsMenuEl.click();

        rtgsBulkEl.isDisplayed();
        rtgsBulkEl.click();

        return new RTGS_BulkTransactionPageByComMaker();
    }

    public RTGS_BulkTransactionPageByComChecker click_RTGS_CheckerQueue() {
        new Actions(driver).click(transactionModuleEl).perform();
        iftCheckerQueueEl.isDisplayed();
        iftCheckerQueueEl.click();
        return new RTGS_BulkTransactionPageByComChecker();
    }

    public RTGS_BulkTransactionPageByComApprover clickRTGSBulkApproveQueue() {

        // clickCompanyEl.isDisplayed();
        // clickCompanyEl.click();
        return new RTGS_BulkTransactionPageByComApprover();
    }

    public RTGSSingleTransactionPageByComMaker ClickSingleRTGS() {

        //  new Actions(driver).click(mouseEl).perform();

        new Actions(driver).click(transactionModuleEl).perform();
        rtgsMenuEl.isDisplayed();
        rtgsMenuEl.click();
        rtgsSingleEl.isDisplayed();
        rtgsSingleEl.click();


        return new RTGSSingleTransactionPageByComMaker();
    }

    //Payroll Setup
    public Single_Payroll_TransactionPageByComMaker ClickSinglePayroll() {

        //  new Actions(driver).click(mouseEl).perform();

        new Actions(driver).click(transactionModuleEl).perform();
        PayrollMenuEl.isDisplayed();
        PayrollMenuEl.click();
        payrollSingleMenuEl.isDisplayed();
        payrollSingleMenuEl.click();


        return new Single_Payroll_TransactionPageByComMaker();

    }

    public BulkPayrollTransactionPageByComMaker clickBulkPayroll() {

        //  new Actions(driver).click(mouseEl).perform();

        new Actions(driver).click(transactionModuleEl).perform();
        PayrollMenuEl.isDisplayed();
        PayrollMenuEl.click();
        payrollBulkMenuEl.isDisplayed();
        payrollBulkMenuEl.click();


        return new BulkPayrollTransactionPageByComMaker();

    }

    public Payroll_TransactionPageByComChecker ClickVerifyPayroll() {

        //  new Actions(driver).click(mouseEl).perform();

        new Actions(driver).click(transactionModuleEl).perform();
        iftCheckerQueueEl.isDisplayed();
        iftCheckerQueueEl.click();

        return new Payroll_TransactionPageByComChecker();

    }

    public Payroll_Single_TransactionPageByComApprove clickPayrollBulkApproveQueue() throws InterruptedException {

        // clickCompanyEl.isDisplayed();
        //  clickCompanyEl.click();
        Thread.sleep(5000);
        return new Payroll_Single_TransactionPageByComApprove();
    }

    //Special Auth Setup
    public Own_AccountTransferPageByComMaker clickOwnBulkTransfer() {

        new Actions(driver).click(transactionModuleEl).perform();
        clickOwnAcTrnMenu.isDisplayed();
        clickOwnAcTrnMenu.click();
        clickUsBulkMenu.isDisplayed();
        clickUsBulkMenu.click();


        return new Own_AccountTransferPageByComMaker();

    }

    public special_Third_AccountTransferPageByComMaker clickThirdBulkTransfer() {

        new Actions(driver).click(transactionModuleEl).perform();
        clickThirdAcTrnMenu.isDisplayed();
        clickThirdAcTrnMenu.click();
        clickUsThirdBulkMenu.isDisplayed();
        clickUsThirdBulkMenu.click();


        return new special_Third_AccountTransferPageByComMaker();

    }

    public SpAuth_TransactionPageByComChecker click_SpAuth_CheckerQueue() {
        new Actions(driver).click(transactionModuleEl).perform();
        iftCheckerQueueEl.isDisplayed();
        iftCheckerQueueEl.click();
        return new SpAuth_TransactionPageByComChecker();
    }

    public Special__Auth_TransactionPageByComApprove clickSpAuthBulkApproveQueue() {

        // clickCompanyEl.isDisplayed();
        // clickCompanyEl.click();
        return new Special__Auth_TransactionPageByComApprove();
    }

    //Pay Order Setup
    public PO_Issuance_SinglePageByComMaker clickPOSingleMenu() {

        new Actions(driver).click(transactionModuleEl).perform();
        clickPOTrnMenu.isDisplayed();
        clickPOTrnMenu.click();
        clickPOSingleMenu.isDisplayed();
        clickPOSingleMenu.click();
        return new PO_Issuance_SinglePageByComMaker();

    }

    public BulkPayOrderTransactionPageByComMaker clickPOBulkMenu() {

        new Actions(driver).click(transactionModuleEl).perform();
        clickPOTrnMenu.isDisplayed();
        clickPOTrnMenu.click();
        clickPOBulkMenu.isDisplayed();
        clickPOBulkMenu.click();
        return new BulkPayOrderTransactionPageByComMaker();

    }

    public PO_Issuance_CheckerPage clickPOCheckerQueue() {
        new Actions(driver).click(transactionModuleEl).perform();
        iftCheckerQueueEl.isDisplayed();
        iftCheckerQueueEl.click();
        return new PO_Issuance_CheckerPage();
    }

    public PO_TransactionPageByComApprove clickPOSingleApproveQueue() throws InterruptedException {

        // clickCompanyEl.isDisplayed();
        //  clickCompanyEl.click();
        Thread.sleep(5000);
        return new PO_TransactionPageByComApprove();
    }

    // Direct Debit Setup

    public DD_Transaction_Page_ByComMaker clickDDThirdPartyTransfer() {

        new Actions(driver).click(transactionModuleEl).perform();
        clickDDTrnMenu.isDisplayed();
        clickDDTrnMenu.click();
        clickDDThirdBulkMenu.isDisplayed();
        clickDDThirdBulkMenu.click();
        return new DD_Transaction_Page_ByComMaker();

    }

    public DD_Transaction_Page_ByComMaker clickDDOwnTransfer() {

        new Actions(driver).click(transactionModuleEl).perform();
        clickDDTrnMenu.isDisplayed();
        clickDDTrnMenu.click();
        clickDDOwnBulkMenu.isDisplayed();
        clickDDOwnBulkMenu.click();
        return new DD_Transaction_Page_ByComMaker();

    }

    public DD_TransactionPageByComChecker click_DD_CheckerQueue() {
        new Actions(driver).click(transactionModuleEl).perform();
        iftCheckerQueueEl.isDisplayed();
        iftCheckerQueueEl.click();
        return new DD_TransactionPageByComChecker();
    }

    public DD_TransactionPageByComApprove clickDDBulkApproveQueue() {

        // clickCompanyEl.isDisplayed();
        // clickCompanyEl.click();
        return new DD_TransactionPageByComApprove();
    }

    // Custom Duty Single Payment Maker
    public CustomDutySinglePaymentPageByComMaker clickCustomDutySingle() {

        new Actions(driver).click(transactionModuleEl).perform();

        transectionBillPaymentEl.isDisplayed();
        transectionBillPaymentEl.click();

        customDutyEl.isDisplayed();
        customDutyEl.click();

        customDutySingleEl.isDisplayed();
        customDutySingleEl.click();


        return new CustomDutySinglePaymentPageByComMaker();
    }

    public CustomDutyBulkPaymentPageByComMaker clickCustomDutyBulk() {

        new Actions(driver).click(transactionModuleEl).perform();

        transectionBillPaymentEl.isDisplayed();
        transectionBillPaymentEl.click();

        customDutyEl.isDisplayed();
        customDutyEl.click();

        getCustomDutyBulkEl.isDisplayed();
        getCustomDutyBulkEl.click();


        return new CustomDutyBulkPaymentPageByComMaker();
    }

    // DPDC Bill
    public DPDCBillPaymentPageByComApprover clickDpdcpproveQueue() throws InterruptedException {

        new Actions(driver).click(transactionModuleEl).perform();

        iftApproveQueueEl.isDisplayed();
        iftApproveQueueEl.click();
        Thread.sleep(5000);
        return new DPDCBillPaymentPageByComApprover();
    }

    public DPDC_PaymentCheckPageByComChecker clickBillPaymentChecker() throws InterruptedException {

        new Actions(driver).click(transactionModuleEl).perform();
        checkerPageEl.isDisplayed();
        checkerPageEl.click();

        Thread.sleep(5000);

        return new DPDC_PaymentCheckPageByComChecker();
    }

    public DPDCBillPaymentPageByComMaker clickBillPaymentDPDC() {

        new Actions(driver).click(transactionModuleEl).perform();


        transectionBillPaymentEl.isDisplayed();
        transectionBillPaymentEl.click();

        selectDpdcEl.isDisplayed();
        selectDpdcEl.click();


        return new DPDCBillPaymentPageByComMaker();
    }

    public VATBillPaymentPageByCom clickOnVat() {

        new Actions(driver).click(transactionModuleEl).perform();
        transectionBillPaymentEl.isDisplayed();
        transectionBillPaymentEl.click();

        vatPaymentEL.isDisplayed();
        vatPaymentEL.click();

        return new VATBillPaymentPageByCom();
    }

    //Report Setup
    public TransactionReport clickTransactionReport() {
        new Actions(driver).click(reportsEl).perform();

        payrollReportsEl.isDisplayed();
        payrollReportsEl.click();
        transactionReportEl.isDisplayed();
        transactionReportEl.click();

        return new TransactionReport();
    }

    public PendingTransactionList clickPendingTransactionList() {
        new Actions(driver).click(reportsEl).perform();
        payrollReportsEl.isDisplayed();
        payrollReportsEl.click();
        pendingTransactionListEl.isDisplayed();
        pendingTransactionListEl.click();
        return new PendingTransactionList();
    }

    public PayrollDownloadPaymentSlip clickPayrollDownloadSlip() {

        new Actions(driver).click(reportsEl).perform();

        payrollReportsEl.isDisplayed();
        payrollReportsEl.click();

        payrollPaymentSlipEl.isDisplayed();
        payrollPaymentSlipEl.click();


        return new PayrollDownloadPaymentSlip();
    }


    public PaymentReportPage clickPaymentReportPage() {

        new Actions(driver).click(reportsEl).perform();

        transactionReportsEl.isDisplayed();
        transactionReportsEl.click();

        transactionPaymentReportEl.isDisplayed();
        transactionPaymentReportEl.click();

        return new PaymentReportPage();
    }

    public FileSummaryReportBy clickFileSummaryReport() {

        new Actions(driver).click(reportsEl).perform();

        transactionReportsEl.isDisplayed();
        transactionReportsEl.click();

        fileSummaryReportClickEl.isDisplayed();
        fileSummaryReportClickEl.click();

        return new FileSummaryReportBy();
    }


    public DownLoadPaymentSlip clickPaymentSlip() {

        new Actions(driver).click(reportsEl).perform();
        transactionReportsEl.isDisplayed();
        transactionReportsEl.click();

        paymentSlipEl.isDisplayed();
        paymentSlipEl.click();

        return new DownLoadPaymentSlip();
    }

    public Add_Beneficiary_Page clickPayrollBeneficiaryMenu() {

        new Actions(driver).click(BeneficiaryModuleEl).perform();
        payrollAddBeneficiaryEl.isDisplayed();
        payrollAddBeneficiaryEl.click();
        return new Add_Beneficiary_Page();
    }

    public Add_Beneficiary_Page clickBRACBankBeneficiaryMenu() {

        new Actions(driver).click(BeneficiaryModuleEl).perform();
        BBAddBeneficiaryEl.isDisplayed();
        BBAddBeneficiaryEl.click();
        return new Add_Beneficiary_Page();
    }

    public Add_Beneficiary_Page clickOthersBeneficiaryMenu() {

        new Actions(driver).click(BeneficiaryModuleEl).perform();
        OthersAddBeneficiaryEl.isDisplayed();
        OthersAddBeneficiaryEl.click();
        return new Add_Beneficiary_Page();
    }


}


