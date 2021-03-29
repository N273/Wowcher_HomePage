package com.wowcher.test.practice.stepDefinition;

import com.wowcher.test.practice.webPages.homePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.core.Is.is;

public class HomeSteps {
      private homePage HomePage = new homePage();
    @Given("^Customer is on a home page$")
    public void customer_is_on_a_home_page() throws Throwable {
       HomePage.getCurrentUrl();
    }

    @When("^Customer clicks home tab$")
    public void customer_clicks_home_tab() throws Throwable {
             HomePage.clickHome();
    }

    @Then("^Customer can browser all the tab$")
    public void customer_can_browser_all_the_tab() throws Throwable {
    }


}
