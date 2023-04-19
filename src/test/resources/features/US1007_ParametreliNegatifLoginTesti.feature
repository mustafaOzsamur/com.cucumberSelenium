@wip
Feature: US1007 Kullanici yanlis bilgilerle giris yapamaz
  Scenario: TC10 Gecerli Kullanici adi ve Gecersiz sifre ile negatif login testi

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna "qdGecerliUserName" yazar
    And password kutusuna "qdGecersizPassword" yazar
    Then login butonuna click yapar
    And basarili giris yapilamadigini test eder
    And 3 saniye bekler
    Then sayfayi kapatir

  Scenario: TC11 Gecersiz Kullanici adi ve Gecerli sifre ile negatif login testi

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna "qdGecersizUserName" yazar
    And password kutusuna "qdGecerliPassword" yazar
    Then login butonuna click yapar
    And basarili giris yapilamadigini test eder
    And 3 saniye bekler
    Then sayfayi kapatir

  Scenario: TC12 Gecersiz Kullanici adi ve Gecersiz sifre ile negatif login testi

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna "qdGecersizUserName" yazar
    And password kutusuna "qdGecersizPassword" yazar
    Then login butonuna click yapar
    And basarili giris yapilamadigini test eder
    And 3 saniye bekler
    Then sayfayi kapatir