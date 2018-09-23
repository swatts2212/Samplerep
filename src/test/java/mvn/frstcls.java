package mvn;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Verify;


public class frstcls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 System.out.println("hi");
 System.setProperty("webdriver.gecko.driver","C:\\Users\\madan\\Selenium\\geckodriver.exe");
WebDriver dr=new FirefoxDriver();
dr.navigate().to("http://automationpractice.com/index.php");
String str1=dr.getTitle();
System.out.println(str1);
//assert.assertequals("title is","My Store",dr.getTitle());
//assertTrue(str1.equals("My Store"));

WebDriverWait wait = new WebDriverWait(dr, 10);
WebElement wl=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//INPUT[@id='search_query_top']")));
wl.sendKeys("dress");
dr.findElement(By.name("submit_search")).click();
WebElement sel=dr.findElement(By.id("selectProductSort"));
Select s=new Select(sel);
s.selectByIndex(2);
String txt=dr.findElement(By.xpath("//ul[@class='product_list grid row']/li[1]/div/div[2]/span")).getText();
	System.out.println(txt);
	//System.out.println(dr.manage().window().getPosition());
	JavascriptExecutor jse = (JavascriptExecutor)dr;
	jse.executeScript("window.scrollBy(0,1000)", "");
	if(txt.equalsIgnoreCase("In stock"))
	{
	
		Actions a=new Actions(dr);
		
		WebElement wl2=dr.findElement(By.xpath("//ul[@class='product_list grid row']/li[4]"));
		a.moveToElement(wl2).build().perform();
		//dr.findElement(By.xpath("//ul[@class='product_list grid row']/li[7]//a[@class='button ajax_add_to_cart_button btn btn-default']")).click();
	}
	else
	{
		System.out.println("not in stock");
	}
	}

}
