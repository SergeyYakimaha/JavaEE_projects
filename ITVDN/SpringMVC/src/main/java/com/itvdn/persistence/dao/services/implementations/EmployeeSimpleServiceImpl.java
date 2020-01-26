package com.itvdn.persistence.dao.services.implementations;

import com.itvdn.persistence.dao.repositories.EmployeeRepository;
import com.itvdn.persistence.dao.services.interfaces.EmployeeSimpleService;
import com.itvdn.persistence.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeSimpleServiceImpl implements EmployeeSimpleService {
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeSimpleService employeeSimpleService;

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return null;
    }

    @Override
    public void removeById(long id) {

    }

    @Override
    public void listAllEmployee() {

    }

    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
}
