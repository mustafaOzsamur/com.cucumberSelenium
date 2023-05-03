Feature: US1022 gonser.com sitesinde login ve urun sepeti testi
  @wip
  Scenario: TC27 Kullanici ilgili siteye girip gecerli kullanici maili ve password ile giris yapabilmeli
          ve urun sepetine urun ekleyip cikarabilmeli
    Given kullanici "gonserUrl" anasayfaya gider
    And kullanici login buttonuna click yapar
    And kullanici mail kutusuna gecerili "email" yazar
    And kullanici password kutusuna gecerli "password" yazar
    Then login buttonuna tiklar
    And urunler bolumunde "stühle" aratir
    And ilk buldugu urunu urun sepetine ekler
    And urun sepetini tiklar
    And urunun eklendigini dogrular
    And urun fiyatini dogrular
    And urunu sepetten cikarir
    Then urunun sepetten cikarildigini dogrular
    And sayfayi kapatir