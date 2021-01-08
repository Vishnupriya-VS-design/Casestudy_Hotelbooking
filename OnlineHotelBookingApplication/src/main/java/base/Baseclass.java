package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Baseclass {
	
	public static Properties prop;
	public static WebDriver driver;
	
	ExtentTest extentTest;
	ExtentReports reports;
	ExtentHtmlReporter htmlReport;
	
	public Baseclass()
	{
		prop= new Properties();
		try
		{
			FileInputStream fin = new FileInputStream(System.getProperty("user.dir")+"//src//main//resources//config//config.properties");
			prop.load(fin);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void setupExtent() {
		reports = new ExtentReports();
		htmlReport = new ExtentHtmlReporter("C:\\Users\\di606341\\OneDrive - Sprint\\BootCamp_Selenium\\Demo Sites\\Reports\\extentReport.html");
		reports.attachReporter(htmlReport);
		htmlReport.setAppendExisting(true);
		
	}
	
	public static void initialize()
	{
		String browser = prop.getProperty("browser");
		if(browser.equalsIgnoreCase("Chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "C:\\OnlineHotelBookingapplication\\HotelBooking\\Driver\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\Eclipse\\eclipse-workspace\\eclipse-workspace\\SeleniumDemo\\automation\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
	}
	public static void Close()
	{
		driver.quit();
	}

}
