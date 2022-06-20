package RechercheWithFiltersStepDef;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import RechercheWithFilterPage.RechercheWithFiltersPage;
import RechercherPage.RechercherPage;
import RechercherStepDef.RechercherStepDef;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static RechercherPage.RechercherPage.driver;

public class RechercheWithFiltersStepDef  {
	RechercheWithFiltersPage Filters = new RechercheWithFiltersPage();
	@Given("Je suis dans MyTek")
	public void je_suis_dans_MyTek() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);			
	    System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
	    Filters.Filter(driver);
		driver = new ChromeDriver();
		driver.navigate().to("https://www.mytek.tn");
		System.out.print(driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@When("Je clique sur le type de l article PC Portable")
	public void je_clique_sur_le_type_de_l_article_PC_Portable() throws InterruptedException {
		Filters.ChooseFilterType();
	}

	@When("je choisis le filtre")
	public void je_choisis_le_filtre() {
		Filters.SelectitemsUsingMarqueFilters();
	}

	@Then("seulement les articles en relation avec ce filtre doivent s afficher")
	public void seulement_les_articles_en_relation_avec_ce_filtre_doivent_s_afficher() {
		Filters.VerifyFilter();
	}
}
