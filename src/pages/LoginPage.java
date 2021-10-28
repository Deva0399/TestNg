package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import test.Baseclass;

public class LoginPage {
	
	WebDriver driver = Baseclass.driver;
	
	ExtentTest test = Baseclass.test;
	
	//========================Web Elements====================
	@FindBy(linkText="Log in")
	WebElement LoginLink;
	
	@FindBy(name="user_login")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(className="rememberMe")
	WebElement Rememeber;
	
	@FindBy(name="btn_login")
	WebElement LoginButton;
	
	@FindBy(id="msg_box")
	WebElement Error;
	
	//=================Methods==================
	public LoginPage(){
		   PageFactory.initElements(driver, this);
	  }
	
	
	public void Login(String Uname, String Pwd) {
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(LoginLink));
		LoginLink.click();
		test.log(LogStatus.PASS,"Click On Login Link","Sucssesfully clicked the link");
		
		UserName.sendKeys(Uname);
		test.log(LogStatus.PASS, "Enter UserName" + Uname, "Sucssesfully entered the user name");
		
		Password.sendKeys(Pwd);
		test.log(LogStatus.PASS,"Enter the password" + Pwd, "Sucssfully entered the password");
		
	    Rememeber.click();
	    LoginButton.click();
	    test.log(LogStatus.PASS, "Click Login Button" , "Sucessfully clicked the report");
		
	}
	
	public void ErrorCheck() {
		
		String Actualmsg = Error.getText();
		String Expectedmsg = "The email or password you have entered is invalid.";
		//Assert.assertEquals(Actualmsg,Expectedmsg);
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Actualmsg,Expectedmsg);
		soft.assertAll();
	}
	

}
