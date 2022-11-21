package lv.qa.ForumCinemasTask;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static lv.qa.ForumCinemasTask.FcBasePage.driver;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class ForumCinTest extends FcProfilePage {

    FcLoginPage fcLoginPage = new FcLoginPage();
    FcProfilePage fcProfilePage = new FcProfilePage();

    //private final By nameboxprofils = By.id("inputFirstName");

    @Test
    public void fcTests() {
        SoftAssert softAssert = new SoftAssert();

        fcLoginPage.openBaseUrll();
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        fcLoginPage.clickOnLoginButton();
        fcLoginPage.clickOnUsernameBox();
        fcLoginPage.clickOnPassBox();
        fcLoginPage.clickOnIenaktButt();
        fcProfilePage.clickOnMansProfils();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)", "");
        fcProfilePage.clearname();
        fcProfilePage.clearsurname();


        String textForActualName = "Nikita";
        fcProfilePage.entername(textForActualName);
        String actualName = textForActualName;
        String expectedName = "Nikitaa";
        softAssert.assertEquals(actualName, expectedName, "NOT CORRECT NAME");


        //driver.findElement(By.id("inputFirstName")).getText();
        //if(actualString.equals(expectedString)) {
        //  System.out.println("Name correct");}
        //else{System.out.println("Not correct");}

        String textForActualSurname = "Bortnikovs";
        fcProfilePage.entersurname(textForActualSurname);
        String actualSurname = textForActualSurname;
        String expectedSurname = "Bortnikovss";
        softAssert.assertEquals(actualSurname, expectedSurname, "NOT CORRECT SURNAME");

        String textForActualBd = "25";
        fcProfilePage.pickbd(textForActualBd);
        String actualBd = textForActualBd;
        String expectedBd = "26";
        softAssert.assertEquals(actualBd, expectedBd, "NOT CORRECT BIRTHDAY DATE");

        String textForActualBm = "10";
        fcProfilePage.pickbm(textForActualBm);
        String actualBm = textForActualBm;
        String expectedBm = "12";
        softAssert.assertEquals(actualBm, expectedBm, "NOT CORRECT BIRTHDAY MONTH");

        String textForActualYear = "1996";
        fcProfilePage.pickyear(textForActualYear);
        String actualYear = textForActualYear;
        String expectedYear = "2000";
        softAssert.assertEquals(actualYear, expectedYear, "NOT CORRECT YEAR");

        fcProfilePage.pickgendermale();
        fcProfilePage.clearphonebox();

        String textForActualNumber = "26454994";
        fcProfilePage.enterphone(textForActualNumber);
        String actualNumber = textForActualNumber;
        String expectedNumber = "666";
        softAssert.assertEquals(actualNumber, expectedNumber, "NOT CORRECT NUMBER");


        js.executeScript("window.scrollBy(0,400)", "");
        fcProfilePage.clickonapstiprinat();

        softAssert.assertAll();
    }
}
