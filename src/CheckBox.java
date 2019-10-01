import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        Browser myBrowser = new Browser();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://www.expedia.com");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#partialHotelBooking-hp-package")).click();
        Thread.sleep(1000);
        System.out.println("It is "+driver.findElement(By.cssSelector("input#partialHotelBooking-hp-package")).isSelected());


        }
}
