package com.example.BasicSpringBootProjectUsingDI.controller;

import com.example.BasicSpringBootProjectUsingDI.dto.EmployeeDTO;
import com.example.BasicSpringBootProjectUsingDI.service.EmployeeService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/employee")
public class employeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/{id}")
    public EmployeeDTO getEmployeeById ( @PathVariable("id") int id){
        return employeeService.getByID(id);


    }

    @GetMapping
    public List<EmployeeDTO> getALlEmployees(){
        return employeeService.getALlEmployee();
    }


    @PostMapping
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.create(employeeDTO);
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable("id")int id){
        return employeeService.deleteById(id);

    }

//    @GetMapping("/employee1")
//        public String show(@PathParam("sort") String sort){
//            return "Hello "+ sort;
//
//
//    }
}
