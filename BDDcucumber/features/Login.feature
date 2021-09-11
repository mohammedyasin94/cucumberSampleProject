Feature: Swag Labs

  Scenario Outline: Login function
    Given Open browser with "https://www.saucedemo.com/"
    When I input "<userName>" and "<password>"
    Then Driver Close

    Examples:
    	| userName								| password 		 |
    	| standard_user							|	secret_sauce |
    	
  	