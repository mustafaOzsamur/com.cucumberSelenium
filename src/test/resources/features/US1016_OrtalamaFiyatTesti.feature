Feature: US1016 aranan urunun ortalama fiyatini test etme
  @p1
  Scenario: TC21 aranan urunun ortalama fiyati test edilebilmeli
    Given kullanici "amazonUrl" anasayfaya gider
    Then amazon arama kutusuna "Nutella" Yazip aratir
    And cikan urunlerden "Nutella" kelimesi icerenlerin fiyat ortalamasinin 20 Euro altinda oldugunu test eder