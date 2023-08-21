package CorpNetApp.pom.test.testOperation.TestCases_SelfAccountSetUp;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.page.LoginPage.CompanyUsersLoginPage;
import CorpNetApp.pom.page.operation_Checker_MenuPages.UnAuthSelfAccountSetupByCheckerPage;
import CorpNetApp.pom.util.GeneralUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_Company_ApproveSelfAccountWithValidData extends BaseTest {
    UnAuthSelfAccountSetupByCheckerPage unAuthSelfAccountSetupByCheckerPage;

    public TC_Company_ApproveSelfAccountWithValidData() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        unAuthSelfAccountSetupByCheckerPage = new CompanyUsersLoginPage().ComSpAuthLogin(getUsername(), getMakerPass()).clickAuthorizeSelf();
    }


    @Test(priority = 0)
    public void AuthUnAuthSelfUser1() throws InterruptedException {
        unAuthSelfAccountSetupByCheckerPage = unAuthSelfAccountSetupByCheckerPage
                .selectCompany()
                .clickSelfAccountDetails1()
                .clickAuthorizeButton();
        Thread.sleep(1000);
    }

    @Test(priority = 1)
    public void AuthUnAuthSelfUser2() throws InterruptedException {
        unAuthSelfAccountSetupByCheckerPage = unAuthSelfAccountSetupByCheckerPage
                .selectCompany()
                .clickSelfAccountDetails1()
                .clickAuthorizeButton();
        Thread.sleep(1000);
    }

    @Test(priority = 2)
    public void AuthUnAuthSelfUser3() throws InterruptedException {
        unAuthSelfAccountSetupByCheckerPage = unAuthSelfAccountSetupByCheckerPage
                .selectCompany()
                .clickSelfAccountDetails1()
                .clickAuthorizeButton();
        Thread.sleep(1000);
    }

    @Test(priority = 3)
    public void AuthUnAuthSelfUser4() throws InterruptedException {
        unAuthSelfAccountSetupByCheckerPage = unAuthSelfAccountSetupByCheckerPage
                .selectCompany()
                .clickSelfAccountDetails1()
                .clickAuthorizeButton();
        Thread.sleep(1000);
    }

    @Test(priority = 4)
    public void AuthUnAuthSelfUser5() throws InterruptedException {
        unAuthSelfAccountSetupByCheckerPage = unAuthSelfAccountSetupByCheckerPage
                .selectCompany()
                .clickSelfAccountDetails1()
                .clickAuthorizeButton();
        Thread.sleep(1000);
    }

    @Test(priority = 5)
    public void AuthUnAuthSelfUser6() throws InterruptedException {
        unAuthSelfAccountSetupByCheckerPage = unAuthSelfAccountSetupByCheckerPage
                .selectCompany()
                .clickSelfAccountDetails1()
                .clickAuthorizeButton();
        Thread.sleep(1000);
    }

    @Test(priority = 6)
    public void AuthUnAuthSelfUser7() throws InterruptedException {
        unAuthSelfAccountSetupByCheckerPage = unAuthSelfAccountSetupByCheckerPage
                .selectCompany()
                .clickSelfAccountDetails1()
                .clickAuthorizeButton();
        Thread.sleep(1000);
        ;
    }

    @Test(priority = 7)
    public void AuthUnAuthSelfUser8() throws InterruptedException {
        unAuthSelfAccountSetupByCheckerPage = unAuthSelfAccountSetupByCheckerPage
                .selectCompany()
                .clickSelfAccountDetails1()
                .clickAuthorizeButton();
        Thread.sleep(1000);
    }

    @Test(priority = 8)
    public void AuthUnAuthSelfUser9() throws InterruptedException {
        unAuthSelfAccountSetupByCheckerPage = unAuthSelfAccountSetupByCheckerPage
                .selectCompany()
                .clickSelfAccountDetails1()
                .clickAuthorizeButton();
        Thread.sleep(1000);
    }

    @Test(priority = 9)
    public void AuthUnAuthSelfUser10() throws InterruptedException {
        unAuthSelfAccountSetupByCheckerPage = unAuthSelfAccountSetupByCheckerPage
                .selectCompany()
                .clickSelfAccountDetails1()
                .clickAuthorizeButton();
        Thread.sleep(1000);
    }

    @Test(priority = 10)
    public void AuthUnAuthSelfUser11() throws InterruptedException {
        unAuthSelfAccountSetupByCheckerPage = unAuthSelfAccountSetupByCheckerPage
                .selectCompany()
                .clickSelfAccountDetails1()
                .clickAuthorizeButton();
        Thread.sleep(1000);
    }

    @Test(priority = 11)
    public void AuthUnAuthSelfUser12() throws InterruptedException {
        unAuthSelfAccountSetupByCheckerPage = unAuthSelfAccountSetupByCheckerPage
                .selectCompany()
                .clickSelfAccountDetails1()
                .clickAuthorizeButton();
        Thread.sleep(1000);

    }

    @Test(priority = 12)
    public void AuthUnAuthSelfUser13() throws InterruptedException {
        unAuthSelfAccountSetupByCheckerPage = unAuthSelfAccountSetupByCheckerPage
                .selectCompany()
                .clickSelfAccountDetails1()
                .clickAuthorizeButton();
        Thread.sleep(1000);

    }

    @Test(priority = 13)
    public void AuthUnAuthSelfUser14() throws InterruptedException {
        unAuthSelfAccountSetupByCheckerPage = unAuthSelfAccountSetupByCheckerPage
                .selectCompany()
                .clickSelfAccountDetails1()
                .clickAuthorizeButton();
        Thread.sleep(1000);

    }

    @Test(priority = 14)
    public void AuthUnAuthSelfUser15() throws InterruptedException {
        unAuthSelfAccountSetupByCheckerPage = unAuthSelfAccountSetupByCheckerPage
                .selectCompany()
                .clickSelfAccountDetails1()
                .clickAuthorizeButton();
        Thread.sleep(1000);


        //Thread.sleep(5000);

    }

    @Test(priority = 15)
    public void AuthUnAuthSelfUser16() throws InterruptedException {
        unAuthSelfAccountSetupByCheckerPage = unAuthSelfAccountSetupByCheckerPage
                .selectCompany()
                .clickSelfAccountDetails1()
                .clickAuthorizeButton();
        Thread.sleep(1000);
    }


    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }

}
