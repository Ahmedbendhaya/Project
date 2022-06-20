package RechercheWithFilterPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RechercheWithFiltersPage {
 WebDriver driver;
int  i;
By filter = By.xpath("//div["+i+"][contains(@role,'presentation')]");
By Filter_HomePage = By.xpath("/html/body/div[2]/div/div/div[2]/div/nav/ul/li[1]/a");
By Filter_Type = By.xpath("//li[contains(@class,'rootverticalnav nav-1 category-item')]/span");
By Pc_portable = By.xpath("//span[contains(text(),'Pc Portable')]");
By SelectFilterASUS = By.xpath("//li[contains(@data-label,'ASUS')]/span");
By SelectFilterAPPLE = By.xpath("//li[contains(@data-label,'APPLE')]/span");
By SelectFilterACER = By.xpath("//li[contains(@data-label,'ASUS')]/span");
By SelectAffichage= By.id("limiter");
By SelectitemName= By.xpath("//div[contains(@class,'desctopNameProduct')]");
By Displayed_item= By.xpath("//table["+i+"]/tbody/tr[contains(@class,'item product product-item product-item-info')]");
By ItemsTable = By.xpath("//ol[contains(@class,'products list items product-items')]");
By itemsNumber = By.xpath("//span[contains(@class,'toolbar-number')]");

public void Filter (WebDriver rdriver) {
	driver=rdriver;
	PageFactory.initElements(driver, this);
}

public void ChooseFilterType () throws InterruptedException {
	driver.findElement(Filter_HomePage).click();
	Thread.sleep(1000);
	driver.findElement(Filter_Type).click();
	Thread.sleep(1000);
	driver.findElement(Pc_portable).click();
	Thread.sleep(1000);
}
public void SelectitemsUsingMarqueFilters() {
	i=2;
	driver.findElement(filter).click();
	driver.findElement(SelectFilterACER).click();
	driver.findElement(SelectFilterAPPLE).click();
	driver.findElement(SelectFilterASUS).click();
}
public void VerifyFilter() {
 driver.findElement(SelectAffichage).sendKeys("Tous");
int a = Integer.parseInt(driver.findElement(itemsNumber).getText());

 for (int i = 1; i<a; i++) {
	 String Item_description= driver.findElement(Displayed_item).getText();
	 if (Item_description.contains("ASUS")||Item_description.contains("APPLE")||Item_description.contains("ACER")) {
		 System.out.print("le filtre de marque est en marche");
	 }
	 else driver.quit();
 }
 
}
}
