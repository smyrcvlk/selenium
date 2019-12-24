package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html
// click on the "Autocloseable success message" button
// then validate that "I'm an autocloseable success  message. I will hide in 5 seconds."
// disappears, wait at least 10 seconds for it to disappear
public class Task4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/sumeyracivelek/Selenium/ChromeDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
        WebElement btn = driver.findElement(By.id("autoclosable-btn-success"));
        btn.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("alert-autoclosable-message")));

        }catch (Exception e){
            System.out.println("failure");
        }


    }
}
