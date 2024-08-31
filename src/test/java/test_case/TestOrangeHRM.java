package test_case;

import model.UserXpath;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AdminService;
import pages.AuthenticationService;

public class TestOrangeHRM {
    private WebDriver driver;
    private UserXpath userXpath;

    @BeforeEach
    void setUp() throws InterruptedException {
        this.userXpath = setupUserXpath();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String pathValue = "V:\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathValue);
        Thread.sleep(5000);
        new AuthenticationService(driver).login();
    }

    UserXpath setupUserXpath() {
        UserXpath u = new UserXpath();
        u.setRole(3);
        u.setStatus(3);
        u.setEmployeeName(2);
        u.setUsername("hacker123");
        u.setPassword("Hacker123@");
        u.setConfirmPassword("Hacker123@");
        return u;
    }


    @Test
    void testAddUser() throws InterruptedException {
        AdminService service = new AdminService(driver);
        // Goto admin page
        service.admin();
        service.addUser(this.userXpath);
    }

    @Test
    void testLogout() throws InterruptedException {
        AuthenticationService service = new AuthenticationService(driver);
        service.logout();
    }
}
