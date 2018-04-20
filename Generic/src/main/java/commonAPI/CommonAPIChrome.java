package commonAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class CommonAPIChrome {

    public WebDriver chromeDriver;

    @BeforeMethod
    public void before(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\IdeaProjects\\ecom\\driver\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
    }

}
