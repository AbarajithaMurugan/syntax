import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImgName {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\eclipse\\configuration\\Syntax\\driver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	List<WebElement> w=driver.findElements(By.xpath("//img[@class='landscape-image']"));
	for (int i = 0; i<w.size(); i++) {
		WebElement r=w.get(i);
		System.out.println(r.getAttribute("alt"));
		
	}
	}
	

}
