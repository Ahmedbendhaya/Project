package RechercherStepDef;

import org.openqa.selenium.WebDriver;

import RechercherPage.RechercherPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RechercherStepDef {
	  WebDriver driver; 
	RechercherPage Rechercher = new RechercherPage();
	
	@Given("Je suis sur la page d accueil de MyTek")
	public void je_suis_sur_la_page_d_accueil_de_MyTek() {
		Rechercher.Rechercher(driver);
		Rechercher.OpenPage();
	}

	@When("Je clique sur la barre de recherche")
	public void je_clique_sur_la_barre_de_recherche() {
		Rechercher.Boxsearch();
	}

	@When("^je tape (.*)$")
	public void je_tape_son_parametre(String parametre) throws InterruptedException {
	Rechercher.AddSearchParameter(parametre);
	}

	@When("je clique sur la suggestion")
	public void je_clique_sur_la_suggestion() throws InterruptedException {
		Rechercher.SelectElement();
	}

	@Then("l article doit etre affiche")
	public void l_article_doit_etre_affich() {
		Rechercher.VerifyTheItemSelected("https://www.mytek.tn/pc-portable-asus-chromebook-c204-n4020-4go-32-go-emmc-gris.html");
	}

}



