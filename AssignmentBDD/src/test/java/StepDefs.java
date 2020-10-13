import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefs
{

    @Given("I navigate to the url {string}")
    public void i_navigate_to_the_url(String Url)
    {
        BaseTestHooks.homePage.naviagteToUrl(Url);

    }

    @Then("i should navigate to the home page")
    public void i_should_navigate_to_the_home_page()
    {
       System.out.println("Home Page title is :"+ BaseTestHooks.getpagetitle());
    }


    @When("I enter first number as {int}")
    public void i_enter_first_number_as(Integer int1)
    {
       BaseTestHooks.homePage.enterFirstNum(int1);
    }

    @When("I enter second number as {int}")
    public void i_enter_second_number_as(Integer int2)
    {
      BaseTestHooks.homePage.enterSecondNumber(int2);
    }

    @When("I click on calculate")
    public void i_click_on_calculate()
    {
      BaseTestHooks.homePage.clickCalculateBtn();
    }

    @Then("I should get the answer")
    public void i_should_get_the_answer()
    {
     // System.out.println("The Answer:"+BaseTestHooks.homePage.getAnswer());
    }

    @Then("I select Add from the drop down")
    public void i_select_Add_from_the_drop_down()
    {
       BaseTestHooks.homePage.selectAddFromDropDown();
    }

    @Then("I select Subtract from the drop down")
    public void i_select_Subtract_from_the_drop_down()
    {
      BaseTestHooks.homePage.selectSubtractFromDropDown();
    }

    @Then("I select Multiple from the drop down")
    public void i_select_Multiple_from_the_drop_down()
    {
      BaseTestHooks.homePage.selectMultiplyFromDropdown();
    }

    @Then("I select Divide from the drop down")
    public void i_select_Divide_from_the_drop_down()
    {
       BaseTestHooks.homePage.selectDivideFromDropDown();
    }

    @Then("I select Concatenate from the drop down")
    public void i_select_Concatenate_from_the_drop_down()
    {
      BaseTestHooks.homePage.selectConcatenatefromDD();
    }




}
