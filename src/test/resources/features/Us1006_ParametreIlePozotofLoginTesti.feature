
Feature: US1006 Kullanici configuration dosyasindaki bilgilerle login olabilmeli
  
  Scenario: TC09 Gecerli Kullanici adi ve sifre ile Pozitif login testi
    
    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna "qdGecerliUserName" yazar
    And password kutusuna "qdGecerliPassword" yazar
    Then login butonuna click yapar
    And basarili giris yapildigini test eder
    And 3 saniye bekler
    Then sayfayi kapatir
