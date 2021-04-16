Feature: To validate login functionality

  Background: 
    Given User is in Adactin Hotel login page
    When User enter valid username and password
      | sheelamathiyazhagan | poonguzhali |
    And User click login button

  Scenario Outline: To validate login functionality with valid username and valid password
    When User select "<Location>","<Hotel>","<Roomtype>","<NumberofRooms>","<Adultcount>","<Childrencount>"and Click SearchButton
    And User select the hotel and click continue
    And User enters "<FirstName>","<LastName>","<Address>","<Cardnumber>","<Cardtype>","<Expmonth>","<ExpYear>","<CVV>"and click book now
    Then User should be in confirmation page

    Examples: 
      | Location | Hotel        | Roomtype | NumberofRooms | Adultcount | Childrencount | FirstName | LastName      | Address | Cardnumber       | Cardtype        | Expmonth | ExpYear | CVV |
      | London   | Hotel Creek  | Standard |             1 |          2 |             2 | pranav    | raj           | chennai | 2345673425432723 | VISA            | Feb      |    2022 | 098 |
      | NewYork  | Hotel Hervey | Double   |             1 |          2 |             2 | Sheela    | Mathiyazhagan | Madurai | 5678902879065432 | AmericanExpress | May      |    2022 | 065 |
