Feature: Swag Labs

  Scenario Outline: Create and order function
    Given Open browser with "https://www.saucedemo.com/"
    When I input "<userName>" and "<password>"
   	Given User login to homepage to verify homepage as "Swag Labs"
   	When User click on a product
   	And User click on add to cart
   	Then user view the cart
   	And user click on checkout
   	Then user fillout the info as firstName "Yas" lastName "Asif" and zip "19082"
   	And user click on finish   	
   	Then Driver Close
   	
   	 Examples:
    	| userName								| password 		 |
    	| standard_user							|	secret_sauce |
   	