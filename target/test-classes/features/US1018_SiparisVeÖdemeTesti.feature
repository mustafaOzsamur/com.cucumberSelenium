Feature: US1018  Web sayfasinda siparis ve odeme tesi

  Scenario: TC23 Kullanici web sayfasindan siparis verebilmeli ve odeyebilmeli
    Given kullanici "automationUrl" anasayfaya gider
    Then Ana sayfanin basariyla gorundugunu dogrulalar
    And user sig in linkine tiklar
    And dogru email ve password girerek login butonuna tikla
    And sepete urun ekle
    And cart butonuna click yap
    Then cart sayfasinda urununun eklendigini dogrula
    And proceed To Checkout click yap
    And adres ayrintilarini dogrula ve siparisi incele
    Then aciklama metin alanina aciklamayi girin ve Place Order tiklayin
    And odeme ayrintilarini girin
    And pay and Confirm Order click yap
    Then your order has been placed successfully! yazisinin gorundugunu dogrulayin
    And delete Account butonuna click yapin
    And ACCOUNT DELETED yazisinin göründügünü dogrulayin
    Then continue butonuna click yap