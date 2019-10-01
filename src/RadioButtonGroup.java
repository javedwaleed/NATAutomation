import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonGroup {
    public static void main(String[] args) throws Exception {
        Browser myBrowser =new Browser();
        WebDriver driver= myBrowser.invokeChromeBrowser();
        driver.get("http://www.echoecho.com/htmlforms10.htm");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        int count= driver.findElements(By.cssSelector("input[type='radio']")).size();
        System.out.println("The Number Of Radio Button In Group 1 is :" +count);
        for(int i=0; i<count;i++){
            driver.findElements(By.cssSelector("input[type='radio']")).get(i).click();
            Thread.sleep(1000);
        }
    }
}
