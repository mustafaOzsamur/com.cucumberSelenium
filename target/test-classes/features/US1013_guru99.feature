Feature: US1013 Kullanici web tablosundan istedigi degerin varligini test eder

  Scenario: TC18 Kullanici tablodan deger test edebilmeli

    Given kullanici "guru99Url" anasayfaya gider
    And guru99 cookies kabul eder
    Then Company listesini concola yazdirir
    And "Blue Dart Expres" in listede oldugunu test eder
