package com.aadhar.registration.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AadharRegistrationDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int saveAadharDetails(String firstName, String mobile) {
        String sql = "INSERT INTO aadhar_registration (first_name, mobile) VALUES (?, ?)";
        return jdbcTemplate.update(sql, firstName, mobile);
    }
}
