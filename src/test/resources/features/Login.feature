@BRT-337
Feature: Upgenix Login functionality

	User Story : As a user, I should be able to log in so that I can land on homepage.

	Background: For the scenarios in the feature file, user is expected to be on the login page
		Given user is on the Upgenix login page

	@BRT-298
	Scenario Outline: Login Functionality with valid credentials [AutomationS3-Sumeyra]
		Positive login scenario
		    
		    When user enters valid "<Username>" and valid "<Password>"
		    And user clicks to "login" button
		    Then user should see the title is "Odoo"
		
		    Examples:
		
		      | Username                 | Password     |
		      | posmanager100@info.com   | posmanager   |
		      | salesmanager100@info.com | salesmanager |

	@BRT-299
	Scenario Outline: Login Functionality with invalid credentials[AutomationS3-Sumeyra]
	Negative login scenario

		When user enters  "<Username>" and "<Password>"
		And user clicks to "login" button
		Then user should see "Wrong login/password" message displayed

		Examples:

			| Username                 | Password    |
			| posmanager100@info.com   |  pos        |
			| salesmanager100@info.com |  sales      |
			| posssss234@              |  posmanager |
			| @@sales@@                | salesmanager|
			|salespos@info             |  manager123 |
			|pos@info                  |  123manage  |

	@BRT-300
	Scenario Outline: Login Functionality with empty credentials [AutomationS3-Sumeyra]
	Negative login scenario with empty credentials

		When user enters  "<Username>" or  "<Password>"
		And user clicks to "login" button
		Then user should see  "Please fill out this field." message

		Examples:

			| Username                 | Password     |
			| posmanager100@info.com   |              |
			|                          | salesmanager |
			|                          |              |


	@BRT-301
	Scenario: Login Functionality Reset link [AutomationS3-Sumeyra]
	Reset link scenario

		When user clicks to "Reset Password" link
		Then user should see the title is "Reset password | Best solution for startups"


	@BRT-305
	Scenario Outline: Login Functionality password in bullet signs [AutomationS3-Sumeyra]
	Login - password in bullet sign scenario

		When user enters  "<Username>" and "<Password>"
		Then user should see password in bullet sign

		Examples:

			| Username                 | Password    |
			| posmanager100@info.com   |  posmanager |
			| salesmanager100@info.com | salesmanager|
			| posmanager100@info.com   |  pos123?    |
			|                          |    p--@:    |
			|salespos@info             |salesmanager |

	@BRT-306
	Scenario Outline: Login Functionality -Verifying enter key [AutomationS3-Sumeyra]
	Login - verify enter key scenario

		When user enters  "<Username>" and "<Password>"
		And user hit the ‘Enter’ key of the keyboard
		Then user should see the title is "Odoo"
		Examples:

			| Username                 | Password    |
			| posmanager100@info.com   |  posmanager |
			| salesmanager100@info.com | salesmanager|