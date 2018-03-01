package com.example.apigateway.service;

import com.example.apigateway.dao.InformationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InformationService {
    @Autowired
    private InformationDao informationDao;

    public String getUserName(Long id){
        return informationDao.getUserName(id);
    }

    public String getCompanyName() {
        return informationDao.getCompanyName();
    }

    public String getUserServicePort() {
        return informationDao.getUserServicePort();
//        return informationDao.getUserServicePortWithOutLoadBalance();
    }
}
