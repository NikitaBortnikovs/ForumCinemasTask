package lv.qa.ForumCinemasTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertTrue;

public class FcProfilePage extends FcBasePage {

    private final By mansprofils = By.className("btn-success");
    private final By nameboxprofils = By.id("inputFirstName");

    private final By surnameboxprofils = By.id("inputLastName");
    //private final By selectbd = By.id("bdDay");
    private final By genderpicker = By.id("genderMale");
    private final By numberbox = By.id("inputMobile");

    public void clickOnMansProfils() {
        driver.findElement(mansprofils).click();
    }

    private final By apstiprinatbutt = By.className("btn-primary");


    public void clearname() {
        driver.findElement(nameboxprofils).clear();
    }

    public void entername(String name) {
        driver.findElement(nameboxprofils).sendKeys(name);
    }


    public void clearsurname() {
        driver.findElement(surnameboxprofils).clear();

    }

    public void entersurname(String surname) {
        driver.findElement(surnameboxprofils).sendKeys(surname);

    }

    public void pickbd(String day) {
        Select bdpicker = new Select(driver.findElement(By.id("bdDay"))); //bdMonth
        bdpicker.selectByValue(day);
    }

    public void pickbm(String bm) {
        Select bmpicker = new Select(driver.findElement(By.id("bdMonth"))); //bdYear
        bmpicker.selectByValue(bm);
    }

    public void pickyear(String year) {
        Select yearpicker = new Select(driver.findElement(By.id("bdYear"))); //bdYear
        yearpicker.selectByValue(year);
    }

    public void pickgendermale() {
        driver.findElement(genderpicker).click();
    }

    public void clearphonebox() {
        driver.findElement(numberbox).clear();
    }

    public void enterphone(String phone) {
        driver.findElement(numberbox).sendKeys(phone);
    }

    public void clickonapstiprinat() {
        driver.findElement(apstiprinatbutt).click();
    }




}





