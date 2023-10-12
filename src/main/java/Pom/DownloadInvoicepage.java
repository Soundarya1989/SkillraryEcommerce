package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadInvoicepage {
//declaretion
	//address of invoice Webelement
	@FindBy()
	private WebElement InvoiceBtn;
	//initalization
	public DownloadInvoicepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utlization
	public void InvoiceButton()
	{
		InvoiceBtn.click();
	}
	
	
}
