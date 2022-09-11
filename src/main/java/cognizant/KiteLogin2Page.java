package cognizant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page {
	//Declaration
	@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement cntBtn;
	
	
	//Initialization
	public KiteLogin2Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public void enterPIN(String pinvalue) {
		PIN.sendKeys(pinvalue);
	}
	public void clickcntBtn() {
		cntBtn.click();
	}
}
