package com.example.BasicSpringBootProjectUsingDI.service;

import com.example.BasicSpringBootProjectUsingDI.dto.EmployeeDTO;
import com.example.BasicSpringBootProjectUsingDI.entity.EmployeEntity;
import com.example.BasicSpringBootProjectUsingDI.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    ModelMapper modelMapper;

    public EmployeeDTO getByID(int id) {
        EmployeEntity employeEntity = employeeRepository.getById(id);
        return modelMapper.map(employeEntity, EmployeeDTO.class);
    }

    public EmployeeDTO create(EmployeeDTO employeeDTO) {
        EmployeEntity employeEntity = modelMapper.map(employeeDTO, EmployeEntity.class);
        return modelMapper.map(employeeRepository.save(employeEntity), EmployeeDTO.class);
    }

    public List<EmployeeDTO> getALlEmployee() {
        return employeeRepository
                .findAll()
                .stream()
                .map(employeEntity -> modelMapper.map(employeEntity, EmployeeDTO.class)).
                collect(Collectors.toList());
    }

    public boolean deleteById(int id) {
        boolean isPresent = employeeRepository.existsById(id);
        if (!isPresent) return false;
        employeeRepository.deleteById(id);
        return true;
    }
}
