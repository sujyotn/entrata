import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EntrataResourcesTest {
    public static void main(String[] args) {
       
        System.setProperty("webdriver.chrome.driver","C:\\SELENIUMS\\chromedriver.exe");

       
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.entrata.com");

       
        WebElement resourcesLink = driver.findElement(By.linkText("Resources"));
        resourcesLink.click();

       
        System.out.println("Resources page title: " + driver.getTitle());

       
        driver.quit();
    }
}
