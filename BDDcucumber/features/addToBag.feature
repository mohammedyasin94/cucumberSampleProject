Feature: Swag Labs

  Scenario Outline: Add to cart function
    Given Open browser with "https://www.saucedemo.com/"
    When I input "<userName>" and "<password>"
   	Given User login to homepage to verify homepage as "Swag Labs"
   	When User click on a product
   	And User click on add to cart
   	Then Driver Close
   	
   	 Examples:
    	| userName								| password 		 |
    	| standard_user							|	secret_sauce |
   	