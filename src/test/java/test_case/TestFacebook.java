package test_case;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.FacebookService;

public class TestFacebook {
    private WebDriver driver;

    @BeforeEach
    void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String pathValue = "V:\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathValue);
        driver.get("https://facebook.com");
        Thread.sleep(2000);
    }

    @Test
    void loginFacebook() throws InterruptedException {
        String message = "message";
        String username = "username";
        String password = "password";
        String idFacebook = "100092864113360";
        FacebookService service = new FacebookService(driver);
        service.login(username, password);
        service.sendMessageTo(idFacebook, message);
    }

}