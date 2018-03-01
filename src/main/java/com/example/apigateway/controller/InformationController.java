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
    public RestResponse<String> getInfomation(Long id){
        String userName = RestResponse.success(service.getUserName(id)).getResult();
        String companyName = RestResponse.success(service.getCompanyName()).getResult();

        return RestResponse.success(userName + companyName);
    }

    @RequestMapping("test/user")
    public RestResponse<String> getUserName(Long id){
        return RestResponse.success(service.getUserName(id));
    }

    @RequestMapping("test/port")
    public RestResponse<String> testPort(){
        return RestResponse.success(service.getUserServicePort());
    }
}
