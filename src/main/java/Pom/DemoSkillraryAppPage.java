package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryAppPage {
	//Declaration
	//address of course webelement
	@FindBy(id="course")
	private WebElement Coursebtn;
	//address of feedback webelement
	@FindBy(xpath="//a[text()='FEEDBACK']")
	
	private WebElement feedBackbtn;
    //address of select catagrey drop down
	@FindBy(name="addresstype")
	private WebElement selectDb;
	//initilization
	public DemoSkillraryAppPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	//utilization
	public WebElement getCOursebtn()
	{
		return Coursebtn;
	}
	public WebElement getSelectDd()
	{
		return selectDb;
		
	}
	public void feedBackButton()
	{
		feedBackbtn.click();
	}
}
