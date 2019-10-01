import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButton {
    public static void main(String[] args) throws Exception {
        Browser myBrowser = new Browser();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://www.echoecho.com/htmlforms10.htm");
        driver.findElement(By.cssSelector("input[value='Milk']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[value='Butter']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[value='Cheese']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[value='Milk']")).click();
        Thread.sleep(1000);

    }
}
