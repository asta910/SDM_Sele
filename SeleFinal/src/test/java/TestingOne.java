import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingOne {
    public static void main(String[] args)  {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }

        driver.findElement(By.name("q")).sendKeys("Virat Kohli");  // Updated 'APjFqb' to 'q' (Google search bar)

        try{ Thread.sleep(2000); }
        catch (InterruptedException e){
            System.out.println(e);
        }

        driver.manage().window().maximize();
        try{ Thread.sleep(2000); }
        catch (InterruptedException e){
            System.out.println(e);
        }

        driver.findElement(By.name("btnK")).click();  // Simplified XPath to button name 'btnK'
        driver.close();
    }
}
