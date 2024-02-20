package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HelloWorld {
    static WebDriver driver;
    public static void main (String[] args) {
        try {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://testautomationu.applitools.com/webdriverio-7-tutorial/chapter4.1.html");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            driver.quit();//cerrara todas las ventanas
            //driver.close();solo cierra la ventana y no el puerto
        }
    }
}
