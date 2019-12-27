package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumIntro {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver", "/Users/sumeyracivelek/Selenium/ChromeDriver/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/input-form-demo.html" );
        driver.manage().window().maximize();
        Thread.sleep( 1000 );
        driver.findElement( By.name( "first_name" ) ).sendKeys( "Techno" );
        Thread.sleep( 1000 );
        driver.findElement( By.name( "last_name" ) ).sendKeys( "Study" );
        Thread.sleep( 1000 );
        driver.findElement( By.name( "email" ) ).sendKeys( "technostudy19@gmail.com" );
        Thread.sleep( 1000 );
        driver.findElement( By.name( "phone" ) ).sendKeys( "+15513021534" );
        Thread.sleep( 1000 );
        driver.findElement( By.name( "address" ) ).sendKeys( "600 Getty Ave" );
        Thread.sleep( 1000 );
        driver.findElement( By.name( "city" ) ).sendKeys( "Clifton" );
        Thread.sleep( 1000 );
        Select stateSelect = new Select( driver.findElement( By.name( "state" ) ) );
        Thread.sleep( 1000 );
        stateSelect.selectByIndex( 2 );
        Thread.sleep( 1000 );
        driver.findElement( By.name( "zip" ) ).sendKeys( "07011" );
        Thread.sleep( 1000 );
        driver.findElement( By.name( "website" ) ).sendKeys( "https://www.techno.study/" );
        Thread.sleep( 1000 );

        // Scroll down
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript( "window.scrollTo(0, document.body.scrollHeight)" );

        Thread.sleep( 1000 );
        driver.findElement( By.name( "hosting" ) ).click();
        Thread.sleep( 1000 );
        driver.findElement( By.name( "comment" ) ).sendKeys( "Our vision is to revolutionize traditional boot-camp training by giving students the opportunity to try their new skills in on-going projects and start their job hunt with real experience" );
        Thread.sleep( 1000 );
        driver.findElement( By.cssSelector( "button[type='submit']" ) ).click();
        Thread.sleep( 3000 );
        driver.quit();

    }
}
