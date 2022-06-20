 @findbyparameter
Feature: RechercherDesArticles

 
  Scenario Outline: Rechercher un article en tapant un param�tre
    Given Je suis sur la page d accueil de MyTek
    When Je clique sur la barre de recherche
    And je tape <parametre>
    And je clique sur la suggestion
    Then l article doit etre affiche

    Examples: 
      | parametre                                                                                                                                                                                                                                     |
      | ASUS CHROMEBOOK                                                                                                                                                                                                                               |
      | C204MA-GJ0203                                                                                                                                                                                                                                 |
      | PC PORTABLE ASUS GRIS FONC�                                                                                                                                                                                                                   |
      | 545,000 TND                                                                                                                                                                                                                                   |
      | ecran 11.6 HD - Processeur: Intel Celeron N4020 (1,10 GHz up to 2.80 GHz, 4 Mo de m�moire cache, Dual-Core) - Syst�me d exploitation: Chrome OS - M�moire RAM: 4 Go LPDDR4 - Disque Dur: 32 Go eMMC - Carte Graphique: Intel UHD 600 Graphics |


  @Filters
  Scenario: Rechercher en utilisant un filtre
    Given Je suis dans MyTek
    When Je clique sur le type de l article PC Portable
    And je choisis le filtre
    Then seulement les articles en relation avec ce filtre doivent s afficher
