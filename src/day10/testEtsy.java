package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testEtsy {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/sumeyracivelek/Selenium/ChromeDriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com/");

        driver.manage().window().maximize();

        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("teddy bear");

        driver.findElement(By.xpath("//button[@value='Search']")).click();

        String textSearchedElement =driver.findElement(By.xpath("//h1[@class='display-inline strong wt-text-caption']")).getText();
        System.out.println(textSearchedElement);
        driver.findElement(By.xpath("//label[text()='On sale']")).click();

        driver.findElement(By.xpath("//div[contains(text(),'On sale')]"));
        driver.findElement(By.xpath("//label[text()='1 business day']")).click();

        String message13businesday=driver.findElement(By.xpath("//div[contains(text(),'    1 – 3 business days')]")).getText();
        System.out.println(message13businesday);
    }
}