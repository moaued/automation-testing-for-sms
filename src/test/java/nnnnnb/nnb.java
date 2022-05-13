package nnnnnb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nnb {
    public  static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("file://C:\\Users\\Elhussien\\Desktop\\haneen\\src\\test\\resources\\index.html");
     driver.manage().window().maximize();
// Dimension dimension=new Dimension(414,896);
//driver.manage().window().setSize(dimension);
/*ng url= driver.getCurrentUrl();
System.out.println(url);
String title=driver.getTitle();
System.out.println(title);
String page=driver.getPageSource();
System.out.println(page);
driver.navigate().to("https://www.facebook.com/");
driver.navigate().back();*/
driver.findElement(By.id("welcome")).getText();
        System.out.println();




























}}