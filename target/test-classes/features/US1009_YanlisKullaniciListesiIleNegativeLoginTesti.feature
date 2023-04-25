
Feature: US1009 yanlis kullanici adi ve password listesi ile negatif login testi

  Scenario Outline:TC14 Yanlis kullanici listesi ile giris yapilamamali

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna manuel olarak "<yanlisUserName>" yazar
    And password kutusuna manuel olarak "<yanlisPassword>" yazar
    And 2 saniye bekler
    And login butonuna click yapar
    And basarili giris yapilamadigini test eder
    Then sayfayi kapatir




    Examples:
      | yanlisUserName | yanlisPassword |
      | ilker          | ilker@a.com    |
      | mehmet         | mehmet@b.com   |
      | yasar          | yasar@c.com    |
      | adem           | adem@d.com     |
      | ozgur          | ozgur@e.com    |