Feature: US1020 web sayfasinda basarisiz login testi
  @wip
  Scenario Outline:TC25 Kullanici yanlis Email ve Password ile giris yapamamali
    Given kullanici "qdUrl" anasayfaya gider
    Then kullanici logIn butonuna tiklar
    And email kutusuna "<gecersizEmail>" girer
    And password kutusuna "<gecersizPassword>" girer
    And login butonuna click yaparr
    And basarili giris yapilmadigini test eeder
    Then sayfayi kapatir
    Examples:
      | gecersizEmail | gecersizPassword |
      | mehmet        | mehmet@a.com     |
      | ahmet         | ahmet@b.com      |
      | yusuf         | yusuf@c.com      |
      | hasan         | hasan@h.com      |
      | ali           | ali@a.com        |
      | cafer         | cafer@c.com      |
      | huseyin       | huseyin@h.com    |
      | mehmet        | mehmet@a.com     |
      | ahmet         | ahmet@b.com      |
      | yusuf         | yusuf@c.com      |
      | hasan         | hasan@h.com      |
      | ali           | ali@a.com        |
      | cafer         | cafer@c.com      |
      | huseyin       | huseyin@h.com    |