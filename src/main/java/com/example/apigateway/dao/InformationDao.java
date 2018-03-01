package com.example.apigateway.dao;

import com.example.apigateway.common.RestResponse;
import com.example.apigateway.config.GenericRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Repository;

@Repository
public class InformationDao {

    @Autowired
    private GenericRest rest;

    public String getUserName(Long id) {
        String url = "http://user/getUserName?id=" + id;
        RestResponse<String> response = rest.get(url, new ParameterizedTypeReference<RestResponse<String>>(){}).getBody();
        return response.getResult();
    }

    public String getCompanyName() {
        String url = "http://company/getCompanyName";
        RestResponse<String> response = rest.get(url, new ParameterizedTypeReference<RestResponse<String>>(){}).getBody();
        return response.getResult();
    }

    public String getUserServicePort() {
        String url = "http://user/getUserServicePort";
        RestResponse<String> response = rest.get(url, new ParameterizedTypeReference<RestResponse<String>>(){}).getBody();
        return response.getResult();
    }

    public String getUserServicePortWithOutLoadBalance() {
        String url = "direct://http://127.0.0.1:8081/getUserServicePort";
        RestResponse<String> response = rest.get(url, new ParameterizedTypeReference<RestResponse<String>>(){}).getBody();
        return response.getResult();
    }
}
