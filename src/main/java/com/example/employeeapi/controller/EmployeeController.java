package com.example.employeeapi.controller;

import com.example.employeeapi.datasource.EmployeeRepository;
import com.example.employeeapi.datasource.TestEmployeeRepository;
import com.example.employeeapi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {

    private EmployeeRepository employeeRepository;

    public EmployeeController() {
        employeeRepository=new TestEmployeeRepository();
    }

    @RequestMapping("/employees")
   public String getEmployees(Model model) {
        List<Employee> employees=employeeRepository.getAllEmployees();

//        return new ModelAndView("employees");
        model.addAttribute("employees", employees);
//
        return "employees";
    }


    @GetMapping("/employees/{id}")
    ResponseEntity getEmployee(@PathVariable("id") int id) {
        return new ResponseEntity<>(employeeRepository.getEmployee(id), HttpStatus.OK);
    }
}
