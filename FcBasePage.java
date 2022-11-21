package lv.qa.ForumCinemasTask;

import org.openqa.selenium.chrome.ChromeDriver;

public class FcBasePage {
    public static ChromeDriver driver;
    public void startDriver() {
        String path = "C:\\Users\\nbort\\IdeaProjects\\AnotherProject\\src\\test\\java\\lv\\qa\\ForumCinemasTask\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
    }


    public void stopDriver() {
        driver.quit();
    }
}
