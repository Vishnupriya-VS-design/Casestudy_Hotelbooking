package pages;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.ExcelRead;
import base.Baseclass;

public class Bookingdetailspage extends Baseclass {
	

	
	@FindBy(xpath="//th[contains(text(),'Personal')]") WebElement personalDetails;
	@FindBy(id="txtFirstName") WebElement FirstName;
	@FindBy(id="txtLastName") WebElement LastName;
	@FindBy(id="txtEmail") WebElement Email;
	@FindBy(id="txtPhone") WebElement Phone;
	@FindBy(xpath="//textarea[@rows='5']") WebElement Address;
	@FindBy(xpath="//select[@name='city']") WebElement City;
	@FindBy(xpath="//select[@name='state']") WebElement State;
	@FindBy(xpath="//select[@name='persons']") WebElement Persons;
	@FindBy(id="rooms") WebElement rooms;
	

	
	@FindBy(xpath="//th[contains(text(),'Payment')]") WebElement paymentsection;
	
	@FindBy(id="txtCardholderName") WebElement CardholderName;
	@FindBy(id="txtDebit") WebElement Debitcard;
	@FindBy(id="txtCvv") WebElement Cvv;
	@FindBy(id="txtMonth") WebElement expMonth;
	@FindBy(id="txtYear") WebElement expYear;
	
	
	@FindBy(id="btnPayment") WebElement btnPayment;
	@FindBy(xpath="//h1[@align='center']") WebElement successmsg;
	
//------------------------Actions--------------------------------------------------
	
	ExcelRead ExcelRead = new ExcelRead();
//	public String fname;
	
	public Bookingdetailspage()
	{
		PageFactory.initElements(driver, this);
	}
	
//	public void PersonalDetails() throws IOException
//	{
//		
//		//btnPayment.click();
//		fname= readdata.readData("FirstName");
//		txtFirstName.sendKeys(fname);
//	}
	
	public void ConfirmBtn()
	{
		btnPayment.click();
	}
	
	public void Firstname() throws IOException
	{
		FirstName.sendKeys(ExcelRead.Datafromexcel("FirstName"));
	}
	
	public void Lastname() throws IOException
	{
		LastName.sendKeys(ExcelRead.Datafromexcel("LastName"));
	}
	
	public void Email() throws IOException
	{
		Email.sendKeys(ExcelRead.Datafromexcel("Email"));
	}
	public void Mobile_invalid() throws IOException
	{
		Phone.sendKeys("9");
		
	}
	public void Phone_valid() throws IOException, InterruptedException
	{
		Phone.clear();
		Thread.sleep(1000);
		Phone.sendKeys("8923456678");
	}
	public void Address() throws IOException
	{
		Address.sendKeys(ExcelRead.Datafromexcel("Address"));
	}
	public void City() throws IOException
	{
		Select drpcity=new Select(City);
		drpcity.selectByValue("Chennai");
	}
	public void State() throws IOException
	{
		Select drpstate=new Select(State);
		drpstate.selectByValue("Tamilnadu");
	}
	public void Persons() throws IOException
	{
		Select drppersons=new Select(Persons);
		drppersons.selectByIndex(2);
	}
	public void CardHolderName() throws IOException
	{
		CardholderName.sendKeys(ExcelRead.Datafromexcel("CardHolderName"));
	}
	public void Debit() throws IOException
	{
		Debitcard.sendKeys("5555555555554440");
	}
	public void CVV() throws IOException
	{
		Cvv.sendKeys("123");
	}
	public void ExpirationMonth() throws IOException
	{
		expMonth.sendKeys(ExcelRead.Datafromexcel("ExpirationMonth"));
	}
	public void ExpirationYear() throws IOException
	{
		expYear.sendKeys("2027");
	}
	public void Alert()
	{
		Alert alert2 =driver.switchTo().alert();
	    System.out.println(alert2.getText());
	    alert2.accept();
	}
	public String MsgSuccess()
	{
		return successmsg.getText();
	}
	
	

	

}
