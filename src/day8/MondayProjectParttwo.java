package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Random;

public class MondayProjectParttwo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/sumeyracivelek/Selenium/ChromeDriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.phptravels.net/en");

        driver.manage().window().maximize();
        int size = driver.findElements(By.xpath("//*[@class='position-absolute-href']")).size();


        for (int i = 0; i < size; i++) {
            Random random = new Random();
            int num = random.nextInt(7);
            List<WebElement> featuredtour = driver.findElements(By.xpath("//*[@class='position-absolute-href']"));
            System.out.println(num);
            featuredtour.get(num).click();
            Thread.sleep(3000);
            driver.get("https://www.phptravels.net/en");
        }

        Thread.sleep(3000);
        driver.quit();

//        System.out.println("featured tours " + num);





    }
}