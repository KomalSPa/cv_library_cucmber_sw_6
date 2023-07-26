Feature: Jobsearch Test

  Scenario Outline: Verify Job Search Result Using Different DataSet
    Given I am on On Home Page
    When I Accept Coockies all
    And I enter "<Job Title>"
    And I enter Location "<Location>"
    And I select Distance "<Distance>"
    And I click on more Search option lick
    And I enter Minimum "<Salary Min>"
    And I enter Maximum "<Salary Max>"
    And I select Salary Type "<Salary Type>"
    And I select Job Type"<Job Type>"
    And I click on FindJobs Button
    Then I should see the Result "<Result Text>"

    Examples:
      | Job Title | Location   | Distance | Salary Min | Salary Max | Salary Type | Job Type  | Result Text                            |
      | Tester    | Harrow     | 15 miles | 30000      | 500000     | Per annum   | Permanent | Permanent Tester jobs in Harrow        |
      | Teacher   | Uxbridge   | 5 miles  | 35000      | 50000      | Per annum   | Temporary | Temporary Teacher jobs in Uxbridge     |
      | Python    | Birmingham | 10 miles | 2000       | 4500       | Per month   | Contract  | Contract Python jobs in Birmingham     |
      | Scala     | Southall   | 25 miles | 30         | 50         | Per hour    | Temporary | Temporary Scala jobs in Southall       |
      | Account   | London     | 30 miles | 1600       | 2500       | Per week    | Permanent | Permanent Account jobs in London       |
      | Warehouse | Manchester | 5 miles  | 30000      | 500000     | Per annum   | Temporary | Temporary Warehouse jobs in Manchester |



