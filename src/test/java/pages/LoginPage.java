package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public static String login_text_xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/h5";
    public static String username_xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input";
    public static String password_xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input";
    public static String login_button_xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button";

    public static void login_text_is_displayed() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:3000/login");
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_text_xpath)).isDisplayed();
    }

    public static void enter_username() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(username_xpath)).sendKeys(Admin);
    }

    public static void enter_password() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(password_xpath)).sendKeys(admin123);
    }

    public static void click_login_button() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_xpath)).click();
        Thread.sleep(2000);
    }
}
