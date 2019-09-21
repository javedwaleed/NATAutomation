import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
    public static WebDriver driver;
    public static void main(String args[]) throws Exception
    {
       invokeChromeBrowser();
       driver.get("http://www.facebook.com");

       driver.findElement(By.name("firstname")).sendKeys("Waleed");

       driver.findElement(By.name("lastname")).sendKeys("Javed");
       Thread.sleep(2000);
       driver.findElement(By.name("reg_email__")).sendKeys("2819147129");
       Thread.sleep(2000);
       driver.findElement(By.id("month")).sendKeys("July");
       Thread.sleep(2000);
       driver.findElement(By.id("day")).sendKeys("24");
       Thread.sleep(2000);
       driver.findElement(By.id("year")).sendKeys("1979");

    }

    public static void invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Waleed Javed\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }
}
