package locatorCSS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorCss {

	public static void main(String[] args)  {
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	 //using css selectors like tag and id --#id ,tag and class .class, tag and attribute input [attribute=value], using tag class and attribute
	 
	 //using css selector tag and id 
	 //driver.findElement(By.cssSelector("input#email")).sendKeys("sheereesh");
	 //driver.findElement(By.cssSelector("#email")).sendKeys("sheereesh");
	 //using css tag and class
	 
	// driver.findElement(By.cssSelector("input.inputtext")).sendKeys("srinuvas");
	 //driver.findElement(By.cssSelector(".inputtext")).sendKeys("srinuvas");
	 // tag and attribute
	 //driver.findElement(By.cssSelector("input[name=email]")).sendKeys("shakeer");
	 //only attribute
	// driver.findElement(By.cssSelector("[autofocus=\"1\"]")).sendKeys("sherresh");
	 //another attribute
	// driver.findElement(By.cssSelector("[id=\"email\"]")).sendKeys("sheereesh");
	 //using input class attribute
	// driver.findElement(By.cssSelector("input.inputtext[id=\"email\"]")).sendKeys("sheereesh");
	 
	 //using another input class attribute
	 driver.findElement(By.cssSelector("input.inputtext[data-testid=\"royal_email\"]")).sendKeys("ramesh");

	}

}
