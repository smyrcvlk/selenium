package day4.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    // go to URL: https://www.seleniumeasy.com/test/
    // click on each link of class="board-inner"
    // and validate that class="tab-content" has
    // correct text for "h3" tag and adjacent "p" tag in active div
    // after you click associated link above

    // there should be at least 5 test of "h3" tag and adjacent "p" tag
    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "/Users/sumeyracivelek/Selenium/ChromeDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/" );

        WebElement message = driver.findElement(By.cssSelector());
        String myMessage ="Welcome to Selenium Easy";
//        System.out.println(myMessage);
//        System.out.println(message.getText());

        if(!message.getAttribute("head text - center ").equals(myMessage)){

            System.out.println("success!");
        }else{
            System.out.println("fail");
        }
    }
}
