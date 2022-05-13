package nnnnnb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import java.time.Duration;

public class findel {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:8000");
        driver.manage().window().maximize();
new WebDriverWait(driver,Duration.ofSeconds(100)).until(ExpectedConditions.invisibilityOfElementLocated((By.id("email"))));

        driver.navigate().to("http://127.0.0.1:8000/login/admin");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.findElement(By.id("email")).sendKeys("engmostafaaued31@gmail.com");
        driver.findElement(By.id("password")).sendKeys("p@ssw0rd");
        driver.findElement(By.className("button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("http://127.0.0.1:8000/ar/Teachers/create");
     
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/form/div[1]/div[1]/input")).sendKeys("engmostafyfaaued31@gmail.com");
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/form/div[1]/div[2]/input")).sendKeys("fffaHHSAHAHjxsjsjfdjkhfghfghfdghASfhhhh");
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/form/div[2]/div[1]/input")).sendKeys("fffaHHSAHAHjxsjsjfdjkhfghfghfdghASfhhhh");
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/form/div[2]/div[2]/input")).sendKeys("fffaHHSAHAHjxsjsjfdjkhfghfghfdghASfhhhh");
        Select drop= new Select(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/form/div[3]/div[1]/select")));
        drop.selectByIndex(3);
        Select dropp= new Select(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/form/div[3]/div[2]/select")));

        dropp.selectByIndex(1);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/form/div[4]/div/div/input")).sendKeys("2022-05-06");
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/form/div[5]/textarea")).sendKeys("fffaHHSAHAHjxsjsjfdjkhfghfghfdghASfhhhh");
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/form/button")).click();
      










    }
}