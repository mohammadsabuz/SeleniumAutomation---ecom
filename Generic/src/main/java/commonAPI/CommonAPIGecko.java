package commonAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class CommonAPIGecko {

    public WebDriver geckoDriver;

    @BeforeMethod
    public void before(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\moham\\IdeaProjects\\ecom\\driver\\geckodriver.exe");
        geckoDriver = new FirefoxDriver();
    }

}
