package pages;

import model.UserXpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminService {
    private WebDriver driver;

    public AdminService(WebDriver driver) {
        this.driver = driver;
    }

    public void admin() throws InterruptedException {
        // Goto admin page
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
        Thread.sleep(3000);
    }

    public void addUser(UserXpath user) throws InterruptedException {
        // click add
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
        Thread.sleep(4000);
        // click role
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div")).click();
        Thread.sleep(1000);
        // select role
        driver.findElement(By.xpath(String.format("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[%d]", user.getRole()))).click();
        Thread.sleep(1000);
        // click status
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div")).click();
        Thread.sleep(1000);
        // select enable
        driver.findElement(By.xpath(String.format("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[%d]", user.getStatus()))).click();
        Thread.sleep(1000);
        // enter employee name
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")).sendKeys("a");
        Thread.sleep(3000);
        // select employee
        driver.findElement(By.xpath(String.format("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[%d]", user.getEmployeeName()))).click();
        Thread.sleep(1000);
        // username
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")).sendKeys(user.getUsername());
        Thread.sleep(1000);
        // password
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys(user.getPassword());
        Thread.sleep(1000);
        // confirm password
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys(user.getConfirmPassword());
        Thread.sleep(1000);
        // submit
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
    }
}
