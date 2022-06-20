$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Filter.feature");
formatter.feature({
  "name": "Rechercher des articles avec des filtres",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Rechercher en utilisant un filtre",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Filters"
    }
  ]
});
formatter.step({
  "name": "Je suis dans MyTek",
  "keyword": "Given "
});
formatter.match({
  "location": "RechercheWithFiltersStepDef.RechercheWithFiltersStepDef.je_suis_dans_MyTek()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Je clique sur le type de l article PC Portable",
  "keyword": "When "
});
formatter.match({
  "location": "RechercheWithFiltersStepDef.RechercheWithFiltersStepDef.je_clique_sur_le_type_de_l_article_PC_Portable()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.findElement(org.openqa.selenium.By)\" because \"this.driver\" is null\r\n\tat RechercheWithFilterPage.RechercheWithFiltersPage.ChooseFilterType(RechercheWithFiltersPage.java:28)\r\n\tat RechercheWithFiltersStepDef.RechercheWithFiltersStepDef.je_clique_sur_le_type_de_l_article_PC_Portable(RechercheWithFiltersStepDef.java:34)\r\n\tat ✽.Je clique sur le type de l article PC Portable(file:///C:/Users/abendhaya/Desktop/Mytek_PFF/src/test/resources/Features/Filter.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "je choisis le filtre",
  "keyword": "And "
});
formatter.match({
  "location": "RechercheWithFiltersStepDef.RechercheWithFiltersStepDef.je_choisis_le_filtre()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "seulement les articles en relation avec ce filtre doivent s afficher",
  "keyword": "Then "
});
formatter.match({
  "location": "RechercheWithFiltersStepDef.RechercheWithFiltersStepDef.seulement_les_articles_en_relation_avec_ce_filtre_doivent_s_afficher()"
});
formatter.result({
  "status": "skipped"
});
});