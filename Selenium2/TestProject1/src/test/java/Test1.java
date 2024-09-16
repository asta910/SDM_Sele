import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        try{ Thread.sleep(1200); }
        catch (InterruptedException e){ System.out.println(e); }


        driver.manage().window().maximize();
        try{ Thread.sleep(1200); }
        catch (InterruptedException e){ System.out.println(e); }

        //ClassName   :
        driver.findElement(By.className("input_error")).sendKeys("standard_user");
        try{ Thread.sleep(1200); }
        catch (InterruptedException e){ System.out.println(e); }

        //id   :
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //driver.findElement(By.id("password")).sendKeys("secret");
        try{ Thread.sleep(1000); }
        catch (InterruptedException e){ System.out.println(e); }

        //relative Xpath   :
        driver.findElement(By.xpath("//*[@id='login-button'] ")).click();
        try{ Thread.sleep(1500); }
        catch (InterruptedException e){ System.out.println(e);}

        //absolute Xpath   :
        //String response = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]")).getText();
        //System.out.println("Response for error : " + response);


        System.out.println("Opened web succesfully !..");


//        WebDriver driver2 = new ChromeDriver();
//        driver2.get("https://www.saucedemo.com/inventory.html");
//
//        driver2.manage().window().fullscreen();
//        try{ Thread.sleep(2000);}
//        catch (InterruptedException e) {System.out.println(e); }
//        driver2.close();



//        String response = driver.findElement(By.xpath("//*[@id='remove-sauce-labs-backpack']")).getText();
//        String ans = "Remove";
//        if(response.equals(ans)){
//            driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']")).click();
//        }

        //open menu
        driver.findElement(By.xpath("//*[@id=\'menu_button_container\']/div/div[1]/div")).click();
        try{Thread.sleep(1500);}catch (InterruptedException e) {System.out.println(e);}

        //close menu
        driver.findElement(By.xpath("//*[@id=\'react-burger-cross-btn\']")).click();
        try{Thread.sleep(1500);}catch (InterruptedException e) {System.out.println(e);}


        driver.findElement(By.xpath("//*[@id=\'add-to-cart-sauce-labs-backpack\']")).click();
        try{Thread.sleep(1200);}catch (InterruptedException e) {System.out.println(e);}


        driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bike-light']")).click();
        try{Thread.sleep(1200);}catch (InterruptedException e) {System.out.println(e);}

        //filter
        driver.findElement(By.className("product_sort_container")).click();
        try{Thread.sleep(2200);}catch (InterruptedException e) {System.out.println(e);}

        driver.findElement(By.xpath("//*[@id=\'add-to-cart-test.allthethings()-t-shirt-(red)\']")).click();
        try { Thread.sleep(2000);}catch (InterruptedException e) {System.out.println(e); }


        driver.findElement(By.xpath(" //*[@id=\'header_container\']/div[2]/div/span/select/option[3]")).click();
        try{Thread.sleep(3200);}catch (InterruptedException e) {System.out.println(e);}


        driver.findElement(By.xpath("//*[@id=\'shopping_cart_container\']/a")).click();
        try{Thread.sleep(3200);}catch (InterruptedException e) {System.out.println(e);}

        //checkout menu
        driver.findElement(By.id("checkout")).click();
        try{Thread.sleep(3200);}catch (InterruptedException e) {System.out.println(e);}

        Actions actions = new Actions(driver);

        // Scroll down
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //fill name & info
        driver.findElement(By.id("first-name")).sendKeys("Naaruto");
        driver.findElement(By.id("last-name")).sendKeys("Uzumaki");
        try{Thread.sleep(2200);}catch (InterruptedException e) {System.out.println(e);}
        driver.findElement(By.id("postal-code")).sendKeys("413116");
        try{Thread.sleep(1200);}catch (InterruptedException e) {System.out.println(e);}
        driver.findElement(By.id("continue")).click();

        //actions.sendKeys(Keys.PAGE_DOWN).perform();

        driver.findElement(By.xpath("//*[@id=\'finish\']")).click();
        try{Thread.sleep(4200);}catch (InterruptedException e) {System.out.println(e);}

        driver.findElement(By.xpath("//*[@id=\'back-to-products\']")).click();
        try{Thread.sleep(2500);}catch (InterruptedException e) {System.out.println(e);}

        driver.close();

    }
}
