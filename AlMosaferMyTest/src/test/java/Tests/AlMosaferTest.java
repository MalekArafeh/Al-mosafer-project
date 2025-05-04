package Tests;

import java.awt.im.InputContext;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlMosaferTest extends TestData {

	WebDriver driver = new ChromeDriver();
	Random rand = new Random();

	@BeforeTest
	public void mySetup() {

		driver.get("https://www.almosafer.com/en?ncr=1");

		driver.manage().window().maximize();
	}
	
	
	@Test(priority = 1)
	public void LangTest() {
		
		String WebLang=driver.findElement(By.tagName("html")).getDomAttribute("lang");
		
		Assert.assertEquals(WebLang,ExptectedDefaultLanguage);
	}
	
	@Test(priority = 2)
	public void DefaultCurrancy() {
		String currency=driver.findElement(By.cssSelector(".sc-hUfwpO.kAhsZG")).getText();
		Assert.assertEquals(currency, ExpectedDefaultCurrency);

		
	}
	
	@Test(priority = 3)
	public void CheckPhoneNumber() {
		String number=driver.findElement(By.cssSelector("a>strong")).getText();
//		System.out.print(number);
		
		Assert.assertEquals(number,MobileNumber);
	}
	
	
	@Test(priority = 4)
	public void qtafLogo()
	{
		WebElement footer=driver.findElement(By.tagName("footer"));
		WebElement qitaf=footer.findElement(By.cssSelector(".sc-ekulBa.iOOTo>svg"));
		
		boolean isfound=qitaf.isDisplayed();
		Assert.assertEquals(ActualLogoReturn, isfound);
	}
	
	
	
	@Test(priority = 5)
	public void DefaultTabSelected() {
		WebElement Tabs=driver.findElement(By.cssSelector(".sc-gHboQg.dSBdPR.nav.nav-tabs"));
		WebElement HotelsTab=Tabs.findElement(By.id("uncontrolled-tab-example-tab-hotels"));
		String isSelected=HotelsTab.getDomAttribute("aria-selected");
		//Convert the value of selcted from string to boolean
		boolean isselected = Boolean.parseBoolean(isSelected);
		
		Assert.assertEquals(ActualSelectedTab, isselected);

	}
	
	
	
	@Test(priority=6)
	public void FlightDeparature() {
		
		WebElement DeparatureDate=driver.findElement(By.xpath("//div[@data-testid='FlightSearchBox__FromDateButton']"));
		
		List<WebElement> Dates=DeparatureDate.findElements(By.tagName("span"));
		
		String Month=Dates.get(0).getText();
		String Day=Dates.get(1).getText();

		String ActualDepratureDate=Day+" "+Month;
		
		Assert.assertEquals(ActualDepratureDate, ExpectedDeparatureDate);
		
		
	}
	
	
	
	@Test(priority = 7)
	public void FlightReturn() {
		WebElement DeparatureDate=driver.findElement(By.xpath("//div[@data-testid='FlightSearchBox__ToDateButton']"));
		List<WebElement> Dates=DeparatureDate.findElements(By.tagName("span"));
		
		String Month=Dates.get(0).getText();
		String Day=Dates.get(1).getText();
		
		
		String ActualReturnDate=Day+" "+Month;
		Assert.assertEquals(ActualReturnDate, ExpectedReturnDate);

		

		
	}
	
	
	
	@Test(priority = 8)
	public void RandomChangeLanguage() throws InterruptedException {
		String ExpectedLanguage="";
		int RandomNumber=rand.nextInt(5);
		int i=0;
		while (i<RandomNumber) {		
			WebElement LanguageButton=driver.findElement(By.xpath("//a[@data-testid='Header__LanguageSwitch']"));
			LanguageButton.click();
			Thread.sleep(2000);
			i++;
		}
		
		if(RandomNumber%2==0)
			ExpectedLanguage="en";
		else
			ExpectedLanguage="ar";
		
		WebElement HtmlFile=driver.findElement(By.tagName("html"));
		String CurrentLanguage=HtmlFile.getDomAttribute("lang");
//		System.out.println(CurrentLanguage);
		Assert.assertEquals(CurrentLanguage,ExpectedLanguage);
		
		
			
			
	}
	
	
	
	@Test(priority = 9)
	public void HotelSearch() throws InterruptedException
	{
		WebElement NavTabs=driver.findElement(By.cssSelector(".sc-gHboQg.dSBdPR.nav.nav-tabs"));
		WebElement StaysTab=NavTabs.findElement(By.id("uncontrolled-tab-example-tab-hotels"));
		StaysTab.click();
		
		
		String WebLang=driver.findElement(By.tagName("html")).getDomAttribute("lang");
		
		Thread.sleep(2000);
		System.out.println(WebLang);
		
		WebElement SearchIcon=driver.findElement(By.xpath("//input[@data-testid='AutoCompleteInput']"));

		if(WebLang.equals("en")) {
			int EnglishTownSize=rand.nextInt(EnglishTowns.length);
			System.out.println(EnglishTowns[EnglishTownSize]);

			SearchIcon.sendKeys(EnglishTowns[EnglishTownSize]);
		}
		else {
			int ArabicTownSize=rand.nextInt(ArabicTowns.length);
			SearchIcon.sendKeys(ArabicTowns[ArabicTownSize]);

		}
		
//		SearchIcon.sendKeys(Keys.chord(Keys.ENTER));

			
			WebElement RoomsSelect=driver.findElement(By.cssSelector(".sc-tln3e3-1.gvrkTi"));
			
			List<WebElement> RoomsOptions=RoomsSelect.findElements(By.tagName("option"));
			
			int RandomOption=rand.nextInt(RoomsOptions.size()-1);
			RoomsSelect.click();
			Select mySelect=new Select(RoomsSelect);
			mySelect.selectByIndex(RandomOption);
			
			WebElement SearchButton=driver.findElement(By.xpath("//button[@data-testid='HotelSearchBox__SearchButton']"));
			SearchButton.click();
		
		
		
	}
	
}