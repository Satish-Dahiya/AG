package pageLocators;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class edge {

	public static void main(String[] args) {

		/*WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();*/
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
	}

}
