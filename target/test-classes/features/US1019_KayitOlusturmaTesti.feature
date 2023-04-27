Feature: US1019 kayit olusturma ve listeye ekleme testi

  Scenario Outline: TC24 Kullanici web sayfasinda kayit olusturabilmeli
    Given kullanici "editorUrl" anasayfaya gider
    And kullanici new butonuna basar
    And first name kutusuna "<firstName>" yazar
    And last name kutusune "<lastName>" yazar
    And position kutusuna "<position>" yazar
    And office kutusuna "<office>" yazar
    And extension kutusuna "<extension>" yazar
    Then start date kutusuna "<startDate>" yazar
    And salary kutusuna "<salary>" yazar
    And create butonuna basar
    Then kullanici "<firstName>" ile arama yapar
    And isim bolumunde "<firstName>" oldugunu dogrular
    Then 2 saniye bekler
    And sayfayi kapatir
    Examples:
      | firstName | lastName | position  | office   | extension | startDate  | salary |
      | ilker     | Bulut    | QA        | Istanbul | Levennt   | 2021-01-01 | 20000  |
      | Ahmet     | Yilmaz   | Developer | Ankara   | Cukur     | 2022-02-05 | 40000  |
      | Hakan     | Uyanik   | Tester    | Izmir    | Karsi     | 2020-05-02 | 50000  |
      | Ramazan   | Can      | QA lead   | Ankara   | Kizilay   | 2021-10-01 | 25000  |
      | Sule      | Saglam   | Test lead | Izmir    | Konak     | 2022-02-02 | 23000  |
      | Yasar     | Ulas     | QA        | Istanbul | Kadikoy   | 2023-01-01 | 25000  |
      | Meryem    | Toprak   | QA lead   | Istanbul | levent    | 2022-11-11 | 20000  |



