package com.example.apigateway.controller;

import com.example.apigateway.common.RestResponse;
import com.example.apigateway.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InformationController {
    @Autowired
    private InformationService service;

    @RequestMapping("test/info")
    public RestResponse<String> getUserName(Long id){
        String userName = RestResponse.success(service.getUserName(id)).getResult();
        String companyName = RestResponse.success(service.getCompanyName()).getResult();

        return RestResponse.success(userName + companyName);
    }
}
