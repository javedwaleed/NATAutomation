import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class javaScript {
    public static void main(String[] args) throws InterruptedException {
        Browser myBrowser = new Browser();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://www.tizag.com/javascripT/javascriptalert.php");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[type=button]")).click();
        Thread.sleep(1000);
        // icu System.out.println(driver.switchTo().alert().getText());
        String expectedvValue="Are you sure you want give us the deed to your house";
        if(expectedvValue.contains(driver.switchTo().alert().getText())) {
            Thread.sleep(1000);
            driver.switchTo().alert().accept();
        }


    }
}
