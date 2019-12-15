package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ChromeBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver", "D:\\TechnoStudy\\Selenium\\ChromeDriver\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get( "file:///D:/Project/SeleniumExercises/src/day3/resources/form.html" );
        WebElement text = driver.findElement( By.name( "text" ) );
        text.sendKeys( "This is my text" );
        WebElement webElement = driver.findElement( By.name( "password" ) );
        webElement.sendKeys( "Password" );
        WebElement textarea = driver.findElement( By.name( "textarea" ) );
        textarea.sendKeys( "Some text Area words" );
        WebElement checkbox = driver.findElement( By.name( "checkbox" ) );
        checkbox.click();
        List<WebElement> radio = driver.findElements( By.name( "radio" ) );
        WebElement secondElementOfRadio = radio.get( 1 );// [0, 1, 2].click
        secondElementOfRadio.click();

        //

// close the drive and associated windows
        driver.quit();
    }
}
