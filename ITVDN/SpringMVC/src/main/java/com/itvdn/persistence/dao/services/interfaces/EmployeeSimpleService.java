package com.itvdn.persistence.dao.services.interfaces;

import com.itvdn.persistence.model.Employee;

import java.util.List;

public interface EmployeeSimpleService {
    List<Employee> findAll();

    Employee addEmployee(Employee employee);

    void removeById(long id);

    void listAllEmployee();
}
