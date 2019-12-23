package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByXpath {

    // https://www.seleniumeasy.com/test/input-form-demo.html
    // fill in the form using xpath by attribute,
    // by contains(),
    // by index,
    // also by child
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/sumeyracivelek/Selenium/ChromeDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
        driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys("Sumeyra");
        Thread.sleep( 1000 );
        driver.findElement( By.xpath("//* [@name='last_name'] ") ).sendKeys( "Civelek" );
        Thread.sleep( 1000 );
        driver.findElement( By.xpath("//*[@name='email']") ).sendKeys( "Smyrcvlk@gmil.com" );
    }
}