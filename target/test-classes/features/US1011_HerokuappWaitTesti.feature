Feature: US1011 Kullanici herokuapp sayfasinda butonlarin gorünür oldugunu test eder.
@p2
  Scenario: TC16 Kullanici bekleyerek butonlarin gorunur olmasini saglamali

    Given kullanici "herokuappUrl" anasayfaya gider
    Then Add Element butonuna basar
    And Delete butonu gorunur oluncaya kadar bekler
    And Delete butonunun gorunur oldugunu test eder
    And Delete butonuna basarak butonu siler
    Then Delete butonunun gorunmedigini test eder
