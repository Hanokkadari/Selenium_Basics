package Select_ClassPackage;

import java.awt.event.ActionEvent;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionsClass_java {

    public static void main(String[] args) throws InterruptedException {
       
    	//launch the browser
       WebDriver driver = new ChromeDriver();
       
          

        // MAXIMIZE THE WINDOW
        driver.manage().window().maximize();

        // IMPLICIT WAIT
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // NAVIGATE TO AN APPLICATION
        driver.get("https://www.flipkart.com/");

        Actions act = new Actions(driver);
        WebElement mouse = driver.findElement(By.xpath("//span[text()='Fashion']"));
        act.moveToElement(mouse).perform();

        driver.findElement(By.linkText("Men's Bottom Wear")).click();
        Thread.sleep(3000);

        WebElement dde1 = driver.findElement(By.className("Goojig"));
        Select s = new Select(dde1);
        s.selectByValue("299");
        Thread.sleep(3000);

        WebElement dde2 = driver.findElement(By.xpath("//div[@class='3XhM']/select[@class='Goojig']"));
        Select s1 = new Select(dde2);
        s1.selectByValue("1000");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[text()='Newest First']")).click();

        Thread.sleep(3000);

        WebElement price = driver.findElement(By.xpath("//div[@class='_30jeq3 _1_WHN1']/descendant::div[@class='_30jeq3 _1_WHN1']"));
        System.out.println(price.getText());
    }
}