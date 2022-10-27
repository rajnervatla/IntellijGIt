package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestApp {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.get("https://www.google.com");
        WebElement searchBox=driver.findElement(By.xpath("//*[@name='q']"));
        Thread.sleep(1000);
        searchBox.sendKeys("Hello..");
        driver.quit();
        driver.quit();
    }
}
