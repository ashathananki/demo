package project.MyProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

		public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    WebElement email = driver.findElement(By.id("email"));
	    email.sendKeys("-------");
	    WebElement password = driver.findElement(By.id("pass"));
	    password.sendKeys("-----");
	    WebElement login = driver.findElement(By.name("login"));
	    login.click();
	}
	}



