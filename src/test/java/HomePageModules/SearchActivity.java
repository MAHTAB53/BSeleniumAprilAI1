package HomePageModules;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelperPages.CommonTestData;
import HelperPages.TestDataHelper;
import PageObjects.HomePage;
import TestComponants.Base;

public class SearchActivity  extends Base{
	@Test
	public void search() throws Exception{
		testDataHelper = new TestDataHelper();
		CommonTestData commontestdata = ctd.get();
		driver =  commontestdata.getDriver();
		HomePage homepage = new HomePage(driver);

		launchApplication();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "GreenKart - veg and fruits kart";
//		String ExpectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		homepage.SearchBox_value(testDataHelper.getValue("search_value"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		homepage.SearchIcon_click();
//		
//		homepage.plus_click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		homepage.minus_click();
		
	}
}
