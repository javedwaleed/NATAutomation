import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryXpath {

    public static void main(String[]args) throws Exception {
        Browser myBrowser = new Browser();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://www.skyscanner.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();


    }
}
