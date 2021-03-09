import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksName {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\eclipse\\configuration\\Syntax\\driver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
List<WebElement>w=driver.findElements(By.tagName("Script"));
System.out.println(w.size());
for (WebElement web : w) {
	System.out.println(web.getAttribute("src"));
	
}
}
}