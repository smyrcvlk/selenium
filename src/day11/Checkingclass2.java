package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Checkingclass2 {
    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "/Users/sumeyracivelek/Selenium/ChromeDriver/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://test-basqar.mersys.io");
        driver.manage().window().maximize();


        driver.findElement(By.cssSelector("[formcontrolname=\"username\"]")).sendKeys("admin");
        driver.findElement(By.cssSelector("[formcontrolname=\"password\"]")).sendKeys("admin");
        driver.findElement(By.cssSelector("button[aria-label=\"LOGIN\"]")).click();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//span[contains(text(),'Entrance Exams')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Entrance Exams')]/../..//span[contains(text(),'Setup')]"))
                .click();
        driver.findElement(By.xpath("//span[contains(text(),'Setup')]/../..//span[contains(text(),'Entrance Exams')]"))
                .click();
        WebDriverWait wait = new WebDriverWait(driver, 15);

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("tbody > tr"))); // this is to wait
            // for the first
            // search
        } catch (Exception e) {
            // there's no results for first search, continue
        }

        driver.findElement(By.xpath("//*[@class='cc-btn cc-dismiss']")).click();

        wait.until( ExpectedConditions.invisibilityOfElementLocated( By.xpath("//*[@class='cc-btn cc-dismiss']") ) );

        driver.findElement(By.className("mat-paginator-navigation-next")).click();

        try {
            wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("tbody > tr "), 2));
            System.out.println("Success!");
        } catch (Exception e) {
            System.out.println("Failure!");
        }

        driver.findElement(By.className("mat-paginator-navigation-previous")).click();

        try {
            wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("tbody > tr "), 10));
            System.out.println("Success!");
        } catch (Exception e) {
            System.out.println("Failure!");
        }

        driver.findElement(By.className("mat-paginator-navigation-last")).click();
        try {
            wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("tbody > tr "), 2));
            System.out.println("Success!");
        } catch (Exception e) {
            System.out.println("Failure!");
        }
    }

}
