import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  

public class selenium {  
    public static void main(String[] args) throws InterruptedException {      
    // declaration and instantiation of objects/variables  
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium Test Case\\src\\chromedriver.exe");  
     WebDriver driver=new ChromeDriver();  
     //driver.manage().timeouts().pageLoadTimeout(10, null);
     //driver.navigate().to("http://172.168.1.150:8080/login");
     driver.navigate().to("http://35.154.221.78:8000/accounts/login/");
     Thread.sleep(3000);
     driver.findElement(By.id("id_username")).sendKeys("user1");
     driver.findElement(By.id("id_password")).sendKeys("user1");
     driver.findElement(By.xpath("/html/body/div/div/div[2]/form/button")).click();
//     driver.findElement(By.xpath("/html/body/div/div/div/div/span/a")).click();
//     driver.findElement(By.id("firstName")).sendKeys("Kiran123");
//     driver.findElement(By.id("lastName")).sendKeys("Kumar123");
//     driver.findElement(By.id("email")).sendKeys("Kiran123@tcs.com");
//     driver.findElement(By.id("password")).sendKeys("2002123");
//     //Register Button
//     Thread.sleep(3000);
//     driver.findElement(By.xpath("/html/body/div/div/div/form/div[5]/button")).click();
//     //Login Here Button
//     driver.findElement(By.xpath("/html/body/div/div/div/form/div[5]/span/a")).click();
//     //Login Details
//     driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Kiran123@tcs.com");
//     driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("2002123");
//     Thread.sleep(3000);
//     driver.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();
//     Thread.sleep(3000);
//     driver.findElement(By.xpath("/html/body/div/a")).click();
//     //Add Employee
//     Thread.sleep(3000);
//     driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Sakshi23");
//     driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Seth23");
//     driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Sakshi123@tcs.com");
//     Thread.sleep(3000);
//     driver.findElement(By.xpath("html/body/div/form/button")).click();
//     driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li/a")).click();  
    }  
}  
