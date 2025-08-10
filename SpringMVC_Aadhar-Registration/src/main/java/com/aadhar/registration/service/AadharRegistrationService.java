package com.aadhar.registration.service;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aadhar.registration.dao.AadharRegistrationDAO;

 
@Service
public class AadharRegistrationService {
    @Autowired
    private AadharRegistrationDAO dao;

    public int registerAadhar(String firstName, String mobile) {
        return dao.saveAadharDetails(firstName, mobile);
    }
}
