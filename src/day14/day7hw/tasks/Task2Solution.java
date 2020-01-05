package day14.day7hw.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class Task2Solution {
    // http://the-internet.herokuapp.com/add_remove_elements/
    // click on the "Add Element" button 100 times
    // write a function that takes a number, and clicks the "Delete" button
    // given number of times, and then validates that given number of
    // buttons was deleted

    private WebDriver driver;

   @BeforeClass
   public void clickwebsite() {
       System.setProperty("webdriver.chrome.driver", "/Users/sumeyracivelek/Selenium/ChromeDriver/chromedriver");
       driver = new ChromeDriver();
       driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
       //createButtons(driver, 70);
       //deleteButtonsAndValidate(driver, 50);
   }
   @AfterClass
   public void quit() {
        driver.quit();
   }
   @Test
    public   void createButtons() {
       int numberOfButtonsToAdd=70;
        WebElement btn = driver.findElement( By.xpath("//*[@onclick='addElement()']"));
        for (int i = 0; i < numberOfButtonsToAdd; i++) {
            btn.click();
        }
    }


    @Test
    public void deleteButtonsAndValidate( ) {
       int number=50;
        List<WebElement> elements = driver.findElements( By.cssSelector( "[onclick='deleteElement()']" ) );
        int sizeBeforeDeleting = elements.size();

        List<WebElement> buttonsToDelete = driver.findElements(By.cssSelector("[onclick='deleteElement()']"));
        int counter = 0;
        for(WebElement webElement : buttonsToDelete) {
            counter++;
            if(counter > number){
                break;
            }
            webElement.click();
        }

        List<WebElement> elementsAfter = driver.findElements( By.cssSelector( "[onclick='deleteElement()']" ) );
        int sizeAfterDeleting = elementsAfter.size();
        Assert.assertEquals((sizeBeforeDeleting-number),sizeAfterDeleting);

    }
}
