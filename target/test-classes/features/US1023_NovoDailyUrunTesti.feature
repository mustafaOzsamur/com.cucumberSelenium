Feature: US1023 nodaily.com sitesinde bulunan "produkte" linki altindaki urun sayisi testi
  @nd
  Scenario: TC28 Kullanici produkte linki altindaki ve kategoriler altindaki ürün toplam sayilarini test edebilmeli
    Given kullanici "ndUrl" anasayfaya gider
    And mausu produkte linkinin uzerinde bekletir
    And cookies kabul eder
    And produkta altinda acilan genanalsyen linkine tiklar ve burda bulunan urun sayisini alir
    And blutanalsyen linkine tiklar buradaki urunlerin sayisini alir
    And nahrungerganzungsmittel linkine tiklar ve urun sayisini alir
    And bundles sayfasindaki urun sayisini alir
    And abos sayfasindaki urun sayisini alir
    And produkte linkine tiklar "Alle produkte" yazisinin görünür oldugunu dogrular
    And bu sayfada bulunan urun sayisini alir ve diger alinan urun sayilarinin toplami ile ayni oldugunu dogrular
    Then sayfayi kapatir