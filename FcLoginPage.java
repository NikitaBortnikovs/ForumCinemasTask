package lv.qa.ForumCinemasTask;

import org.openqa.selenium.By;

public class FcLoginPage extends FcBasePage{
    private static final String baseUrll = "https://www.forumcinemas.lv/";

    public void openBaseUrll() {
        startDriver();
        driver.get(baseUrll);
    }
        private final By loginButton = By.className("btn-default");  //btn btn-login btn-default
        private final By usernamebox= By.id("input-userName");
        private final  By passbox = By.id("input-password");
        private final  By ienaktbutt = By.className("btn-block"); //btn btn-primary btn-block




        public void clickOnLoginButton(){
            driver.findElement(loginButton).click();}

            public void clickOnUsernameBox(){
                driver.findElement(usernamebox).sendKeys("nbortnikov41@gmail.com");
            }

            public void clickOnPassBox(){
                    driver.findElement(passbox).sendKeys("Testtest123");

        }
    public void clickOnIenaktButt(){
        driver.findElement(ienaktbutt).click();

    }



    }


