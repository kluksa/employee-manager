package com.kluksa.cucumber;

import com.kluksa.EmployeeManagerApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = EmployeeManagerApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
