package ftm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class WakeUpBrowser {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        //driver.get("https://vk.com");

        //driver.findElement(By.id("index_email")).sendKeys("exstrim-girl@rambler.ru");
        //driver.findElement(By.id("index_pass")).sendKeys("p800/w600/100");
        //driver.findElement(By.id("index_login_button")).click();
        driver.get("http://google.com");
        List <WebElement> buttons = driver.findElements(By .tagName("input"));
        System.out.println(buttons);


    }
}
