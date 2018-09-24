package mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Register {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver","d:\\Users\\madan\\Selenium\\geckodriver.exe");
	  WebDriver dr=new FirefoxDriver();
	  dr.navigate().to("http://automationpractice.com/index.php");
	  dr.findElement(By.linkText("Sign in")).click();
	  dr.findElement(By.id("email_create")).sendKeys("swa1@gmail.com");
	  JavascriptExecutor jse = (JavascriptExecutor)dr;
		jse.executeScript("window.scrollBy(0,500)", "");
		jse.executeScript(arg0, arg1)
	  dr.findElement(By.id("SubmitCreate")).click();
	  
	  
  
  
  }
}
