import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestOfLocating {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://rozetka.com.ua/";
        driver.get(url);
        Thread.sleep(1000);

        WebElement searchInput = driver.findElement(By.xpath(".//input[@placeholder='Поиск']"));
        searchInput.sendKeys("fdsdsa");
        WebElement submitSearchButton = driver.findElement(By.xpath(".//button[@type='submit']"));
        submitSearchButton.click();
    }

}
