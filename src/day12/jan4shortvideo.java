package day12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class jan4shortvideo {

    public static void main(String[] args) throws InterruptedException{

                System.setProperty("webdriver.chrome.driver", "/Users/sumeyracivelek/Selenium/ChromeDriver/chromedriver");

        WebDriver driver;

        driver = new ChromeDriver();

        /*
         *   Implicit wait vs explicit wait
         *
         *   Implicit wait is creating once and it is end until the driver is quit or execution is done
         *
         *     implicit wait is throwing No Such Element Exception
         *
         *   Explicit wait is creating for each element and after the element is passed explicit wait is not effective any more and you need create other wait for 2 element
         *
         *      explicit wait is throwing ElementNotVisible Exception
         *
         */

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;

        driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys("admin");

        driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("admin");

        driver.findElement(By.xpath("//button[@aria-label='LOGIN']")).click();

        WebElement setupDropdown = driver.findElement(By.xpath("//span[text()='Inventory']"));

        WebDriverWait wait = new WebDriverWait(driver, 5);

//        wait.until(ExpectedConditions.elementToBeClickable(setupDropdown));

        setupDropdown.click();

        WebElement parametersDropdown = driver.findElement(By.xpath("(//span[text()='Setup'])[4]"));

        parametersDropdown.click();

        WebElement buttonItemCatagory = driver.findElement(By.xpath("//span[text()='Item Categories']"));

        buttonItemCatagory.click();

        WebElement buttonPlusIcon = driver.findElement(By.xpath("//button[@class='mat-mini-fab mat-button-base mat-accent']"));

        buttonPlusIcon.click();

        String itemName ="Techno study";

        try{
            WebElement inputName = driver.findElement( By.xpath("//ms-text-field[@formcontrolname='name']//input"));

            wait.until( ExpectedConditions.visibilityOf(inputName));

            inputName.sendKeys(itemName);

        }catch(NoSuchElementException e ){

            System.out.println("element is not visible ");
        }

        WebElement dropdownUserType = driver.findElement(By.xpath("//input[@class='mat-chip-input mat-input-element mat-autocomplete-trigger']/parent::div/parent::mat-chip-list/parent::div"));

        WebElement droownUser = driver.findElement( By.xpath( "//input[@class='mat-chip-input mat-input-element mat-autocomplete-trigger']" ) );

        droownUser.click();

        WebElement optionUser = driver.findElement( By.xpath( "//span[text()=' User ']" ));


    }
}

