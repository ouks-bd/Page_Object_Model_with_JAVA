package CorpNetApp.pom.base;

import CorpNetApp.pom.util.GeneralUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {
    public static WebDriver driver;
    private Properties properties;

    public BaseTest() {
        try {
            properties = new Properties();
            String filePath = System.getProperty("user.dir")
                    + "\\src\\test\\java\\CorpNetApp\\pom\\config\\config.properties";


            FileInputStream inputStream = new FileInputStream(filePath);
            properties.load(inputStream);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void initialization() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        // System.setProperty("webdriver.gecko.driver", "\\src\\test\\jafva\\CorpNetApp\\pom\\testData\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe");
        //    System.setProperty("webdriver.gecko.driver",
        //  "D:\\Automation\\git\\CORPnet\\src\\test\\java\\CorpNetApp\\pom\\testData\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe");
        //WebDriver driver = new ChromeDriver();
//       /*  WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();

        driver.get(properties.getProperty("baseUrl"));
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(GeneralUtil.IMPLICIT_WAIT));


    }

    public void ScrollToElementAndClick(WebElement webElement) {
        webElement.isDisplayed();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", webElement);
        GeneralUtil.waitForDomStable();
        webElement.click();
    }

    public String LimitPath() {
        return properties.getProperty("TCSAPath");

    }

    public String getUsername() {
        return properties.getProperty("CheckerUsername");

    }

    public String getMakerUser() {
        return properties.getProperty("MakerUser");
    }

    public String getPassword() {
        return properties.getProperty("password");

    }

    public String getMakerPass() {
        return properties.getProperty("MakerPass");
    }

    public String getCompanyMakerUser() {
        return properties.getProperty("companyMakerUser");
    }

    public String getTranMakerUser() {
        return properties.getProperty("TranMakerUser");
    }

    public String getTranMCUser() {
        return properties.getProperty("TranMCUser");
    }

    public String getTranCompCheckerUser() {
        return properties.getProperty("TranChkUser");
    }

    public String getTranCompApproveUser() {
        return properties.getProperty("CompAppUser");
    }

    public String getTranMakerPass() {
        return properties.getProperty("TranMakerPass");
    }

    public String getSpTranMakerPass() {
        return properties.getProperty("SpMakerUser");
    }

    public String getMakerPayrollUser() {
        return properties.getProperty("MakerPayrollUser");
    }

    public String getCheckerPayrollUser () {
        return properties.getProperty("CheckerPayrollUser");
    }

    public String getApprovePayrollUser() {
        return properties.getProperty("ComAppPayrollUser");
    }

    public String getPayrollPassword() {
        return properties.getProperty("PayrollPassword");
    }

    public String getSpTranMakerUser() {
        return properties.getProperty("SpAuthMakerUser");
    }

    public String getSpAuthCheckerUser() {
        return properties.getProperty("SpAuthCheckerUser");
    }

    public String getSpAuthApproveUser() {
        return properties.getProperty("SpAuthSingApproveUser");
    }


    //member Setup
    public String getMemberName() {
        return properties.getProperty("MemberName");
    }

    public String getMemberNameB() {
        return properties.getProperty("MemberNameB");
    }

    //Company Data Setup
    public String getCompanyName() {
        return properties.getProperty("CompanyName");
    }

    public String getSelectCompany() {
        return properties.getProperty("SelectCompany");
    }


    public String getSelectCompanyText() {
        return properties.getProperty("SelectCompanyText");
    }

    public String getPaymentTypeTest() {
        return properties.getProperty("PaymentTypeTest");
    }


    public String getSelectCompanyValue() {
        return properties.getProperty("SelectCompanyValue");
    }

    public String getComEmail() {
        return properties.getProperty("email");
    }

    public String getCIF() {
        return properties.getProperty("CIF");
    }

    public String companySearch() {
        return properties.getProperty("VA TEST AUTO");

    }

    //TCSA
    public String getTCSAFileUpload() {
        return properties.getProperty("TCSAPath");
    }

    public String getTCSALimitFileUpload() {
        return properties.getProperty("TCSALimitPath");
    }

    public String getComMCUser() {
        return properties.getProperty("CompanyTranMCUserName");
    }

    public String getComApproveUser() {
        return properties.getProperty("CompanyTranApproveUserName");

    }

    public String getIFTSingleBulk() {
        return properties.getProperty("IFTSingleBulk");
    }

    public String getIFTMultipleBulk() {
        return properties.getProperty("IFTMultipleBulk");
    }

    public String getEFTSingleBulk() {
        return properties.getProperty("EFTSingleBulk");
    }

    public String getEFTMultipleBulk() {
        return properties.getProperty("EFTMultipleBulk");
    }

    public String getRTGSBulk() {
        return properties.getProperty("RTGSBulk");
    }

    public String getDDWonBulk() {
        return properties.getProperty("DDWonBulk");
    }

    public String getDDOthersBulk() {
        return properties.getProperty("DDOthersBulk");
    }

    public String getPayrollBulk() {
        return properties.getProperty("PayrollBulk");
    }

    public String getSPWonBulk() {
        return properties.getProperty("SPWonBulk");

    }

    public String getSPOthersBulk() {
        return properties.getProperty("SPOthersBulk");

    }

    public String getPOBulk() {
        return properties.getProperty("POBulk");

    }

    public String getUploadCustomDutyBulk() {
        return properties.getProperty("uploadCustomDutyBulk");

    }

    public String getselfAccntSetUp() {
        return properties.getProperty("selfAccntSetUp");

    }

    public String gettrxTracker() {
        return properties.getProperty("trxTracker");

    }

    public String getBeneficiaryPayrollNickName() {
        return properties.getProperty("BeneficiaryPayrollNickName");
    }

    public String getBeneficiaryPayroll_Acc() {
        return properties.getProperty("BeneficiaryPayroll_Acc");
    }

    public String test() {
        return null;
    }

}
