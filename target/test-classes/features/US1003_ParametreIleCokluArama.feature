
Feature: Us1003 Kullanici parametre olarak girilen degerleri aratir


  Scenario: TC03 Kullanici Parametreli method ile Nutella aratir

    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna "Nutella" Yazip aratir
    And arama sonuclarinin "Nutella" icerdigini test eder
    And sayfayi kapatir




    Scenario: TC04 Kullanici parametreli method ile Java aratir
      Given kullanici amazon anasayfaya gider
      Then amazon arama kutusuna "Java" Yazip aratir
      And arama sonuclarinin "Java" icerdigini test eder
      And sayfayi kapatir



  Scenario: TC04 Kullanici parametreli method ile Java aratir
    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna "Samsung" Yazip aratir
    And arama sonuclarinin "Samsung" icerdigini test eder
    And sayfayi kapatir