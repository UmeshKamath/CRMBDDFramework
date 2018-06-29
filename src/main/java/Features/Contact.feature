Feature: Free CRM Contact Feature

Scenario Outline: Free CRM Contact Test Scenario		#scenario if we use single, if we use examples then we will use scenarios outline

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user moves to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then Close the browser

Examples:
	| username | password | firstname | lastname | position |
	| naveenk  | test@123 | Umesh	  | Kamath   | Manager  |
	| naveenk  | test@123 | Dave	  | D        | Director |
