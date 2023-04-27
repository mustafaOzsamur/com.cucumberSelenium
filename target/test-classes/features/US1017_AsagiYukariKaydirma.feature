Feature: web sayfasi icerisinde kodlarla sayfayi asagi ve yukari kaydirma testi

  Scenario: TC22 Kullanici web sayfasi icerisinde kodlarla sayfayi asagi ve yukari kaydirma yapabilmeli
    Given kullanici "automationUrl" anasayfaya gider
    Then Ana sayfanin basariyla gorundugunu dogrulalar
    And  Sayfayi asagiya dogru kaydirin
    Then ABONELİK in gorunur oldugunu dogrulayin
    And  Sayfayi yukari kaydir
    Then Sayfanin yukari kaydirildigini ve Otomasyon Muhendisleri icin Tam Tesekkullu uygulama web sitesi metninin ekranda gorundugunu dogrulayin