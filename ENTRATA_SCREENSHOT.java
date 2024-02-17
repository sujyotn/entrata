import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ENTRATA_SCREENSHOT {
   
    	  public static void main(String[] args) throws InterruptedException, IOException {
    	       
    	        System.setProperty("webdriver.chrome.driver", "C:\\SELENIUMS\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
            driver.get("https://www.entrata.com/");
    	Thread.sleep(1000);
    	  TakesScreenshot ts = (TakesScreenshot)driver;
          File source = ts.getScreenshotAs(OutputType.FILE);
        File Folder=new File("C:\\Users\\PC\\OneDrive\\Desktop\\New folder\\entrata.png");
        FileUtils.copyFile(source, Folder);
          System.out.println("the Screenshot is taken");
          driver.quit();
    	   
    	    }
    	}


