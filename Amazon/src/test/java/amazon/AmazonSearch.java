package amazon;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class AmazonSearch extends CommonAPIChrome{

    String url;

    @Test
    public void Amazon(){
        chromeDriver.get("https://www.amazon.com");
        chromeDriver.manage().window().maximize(); //maximize the screen size
        String title = chromeDriver.getTitle(); //get title
        System.out.println("Title is: " + title); //print title
        url = chromeDriver.getCurrentUrl(); //get url
        System.out.println("URL is: " + url); //print url

        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("books", Keys.ENTER); //by ID
        url = chromeDriver.getCurrentUrl(); //get url
        System.out.println("URL 2 is: " + url); //print url

        chromeDriver.findElement(By.xpath("//div[@id='navbar']//a//span[text()='Amazon']")).click(); //by xpath
        url = chromeDriver.getCurrentUrl(); //get url
        System.out.println("URL 3 is: " + url); //print url
     }

    @AfterMethod
    public void after(){
        chromeDriver.close(); //close the window
    }
}
