Feature: Feature to test searching scenarios

@demo
Scenario Outline: Successful Login with Valid Credentials 
   Given I am on GoIbibo login page 
   When I enter username as "<username>"
   And I enter password as "<password>" 
   Then User should should login successfully
	 Examples:
	| username   | password |
    | testuser_1 | Test@153 |
    | testuser_2 | Test@153 |