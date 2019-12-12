package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
    public static void main(String[] args) {
        System.setProperty( "webdriver.gecko.driver", "D:\\TechnoStudy\\Selenium\\FirefoxDriver\\geckodriver.exe" );
        WebDriver driver = new FirefoxDriver();
        driver.get( "https://www.techno.study/" );
    }
}
