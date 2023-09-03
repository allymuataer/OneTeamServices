

Feature: Verify Services Offered on oneteam.services

  Scenario: Verify the list of services on the Our Services page
    When I click on the Our Services button on the Top header
        Then I should see the following services being offered:
      |Software Engineering|
      |Cloud Architecture|
      |Agile Delivery|
      |Technical Architecture/Design|
      |DevOps & Managed Services|
      |Consulting|