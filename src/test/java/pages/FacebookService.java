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

    public void sendMessageTo(String idFacebook, String message) throws InterruptedException {
        Thread.sleep(3000);
        driver.get(String.format("https://www.facebook.com/messages/t/%s", idFacebook));
        Thread.sleep(3000);
        while (!idFacebook.isEmpty()) {
            try {
                // Send message
                driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div[4]/div[2]/div/div[1]/div[1]/p")).sendKeys(message);
                Thread.sleep(2000);
                // Send
                driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/span[2]/div")).click();
            } catch (Exception e) {
                System.out.println("Hello world");
            }
        }
    }
}
