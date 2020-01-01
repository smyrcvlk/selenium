package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class part3 {
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

        //click on fees
        driver.findElement(By.xpath("//span[contains(text(),'Fees')]")).click();
        //click on plus button
        driver.findElement(By.xpath("//*[@class='mat-mini-fab mat-button-base mat-accent']")).click();
        //Type the name of the city
       // driver.findElement(By.cssSelector("[formcontrolname=\"name\"]")).click();
       // driver.findElement(By.cssSelector("[placeholder=\"GENERAL.FIELD.NAME\"]")).sendKeys("smsn");

        List<WebElement> name = driver.findElements(By.xpath("//*[@class='mat-form-field-infix']//child::input"));
        name.get(3).sendKeys("smsn");

        List<WebElement> code = driver.findElements(By.xpath("//*[@class='mat-form-field-infix']//child::input"));
        code.get(4).sendKeys("alacam");

        List<WebElement> integrationcode = driver.findElements(By.xpath("//*[@class='mat-form-field-infix']//child::input"));
        integrationcode.get(5).sendKeys("smyr");

        List<WebElement> prioty = driver.findElements(By.xpath("//*[@class='mat-form-field-infix']//child::input"));
        prioty.get(6).sendKeys("5");




     // driver.findElement(By.id("mat-form-field-label-23")).click();
//        driver.findElement(By.xpath("w-95-p ng-pristine ng-invalid ng-touched")).sendKeys("aaaa");
////     8. code
//        driver.findElement(By.cssSelector("#ms-text-field-4")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("#ms-text-field-4")).sendKeys("civelek");
//        driver.findElement(By.id("mat-option-24")).click();
//
////    9.Click on save
//
//        driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
//
////    10.Click on edit
//
//        WebElement city = driver.findElement(By.xpath("//*[contains(text(),'smsn')]"));
//        city.click();
//
//        WebElement edit = driver.findElement(By.xpath("//input[@ id='ms-text-field-2']"));
//        edit.clear();
//
//// 11 Change the name
//        edit.sendKeys("smsn123");
//
//
//// 12 Click on save
//
//        driver.findElement(By.xpath("//button[@class='save-button mat-accent mat-button mat-raised-button mat-button-base ng-star-inserted']")).click();
//
//
//// 13  Click on delete button
//
//
//        driver.findElement(By.xpath("//*[contains(text(),'smsn123')]")).findElement(By.xpath("//button[@class='mat-button mat-button-base mat-warn ng-star-inserted']")).click();
//        //14Click on yes
//
//        driver.findElement(By.xpath("//button[@class='mat-button mat-raised-button mat-button-base mat-accent']")).click();
//

    }
}