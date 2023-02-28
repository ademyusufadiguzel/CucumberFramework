@blue_rental_car
Feature: manager_information_login

  Scenario Outline: manager_login
    Given kullanici "https://www.bluerentalcars.com/" gider
    When kullanici login sayfasina gider
    And kullanici email "<email>" girer
    And kullanici sifreyi "<password>" girer
    And login butonuna basar
    Then login islemi gerceklesir
    Then close driver

    Examples: manager_informations
      | email                          | password     |
      | sam.walker@bluerentalcars.com  | c!fas_art |
      | kate.brown@bluerentalcars.com  | tad1$Fas  |
      | raj.khan@bluerentalcars.com    | v7Hg_va^  |
      | pam.raymond@bluerentalcars.com | Nga^g6!   |


