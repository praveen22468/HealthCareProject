package crm.testcases;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\SW-Java-Selenium-TestNG/chromedriver_win32/chromedriver.exe");

ChromeDriver driver=new ChromeDriver();
		//  driver.get("http://google.com");

		  int count=0;
		  Properties p=System.getProperties();  
		  Set set=p.entrySet();  
		    
		  Iterator itr=set.iterator();  
		  while(itr.hasNext()){  
		  Map.Entry entry=(Map.Entry)itr.next();  
		  System.out.println(entry.getKey()+" = "+entry.getValue());
		  System.out.println(count+"---------------------------------------------------------");
		  count++;
		  }
		  
	}

}
