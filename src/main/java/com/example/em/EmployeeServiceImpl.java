package com.example.em;
import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmService {

    List<Employee> employees = new ArrayList<>();

    @Override
    public String createEmployee(Employee employee) 
    {
        employees.add(employee);
        return "Saved Successfully";
    }

    @Override
    public List<Employee> readEmployees()
    {
        return employees;
    }

    @Override
    public boolean deleteEmployee(Long id)
    {
        //employees.remove(id);
        return true;
    }
}
