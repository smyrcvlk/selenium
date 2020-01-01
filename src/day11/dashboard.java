package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class dashboard {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/sumeyracivelek/Selenium/ChromeDriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get(" https://test-basqar.mersys.io/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("[formcontrolname=\"username\"]")).sendKeys("admin");
        driver.findElement(By.cssSelector("[formcontrolname=\"password\"]")).sendKeys("admin");
        driver.findElement(By.cssSelector("button[aria-label=\"LOGIN\"]")).click();



        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //click on setup


        driver.findElement(By.xpath("//span[contains(text(),'Setup')]")).click();

        //Click on parameters

        driver.findElement(By.xpath("//span[contains(text(),'Parameters')]")).click();

        //Click on Nationalities

        driver.findElement(By.xpath("//span[contains(text(),'Nationalities')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);


        //Click on plus icon

        driver.findElement(By.xpath("//*[@class='mat-mini-fab mat-button-base mat-accent']")).click();

        //Type the name of the Nationality


        List<WebElement> element = driver.findElements(By.xpath("//*[@class='mat-form-field-infix']//child::input"));
        element.get(1).sendKeys("smsn");

        driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
        // Thread.sleep(3000);


        //Click on edit

        WebElement nation = driver.findElement(By.xpath("//*[contains(text(),'smsn')]"));
        nation.click();
        WebElement edit=driver.findElement(By.xpath("//input[@ id='ms-text-field-2']"));
        edit.clear();
        edit.sendKeys("smsn123");

        driver.findElement(By.xpath("//button[@class='save-button mat-accent mat-button mat-raised-button mat-button-base ng-star-inserted']")).click();

        //Click on delete button
        driver.findElement(By.xpath("//*[contains(text(),'smsn123')]")).findElement(By.xpath("//button[@class='mat-button mat-button-base mat-warn ng-star-inserted']")).click();

        //Click on yes

        driver.findElement(By.xpath("//button[@class='mat-button mat-raised-button mat-button-base mat-accent']")).click();



    }
}