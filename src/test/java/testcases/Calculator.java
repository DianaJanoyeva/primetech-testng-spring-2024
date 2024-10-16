package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calculator {

    @Test
    public void calculatorTest(){
        System.out.println("hey");
    }

    @Test
    public void test2(){
        System.out.println("Hello");
    }

    @Test
    public void loginWithValidCredentials(){
        WebDriver driver = new ChromeDriver();
        driver.get("sauce demo url");
        WebElement username = driver.findElement(By.xpath("xpath"));
    }


}
