package day9.homework.homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SignUpForm {
    /**
     * open SignUpForm.html
     * fill in your data inside the all input elements
     */

    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "/Users/sumeyracivelek/Selenium/ChromeDriver/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get( "file:/Users/sumeyracivelek/IdeaProjects/selenium/src/day9/homework/homework1/SignUpForm.html");
        WebElement text = driver.findElement( By.name( "text" ) );
        text.sendKeys( "sumeyra" );
        WebElement password = driver.findElement( By.name( "password" ) );
        password.sendKeys( "Password" );
        WebElement password1 = driver.findElement( By.name( "password repeat" ) );
        password1.sendKeys( "Password" );
        WebElement textarea = driver.findElement( By.name( "textarea" ) );
        textarea.sendKeys( "172 meriline ave" );
        WebElement checkbox = driver.findElement( By.name( "checkbox" ) );
        checkbox.click();
        List<WebElement> radio = driver.findElements( By.name( "radio" ) );
        WebElement secondElementOfRadio = radio.get( 1 );// [0, 1, 2].click
        secondElementOfRadio.click();
        WebElement select = driver.findElement( By.name( "select" ) );

        Select dropdown = new Select( select );

        List<WebElement> option = dropdown.getOptions();
        for(WebElement element : option) {
            if(element.getText().equals( "opt2" ))
                dropdown.selectByVisibleText( "opt2" );
        }
        WebElement submitButton = driver.findElement( By.name( "submit" ) );
        //submitButton.click();
    }
}
