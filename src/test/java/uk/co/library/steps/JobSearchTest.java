package uk.co.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchTest {
    @Given("I am on On Home Page")
    public void iAmOnOnHomePage() {
    }

    @When("I Accept Coockies all")
    public void iAcceptCoockiesAll()  {
        new HomePage().setAcceptCookies();
    }

    @And("I enter {string}")
    public void iEnter(String jobTitle) {
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("I enter Location {string}")
    public void iEnterLocation(String location) {
        new HomePage().enterLocation(location);
    }

    @And("I select Distance {string}")
    public void iSelectDistance(String distance) {
        new HomePage().selectDistance(distance);
    }

    @And("I click on more Search option lick")
    public void iClickOnMoreSearchOptionLick() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("I enter Minimum {string}")
    public void iEnterMinimum(String minSalary) {
        new HomePage().enterMinSalary(minSalary);
    }

    @And("I enter Maximum {string}")
    public void iEnterMaximum(String maxSalary) {
        new HomePage().enterMaxSalary(maxSalary);
    }

    @And("I select Salary Type {string}")
    public void iSelectSalaryType(String salaryType) {
        new HomePage().selectSalaryType(salaryType);
    }

    @And("I select Job Type{string}")
    public void iSelectJobType(String jobType) {
        new HomePage().selectJobType(jobType);
    }

    @And("I click on FindJobs Button")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobsButton();
    }


    @Then("I should see the Result {string}")
    public void iShouldSeeTheResult(String result) {
        new ResultPage().verifyTheResults(result);
    }
}
