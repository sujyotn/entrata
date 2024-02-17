import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class EntrataScript1{
public static void main(String[] args) throws InterruptedException, IOException {
    	       
    	        System.setProperty("webdriver.chrome.driver", "C:\\SELENIUMS\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
            driver.get("https://www.entrata.com/");
Thread.sleep(3000);
        // Close the browser
        driver.quit();
   }
}


