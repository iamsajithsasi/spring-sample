package com.springcrash.springrestapi.controller;

import com.springcrash.springrestapi.model.EmployeeModel;
import com.springcrash.springrestapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @Controller
// @RequestMapping("api/v1")
@RestController // @Controller + @ResponseBody
public class EmployeeController {

    @Autowired
    public EmployeeService employeeService;

    // @ResponseBody // restful response
    // @RequestMapping(value = "employees", method = RequestMethod.GET)
    @GetMapping("employees")
    public List<EmployeeModel> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("employee/{id}")
    public String getEmployee(@PathVariable("id") Long id) {
        return "view employee " + id;
    }

    @PostMapping("employee")
    public EmployeeModel saveEmployee(@RequestBody EmployeeModel employee) {
        return employeeService.saveEmployees(employee);
    }

    @PutMapping("employee/{id}")
    public String updateEmployee(@PathVariable("id") Long id, @RequestBody EmployeeModel employee) {
        return "update employee " + id + employee;
    }

    @DeleteMapping("employee")
    public String deleteEmployee(@RequestParam("id") Long id) {
        return "delete employee " + id;
    }
}
