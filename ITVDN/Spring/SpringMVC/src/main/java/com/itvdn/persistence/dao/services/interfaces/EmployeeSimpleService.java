package com.itvdn.persistence.dao.services.interfaces;

import com.itvdn.persistence.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeSimpleService {
    List<Employee> findAll() throws InterruptedException;

    Employee addEmployee(Employee employee);

    void removeById(long id);
}
