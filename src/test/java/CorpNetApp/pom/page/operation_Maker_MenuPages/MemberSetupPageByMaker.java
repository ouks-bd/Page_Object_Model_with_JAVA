package CorpNetApp.pom.page.operation_Maker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;


public class MemberSetupPageByMaker extends BaseTest {

    @FindBy(css = "div button[class$='btn dropdown-toggle btn-light bs-placeholder']")
    WebElement SelectComEl;

    @FindBy(css = "input.form-control:nth-child(1)")
    WebElement SearchCompanyEl;
    @FindBy(css = "div#bs-select-1 ul> li a span.text")
    WebElement clickCompanyEl;
    //@FindBy(css = "dropdown-menu show")
    // WebElement SearchCompanyEl;

    @FindBy(id = "division")
    WebElement fillDivisionEl;

    @FindBy(id = "memberId")
    WebElement memberIdEl;
    @FindBy(css = "div#bs-select-1 ul> li a span.text")
    WebElement companyEl;

    @FindBy(css = "div tr td select[name='groups']")
    WebElement groupEl;

    @FindBy(id = "address")
    WebElement addressEl;


    @FindBy(id = "email")
    WebElement emailEl;
    @FindBy(id = "memberName")
    WebElement nameEl;
    @FindBy(id = "contactNo")
    WebElement contactEl;
    @FindBy(id = "designation")
    WebElement designationEl;
    @FindBy(id = "contactNo")
    WebElement fillContactEl;
    @FindBy(css = "div input[value='3']")
    WebElement clickRadioBtn;
    @FindBy(css = "div button.btn-primary.btn-primary[type='submit']")
    WebElement clickSubmitBtn;
    @FindBy(css = "div td select[name='groups']")
    WebElement clickGroup;

    @FindBy(css = "div td select option[value='B']")
    WebElement selectGroup;
    @FindBy(css = "div td select option[value='A']")
    WebElement selectGroupAEl;


    public MemberSetupPageByMaker() {
        PageFactory.initElements(driver, this);
    }

    public MemberSetupPageByMaker selectCompany() {
        SelectComEl.isDisplayed();
        SelectComEl.click();
        return this;
    }

    public MemberSetupPageByMaker searchCompany() throws InterruptedException {
        companyEl.isDisplayed();
        SearchCompanyEl.isDisplayed();
        // SearchCompanyEl.click();
        SearchCompanyEl.sendKeys(getCompanyName());
        SearchCompanyEl.click();
        Thread.sleep(1000);
        clickCompanyEl.isDisplayed();
        // new Select(clickCompanyEl).selectByVisibleText(getCompanyName());
        clickCompanyEl.click();
        //driver.findElements(By.cssSelector("div#bs-select-1 ul> li a span.text")).get(index).click();
        driver.findElement(By.cssSelector("body")).click();
        //  new Select(SearchCompanyEl).selectByIndex(index);
        // SearchCompanyEl.isDisplayed();
        // SearchCompanyEl.clear();
        // SearchCompanyEl.sendKeys(company);
        // SearchCompanyEl.click();

        return this;
    }


    public MemberSetupPageByMaker FillComDivision(String division) {
        fillDivisionEl.isDisplayed();
        fillDivisionEl.clear();
        fillDivisionEl.sendKeys(division);
        return this;
    }

    public MemberSetupPageByMaker selectMemberGroupB() throws InterruptedException {
        //  clickGroup.click();
        //Thread.sleep(3000);
        selectGroup.isDisplayed();
        selectGroup.click();
        return this;
    }

    public MemberSetupPageByMaker selectMemberGroupA() throws InterruptedException {
        //  clickGroup.click();
        //Thread.sleep(3000);
        selectGroupAEl.isDisplayed();
        selectGroupAEl.click();
        return this;
    }

    public MemberSetupPageByMaker fillMemberID() {
        Random random = new Random();
        int randomMemberID = random.nextInt(789678);
        memberIdEl.isDisplayed();
        memberIdEl.clear();
        memberIdEl.sendKeys(String.valueOf(randomMemberID));
        return this;
    }

    public MemberSetupPageByMaker fillAddress(String address) {
        addressEl.isDisplayed();
        addressEl.clear();
        addressEl.sendKeys(address);
        return this;
    }

    public MemberSetupPageByMaker fillEmail() {
        emailEl.isDisplayed();
        emailEl.clear();
        emailEl.sendKeys(getComEmail());
        return this;
    }

    public MemberSetupPageByMaker fillMemberName(String memberName) throws InterruptedException {
        nameEl.isDisplayed();
        nameEl.clear();
        Thread.sleep(5000);
        nameEl.sendKeys(memberName);
        return this;
    }

    public MemberSetupPageByMaker fillDesignation(String designation) {
        designationEl.isDisplayed();
        designationEl.clear();
        designationEl.sendKeys(designation);
        return this;
    }

    public MemberSetupPageByMaker fillMob(String mob) {
        fillContactEl.isDisplayed();
        fillContactEl.sendKeys(mob);
        return this;
    }

    public MemberSetupPageByMaker clickMemberSetupPurpose() throws InterruptedException {
        Thread.sleep(5000);
        clickRadioBtn.isDisplayed();
        clickRadioBtn.click();
        return this;
    }

    public MemberSetupPageByMaker clickCreateBtn() {
        clickSubmitBtn.isDisplayed();
        clickSubmitBtn.click();
        return this;
    }
}
