Feature: US1015 Amazonda arama sonuc listesinde istedigimiz urunun varligini test etme
@p1
  Scenario: TC20 arama sonuclarinda spesifik elementin varligini test eder
    Given kullanici "amazonUrl" anasayfaya gider
    Then amazon arama kutusuna "Nutella" Yazip aratir
    And cikan urunler icinde "Nutella & GO"oldugunu test eder