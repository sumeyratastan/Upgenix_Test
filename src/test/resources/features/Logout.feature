@BRT-338
Feature: Upgenix Logout Functionality

	User Story :

	As a user, I should be able to log out.

	Background: For the scenarios in the feature file, user is expected to be on the login page
		Given user is on the Upgenix login page



	@BRT-307
	Scenario Outline: Log out and ends up in login page [AutomationS3-Sumeyra]
		Logout scenario
		
		    When user enters valid "<Username>" and valid "<Password>"
		    And user clicks to "login" button
		    And user should see the title is "Odoo"
		    And user clicks to "name"
		    And user clicks to "logout" dropdown
		    Then user should see the title is "Login | Best solution for startups"
		
		
		    Examples:
		
		      | Username                 | Password     |
		      | posmanager100@info.com   | posmanager   |

	@BRT-314
	Scenario Outline: Log out-clicking step back button [AutomationS3-Sumeyra]
		When user enters valid "<Username>" and valid "<Password>"
		And user clicks to "login" button
		And user should see the title is "Odoo"
		And user clicks to "name"
		And user clicks to "logout" dropdown
		And user should see the title is "Login | Best solution for startups"
		And user click to "step back" button
		Then user should see "Odoo Session Expired" message

		Examples:

			| Username                 | Password     |
			| posmanager100@info.com   | posmanager   |
