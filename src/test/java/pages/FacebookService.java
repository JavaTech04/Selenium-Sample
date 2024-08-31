package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookService {
    private final WebDriver driver;

    public FacebookService(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys(username);
        Thread.sleep(1000);
        driver.findElement(By.id("pass")).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
    }
}
