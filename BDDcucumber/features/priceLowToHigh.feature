Feature: Swag Labs

  Scenario Outline: Price Low To High
    Given Open browser with "https://www.saucedemo.com/"
    When I input "<userName>" and "<password>"
   	Given User login to homepage to verify homepage as "Swag Labs"
   	When User click on sort by option
   	And get all present valuess
   	And User select price low to high 
   	Then Driver Close
   	
   	 Examples:
    	| userName								| password 		 |
    	| standard_user							|	secret_sauce |
   	