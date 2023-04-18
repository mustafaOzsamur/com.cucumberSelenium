
@wip
Feature: US1005 Kullanici Configuration.properties'de yazilan datalari parametre olarak kullanir
  # 3 Scenario olusturup, amazon,wisequarter ve walmart anasayfalarina gidin
  # ve o anasayfalara gittigimizi test edin
  # parametre olarak kullandigimiz kelimeler direkt testte kullanilabilecek datalar olabilecegi gibi
  #configuration.properties'de bulunan key'ler de olabilir
  #Bu durumda stepdefinition'da yolladigimiz key ile
  #ConfigReader'daki getProperty() kullanilip
  #configuration.properties dosyasindaki value testte kullanilabilir.
  Scenario: TC06 Kullanici amazon sitesine gidisi test eder

    Given kullanici "amazonUrl" anasayfaya gider
    Then url de "amazon" oldugunu test eder
    And sayfayi kapatir

  Scenario: TC07 Kullanici amazon sitesine gidisi test eder

    Given kullanici "wqUrl" anasayfaya gider
    Then url de "wisequarter" oldugunu test eder
    And sayfayi kapatir

  Scenario: TC08 Kullanici amazon sitesine gidisi test eder

    Given kullanici "walmartUrl" anasayfaya gider
    Then url de "walmart" oldugunu test eder
    And sayfayi kapatir