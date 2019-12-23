package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {
    // http://the-internet.herokuapp.com/add_remove_elements/
    // click on the "Add Element" button 100 times
    // write a function that takes a number, and clicks the "Delete" button
    // given number of times, and then validates that given number of
    // buttons was deleted
    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "/Users/sumeyracivelek/Selenium/ChromeDriver/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get( " http://the-internet.herokuapp.com/add_remove_elements/");
        clickAndValidateButtons(driver, 100);
        clickAndDeleteButtons( driver, 50);

    }
    private static void clickAndValidateButtons(WebDriver driver, int num){
        WebElement btn=driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        for (int i = 0; i < num; i++) {
            btn.click();
        }

    }

    private  static void clickAndDeleteButtons(WebDriver drivers, int num){
        WebElement delete=drivers.findElement(By.xpath ("//*[@onclick='deleteElement()']"));
        for (int i = 0; i < num; i++) {
            delete.click();
        }
        List<WebElement> list = drivers.findElements(By.className("delete-manually"));
        if (list.size() == num) {
            System.out.println("success!");
        }
        else
            System.out.println("fail!");
    }


}


