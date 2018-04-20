package google;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class GoogleSearch extends CommonAPIChrome {

    /*
    Searching for an item and going back, clearing the search and
    then searching for another item and goign back, and continuing
    */

    String url;

    @Test
    public void Google(){
        chromeDriver.get("https://www.google.com");
        url = chromeDriver.getCurrentUrl();
        System.out.println("Starting search URL is: " + url);
        chromeDriver.findElement(By.id("lst-ib")).sendKeys("books", Keys.ENTER); //by ID
        url = chromeDriver.getCurrentUrl();
        System.out.println("1st search url: "+ url);
        chromeDriver.navigate().back();

        url = chromeDriver.getCurrentUrl();
        System.out.println("Starting 2nd search URL is: " + url);
        chromeDriver.findElement(By.id("lst-ib")).clear();
        chromeDriver.findElement(By.cssSelector(".gsfi#lst-ib")).sendKeys("java",Keys.ENTER); //by CSS Selector
        url = chromeDriver.getCurrentUrl();
        System.out.println("2nd search url: " + url);
        chromeDriver.navigate().back();

        url = chromeDriver.getCurrentUrl();
        System.out.println("Starting 3rd search URL is: " + url);
        chromeDriver.findElement(By.cssSelector(".gsfi#lst-ib")).clear();
        chromeDriver.findElement(By.cssSelector("div>input.gsfi#lst-ib")).sendKeys("ps4 games", Keys.ENTER); //by CSS Child
        url = chromeDriver.getCurrentUrl();
        System.out.println("3rd search url: " + url);
        chromeDriver.findElement(By.cssSelector("div>input.gsfi#lst-ib")).clear();
    }

    @AfterMethod
    public void after(){
        chromeDriver.navigate().back();
        url = chromeDriver.getCurrentUrl();
        System.out.println("Ending URL is : " + url);
        chromeDriver.close();
    }
}
