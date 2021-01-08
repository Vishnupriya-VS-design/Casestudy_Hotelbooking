package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;

public class LoginPage extends Baseclass {
	

	@FindBy(xpath="//h1[@align='center']") WebElement header;
	@FindBy(name="userName") WebElement username;
	@FindBy(name="userPwd") WebElement password;
	@FindBy(xpath="//input[@type='button']") WebElement loginBtn;
	@FindBy(id="userErrMsg") WebElement userErrMsg;
	@FindBy(id="pwdErrMsg") WebElement pwdErrMsg;
		
//------------------Actions-------------------------------------------------
	
	public String getApplicationHeader()
	{
		return header.getText();
	}
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
//	public void Login(String uname, String pwd)
//	{
//		username.sendKeys(uname);
//		password.sendKeys(pwd);
//		loginBtn.click();
//	}
	public void Username(String uname)
	{
		username.sendKeys(uname);
	}
	public void Password(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void Login()
	{
		loginBtn.click();
	}
	
	public String getUserErrMsg()
	{
		return userErrMsg.getText();
	}
	
	public String getPwdErrMsg()
	{
		return pwdErrMsg.getText();
	}

}
