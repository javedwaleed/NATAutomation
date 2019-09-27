import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CssSelectorId {
    public static void main(String args[]) throws Exception {

        Browser myBrowser = new Browser();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://www.expedia.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#package-origin-hp-package")).sendKeys("Atlanta");
        Thread.sleep(1000);
        for (int i = 0; i < 4; i++) {
            driver.findElement(By.cssSelector("#package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
        }
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#package-origin-hp-package")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("input[id='package-destination-hp-package']")).sendKeys("Las Vegas");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#package-destination-hp-package[aria-owns='typeaheadDataPlain']")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[id*='package-departing-hp-package']")).sendKeys("10/10/2019");

        for(int i=1;i<=11;i++){
            driver.findElement(By.cssSelector("input[id='package-returning-hp-package']")).sendKeys(Keys.BACK_SPACE);
        }
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#package-returning-hp-package")).sendKeys("11/01/2019");
        driver.findElement(By.cssSelector("input[id='package-returning-hp-package']")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);

    }
}



