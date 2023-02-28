#NAME:kullanici tum manager login bilgileriyle giriş yapabilmeli
#AC:
#Given kullanici ana sayfada
#When kullanici login sayfasina gider
#And kullanıcı adini girer
#And sifreyi girer
#And login buttoning basar
#Then login islemi gerçekleşir
#ARTIFACT:
#url : https://www.bluerentalcars.com/
#Credentials:
#                {"sam.walker@bluerentalcars.com","c!fas_art"},
#                {"kate.brown@bluerentalcars.com","tad1$Fas"},
#                {"raj.khan@bluerentalcars.com","v7Hg_va^"},
#                {“pam.raymond@bluerentalcars.com”,"Nga^g6!"}
#NOT: scenario outline kullanalim

@bluerentalcar
Feature: Manager information login

  Scenario Outline: manager login
    Given kullanici "https://www.bluerentalcars.com/" gider
    When kullanici login sayfasina gider
    And kullanıcı email "<email>" girer
    And kullanici sifreyi "<sifre>" girer
    And login buttoning basar
    Then login islemi gerçekleşir

    Examples: Manager informations
      | email                          | sifre     |
      | sam.walker@bluerentalcars.com  | c!fas_art |
      | kate.brown@bluerentalcars.com  | tad1$Fas  |
      | raj.khan@bluerentalcars.com    | v7Hg_va^  |
      | pam.raymond@bluerentalcars.com | Nga^g6!   |


