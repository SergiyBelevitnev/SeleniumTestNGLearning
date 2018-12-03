import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GridTest {




    @Test

    public static void gridTest() throws MalformedURLException, InterruptedException{



        String URL = "http://www.google.com";
        String Node = "http://192.168.1.81:4444/wd/hub";
        DesiredCapabilities cap =  DesiredCapabilities.chrome();
        cap.setPlatform(Platform.WINDOWS);
        cap.setBrowserName("chrome");


        WebDriver driver;
        driver = new RemoteWebDriver(new URL(Node), cap);

        driver.navigate().to(URL);
        Thread.sleep(5000);
        driver.quit();
    }
}
