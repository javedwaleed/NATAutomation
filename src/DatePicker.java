import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException {
        Browser myBrowser = new Browser();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://www.expedia.com");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.id("package-departing-hp-package")).click();
        Thread.sleep(1000);
        //icu driver.findElement(By.cssSelector("button[data-year='2019'][data-month='9'][data-day='30']")).click();
        // Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.datepicker-paging.datepicker-next.btn-paging.btn-secondary.next")).click();
        Thread.sleep(1000);
        // this will click 2nd time to the > button
        driver.findElement(By.cssSelector("button.datepicker-paging.datepicker-next.btn-paging.btn-secondary.next")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[data-year='2019'][data-month='11'][data-day='29']")).click();
    }
}
