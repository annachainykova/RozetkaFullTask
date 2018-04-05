package tests;

import com.rozetka.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.searchForIphone("iPhone");
    }
}
