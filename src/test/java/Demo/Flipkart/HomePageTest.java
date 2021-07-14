package Demo.Flipkart;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.HomeClass;

public class HomePageTest extends Base {
	@BeforeTest
	public void openBrowser() throws IOException {
		driver = initialize();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void validate() {

		WebDriverWait w = new WebDriverWait(driver, 15);
		HomeClass hc = new HomeClass(driver);
		if (hc.dynamicPopupList().size() > 0) {
			hc.dynamicPopup().click();
		}
		hc.searchBar().sendKeys(prop.getProperty("product"));
		hc.submit().click();
		hc.filter().click();

		driver.navigate().refresh();
		hc.selectProduct().click();

		Set<String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
		}
		//
		String price = hc.price().getText().trim();
		System.out.println(price);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", hc.addto());

		hc.addto().click();
		String totalamount = hc.totalAmount().getText().trim();
		System.out.println(totalamount);
		
		Assert.assertEquals(price, totalamount);

	}

	 @AfterTest
	 public void quiteBrowser() {
	 driver.quit();
	 }
}
