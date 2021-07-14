package Demo.Flipkart;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public Properties prop;

	public WebDriver initialize() throws IOException {
		String userdir = System.getProperty("user.dir");

		FileReader reader = new FileReader(userdir + "\\Data\\data.properties");

		prop = new Properties();
		prop.load(reader);

		System.setProperty("webdriver.chrome.driver", userdir + "\\Data\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;

	}
}
