package com.SkyProject.pages;
import com.SkyProject.utilities.ConfigurationReader;
import io.cucumber.java.it.Ma;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class ArticlesAPI {


    Response response;

    public void setTheRequest(){
        RestAssured.baseURI = ConfigurationReader.get("BaseURI");

    }

    public void sendTheRequest(String requestType, String endPoint) {

        switch (requestType){
            case "GET":
                response = given().accept(ContentType.JSON).
                        when().
                        get(ConfigurationReader.get(endPoint));
                break;
            case "POST":
                response = given().contentType(ContentType.JSON).
                        when().
                        post(ConfigurationReader.get(endPoint));
                break;
            case "PUT":
                response = given().contentType(ContentType.JSON).
                        when().
                        put(ConfigurationReader.get(endPoint));
                break;
            case "DELETE":
                response = given().contentType(ContentType.JSON).
                        when().
                        delete(ConfigurationReader.get(endPoint));
                break;
        }

    }

    List<Map<String,Object>> listofArticles= new ArrayList<>();
    public List<Map<String,Object>>getListOfArticles(){
        listofArticles = response.body().as(List.class);

        //response.prettyPeek();
        //List<Map<String, Object>> listofArticles = response.jsonPath().getList("");

        return listofArticles;
    }

    Map<String,Object> singleArticle = new HashMap<>();
    public Map<String,Object> getSingleArticle(){

        singleArticle= response.body().as(Map.class);
        return singleArticle;
    }

    public int getStatusCode(){
        return response.statusCode();
    }

    public String getContentType(){
        return response.getContentType();
    }

    public int getNumberOfArticle(String typeOfList){
        if (typeOfList.equals("list")){
            return listofArticles.size();
        }else {
            return singleArticle.size();

        }

    }


}
