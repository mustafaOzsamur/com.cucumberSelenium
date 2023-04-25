Feature: US1012 Window testi

  Scenario: TC17 Kullanici yeni acilan window'u test edebilmeli

    Given kullanici "wdUrl" anasayfaya gider
    Then Login Portal elementine kadar asagiya iner
    And Login Portal a tiklar
    Then Acila yeni window agecer
    And username kutusuna deger yazar
    And password kutusuna deger yazar
    Then Login butonuna basar
    And Popup ta cikan yazinin validation failed oldugunu test eder
    And OK diyerek popup i kapatir
    Then ilk sayfaya geri döner
    And ilk sayfaya dondugunun test eder
    And sacilan tüm sayfalari kapatir