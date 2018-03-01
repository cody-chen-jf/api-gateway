package com.example.apigateway.dao;

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
        return rest.get(url, new ParameterizedTypeReference<String>(){}).getBody();
    }

    public String getCompanyName() {
        String url = "http://company/getCompanyName";
        return rest.get(url, new ParameterizedTypeReference<String>(){}).getBody();
    }
}
