Feature: Dotcom End2End Test
Description : To test end to end dotcom feature working.

Scenario: Customer buy Internet deal from xfinity.com
          Given user is on homepage
          When  user clicks shop link
          When  user enters its address
          And   clicks on show deal button
          And   able to navigate to services section
          And   filters result based on "Internet" only
          And   user selects "Download speeds up to 150 Mbps" deal to its cart
          And   selects gateway offer
          And   clicks on next install button
          And   on installation page selects Get a self-install kit option
          And   clicks next button
          And   on billing page fills up all required information.
          #And  user clicks on review button
          #Then user should able to buy deal
 
