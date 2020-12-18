package com.SkyProject.step_definitions;

import com.SkyProject.pages.ArticlesAPI;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SkyStepDefinitions {

    ArticlesAPI articlesAPI = new ArticlesAPI();

    @Given("I set REST API url")
    public void i_set_REST_API_url() {

        articlesAPI.setTheRequest();

    }

    @Then("I send the request with {string} to {string}")
    public void i_send_the_request_with_to(String requestType, String endPoint) {
        articlesAPI.sendTheRequest(requestType,endPoint);
    }

    @Then("I get the list of Articles")
    public void i_get_the_list_of_Articles() {
        System.out.println("article 2" + articlesAPI.getListOfArticles());


        // System.out.println("article 2" + articlesAPI.getListOfArticles().get(0));

    }
    @Then("I get the single article")
    public void i_get_the_single_article() {

        System.out.println("single article 2 = " + articlesAPI.getSingleArticle());

    }

    @And("status code should be {string}")
    public void statusCodeShouldBe(String expectedStatusCode) {

        String actualStatusCode = String.valueOf(articlesAPI.getStatusCode());

        Assert.assertEquals("verify status code" ,expectedStatusCode,actualStatusCode);

    }

    @Then("content type should be {string}")
    public void contentTypeShouldBe(String contentType) {
        String actualContentType = articlesAPI.getContentType();
        Assert.assertEquals(contentType, actualContentType);
    }


    @Then("article {string} shouldn't be empty")
    public void articleShouldnTBeEmpty(String typeOfList) {
        Assert.assertNotEquals(0,articlesAPI.getNumberOfArticle(typeOfList));

    }
}
