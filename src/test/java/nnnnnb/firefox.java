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

public class firefox {
    public  static void main(String[] args){
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
        driver.navigate().to("http://127.0.0.1:8000/ar/settings");
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div/div/div/form/div/div/div[1]/div/input")).clear();
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div/div/div/form/div/div/div[1]/div/input")).sendKeys("bhi");

        Select drop= new Select(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div/div/div/form/div/div/div[2]/div/select")));
        drop.selectByIndex(3);


        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div/div/div/form/div/div/div[2]/div/select")).sendKeys("fffaHHSAHAHjxsjsjfdjkhfghfghfdghASfhhhh");
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div/div/div/form/div/div/div[4]/div/input")).clear();
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div/div/div/form/div/div/div[4]/div/input")).sendKeys("01555784139");
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div/div/div/form/div/div/div[5]/div/input")).clear();
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div/div/div/form/div/div/div[5]/div/input")).sendKeys("engmostafaf@jewjeddh2.com");
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div/div/div/form/div/div/div[6]/div/input")).clear();
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div/div/div/form/div/div/div[6]/div/input")).sendKeys("القاهره");
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div/div/div/form/div/div/div[7]/div/input")).clear();
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div/div/div/form/div/div/div[7]/div/input")).sendKeys("01-12-2021");
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div/div/div/form/div/div/div[8]/div/input")).clear();;
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div/div/div/form/div/div/div[8]/div/input")).sendKeys("01-03-2022");
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/div/div/div/form/button")).click();

    }

}
