package com.springcrash.springrestapi.service;

import com.springcrash.springrestapi.model.EmployeeModel;
import com.springcrash.springrestapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    // private static List<EmployeeModel> list = new ArrayList<>();

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeeModel> getEmployees() {
        // return list;
        return employeeRepository.findAll();
    }

    public EmployeeModel saveEmployees(EmployeeModel employee) {
        return employeeRepository.save(employee);
    }
}
