Feature: US1014 Automation exercise sitesinde kullanci olusturun

  Scenario: TC19 Kullanici automation exercise sayfasinda kullanici olusturabilmeli
    
    Given kullanici "automationUrl" anasayfaya gider
    And user sig in linkine tiklar
    And user Create and account bolumune mail adresi girer
    And Create an Account butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user register butonuna basar
    Then hesap olustugunu dogrulayin