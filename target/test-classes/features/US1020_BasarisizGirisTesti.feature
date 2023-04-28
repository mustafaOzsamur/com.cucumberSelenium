Feature: US1020 web sayfasinda basarisiz login testi

  Scenario Outline:TC25 Kullanici yanlis Email ve Password ile giris yapamamali
    Given kullanici "qdUrl" anasayfaya gider
    Then kullanici logIn butonuna tiklar
    And email kutusuna "<gecersizEmail>" girer
    And password kutusuna "<gecersizPassword>" girer
    And 2 saniye bekler
    And login butonuna click yaparr
    And 2 saniye bekler
    And basarili giris yapilmadigini test eeder
    And 2 saniye bekler
    Then sayfayi kapatir
    Examples:
      | gecersizEmail | gecersizPassword |
      | mehmet@a.com  | mehemt           |
      | ahmet@b.com   | ahmet            |
      | yusuf@c.com   | yusuf            |
      | hasan@h.com   | hasan            |
      | ali@a.com     | ali              |


