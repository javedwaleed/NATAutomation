import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {
    // waleed creation date :2019
    //ticket #123456 ticket submit scenario
    public static void main(String[] args) {
        Browser myBrowser = new Browser();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://www.expedia.com");

        // set the time out for explicit wait
        WebDriverWait dr=new WebDriverWait(driver,20);
        dr.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#tab-flight-tab-hp"))));
        driver.findElement(By.id("tab-flight-tab-hp")).click();
        // click hotel button
        //icu dr.until(ExpectedConditions.presenceOfElementLocated(By.id("tab-hotel-tab-hp")));
        dr.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("tab-hotel-tab-hp"))));
        // click bundle and save
        dr.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='tab-package-tab-hp']"))));
        driver.findElement(By.xpath("//button[@id='tab-package-tab-hp']")).click();
        dr.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("hotel-destination-hp-hotel"))));
        System.out.println("The input of hotel is invisilble");


    }
}
