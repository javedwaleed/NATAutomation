import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classNameLocator {
    public static WebDriver driver;
    public static void main(String args[])
    {
        invokeChromeBrowser();
        driver.get("http://www.turkishairlines.com");
        driver.findElement(By.className("thyHeaderLink")).click();

    }
    public static void invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Waleed Javed\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }
}
