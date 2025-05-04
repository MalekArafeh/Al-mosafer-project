package Tests;


import java.sql.Driver;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestData {
	
	//for Test 1
	String ExptectedDefaultLanguage="en";
	//for Test 2
	String ExpectedDefaultCurrency="SAR";
	//for Test 3
	String MobileNumber="+966554400000";
	//for Test 4
	boolean ActualLogoReturn=true;
	//for Test 5
	boolean ActualSelectedTab=false;
	
	//for Test 6 and 7 to detect The current date
	LocalDate today=LocalDate.now();//today date
	LocalDate tomorrow=today.plusDays(1);//tomorrow date
	DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd MMMM");// formate date as 02 May
	String ExpectedDeparatureDate=tomorrow.format(formatter);// apply the formate on date
	
	
	
	LocalDate AfterTomorrow=today.plusDays(2);// the date after tomorrow
	String ExpectedReturnDate=AfterTomorrow.format(formatter);
	
	Random rand=new Random();
	
	
	String[] EnglishTowns= {"Dubai","Jeddah","Riyadh"};
	String[] ArabicTowns= {"جدة","دبي"};
	
	
	
	
}
