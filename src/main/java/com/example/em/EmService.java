package com.example.em;

import java.util.List;

public interface EmService {

    String createEmployee(Employee employee);
    List<Employee> readEmployees();
    boolean deleteEmployee(Long id);


    
} 
