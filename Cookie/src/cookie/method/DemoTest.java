package cookie.method;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest
{
    
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		 
		 
		 //no of cookies
		 Set<Cookie> se=driver.manage().getCookies();
		 int count=se.size();
		 System.out.println("total no of cookies:"+count);
		 
		 //check method
		 
		 for(Cookie cookie:se)
		 {
			 System.out.println("name"+cookie.getName());
			 System.out.println("path"+cookie.getPath());

			 System.out.println("Domain"+cookie.getDomain());
			 System.out.println("value"+cookie.getValue());

			 System.out.println("class"+cookie.getClass());

			 System.out.println("Expiry"+cookie.getExpiry());

			 System.out.println("http"+cookie.isHttpOnly());
			 System.out.println("secure"+cookie.isSecure());
			 
			   driver.manage().deleteCookieNamed("T");;
			   
			   Cookie s=new Cookie("username", "A");
			   driver.manage().addCookie(s);
			   
			   


			 
		 }
		 
		
		
		
	}
	
	
	
	
}
