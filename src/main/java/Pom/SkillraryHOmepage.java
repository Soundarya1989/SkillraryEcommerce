package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHOmepage {
	//Declaration
	//address of gears
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	//adress of skillrary demo
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'][2])")
	private WebElement Skillrarydemoapp;
	
	//address of search text field
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchTf;
	
	//address of search icon
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchicon;
	
	//address of cookie cross icon 
	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement coockies;
	//initalization
	public SkillraryHOmepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	
	

}
