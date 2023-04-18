Feature: US1002 Kullanici amazon Anasayfada birden fazla urun aratir

  @wip
  Scenario: TC02 Kullanici urunleri aratip test edebilmeli

    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna Nutella Yazip aratir
    And arama sonuclarinin Nutella icerdigini test eder
    And sayfayi kapatir


    Given kullanici amazon anasayfaya gider
    And 2 saniye bekler
    Then amazon arama kutusuna Java Yazip aratir
    And arama sonuclarinin Java icerdigini test eder
    Then sayfayi kapatir

    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna Samsung Yazip aratir
    And arama sonuclarinin Samsung icerdigini test eder
    Then sayfayi kapatir