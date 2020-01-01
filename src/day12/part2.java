package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class part2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/sumeyracivelek/Selenium/ChromeDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://test-basqar.mersys.io");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("[formcontrolname=\"username\"]")).sendKeys("admin");
        driver.findElement(By.cssSelector("[formcontrolname=\"password\"]")).sendKeys("admin");
        driver.findElement(By.cssSelector("button[aria-label=\"LOGIN\"]")).click();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//span[contains(text(),'Setup')]")).click();

        driver.findElement(By.xpath("//span[contains(text(),'Parameters')]")).click();

        //click on cities
        driver.findElement(By.xpath("//span[contains(text(),'Cities')]")).click();
        //click on plus button
        driver.findElement(By.xpath("//*[@class='mat-mini-fab mat-button-base mat-accent']")).click();
        //Type the name of the city
        List<WebElement> element = driver.findElements(By.xpath("//*[@class='mat-form-field-infix']//child::input"));
        element.get(1).sendKeys("smsn");

//     8. Choose any country in the dropdown
        driver.findElement(By.id("mat-select-2")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("mat-option-24")).click();

//    9.Click on save

        driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();

//    10.Click on edit

        WebElement city = driver.findElement(By.xpath("//*[contains(text(),'smsn')]"));
        city.click();

        WebElement edit=driver.findElement(By.xpath("//input[@ id='ms-text-field-2']"));
        edit.clear();

// 11 Change the name
        edit.sendKeys("smsn123");


// 12 Click on save

        driver.findElement(By.xpath("//button[@class='save-button mat-accent mat-button mat-raised-button mat-button-base ng-star-inserted']")).click();


// 13  Click on delete button


        driver.findElement(By.xpath("//*[contains(text(),'smsn123')]")).findElement(By.xpath("//button[@class='mat-button mat-button-base mat-warn ng-star-inserted']")).click();
        //14Click on yes

        driver.findElement(By.xpath("//button[@class='mat-button mat-raised-button mat-button-base mat-accent']")).click();









        //        WebElement country=driver.findElement(By.xpath("//*[@class='mat-option ng-star-inserted']"));
//        country.click();

        //  driver.findElement(By.cssSelector("#mat-select-0")).click();

//        driver.findElement(By.className("mat-select-arrow")).click();
//
//        driver.findElement(By.xpath("//*[@id=\"mat-select-3\"]/div/div[2]/div")).click();

        //  driver.findElement(By.xpath("//span[contains(text(),'Turkey')]")).click();
        //   driver.findElement(By.id("mat-option-30")).click();
//        List<WebElement> country=driver.findElements(By.xpath("//*[@class='mat-option ng-star-inserted']"));
//        country.get(30).sendKeys("Turkey");

    }
}