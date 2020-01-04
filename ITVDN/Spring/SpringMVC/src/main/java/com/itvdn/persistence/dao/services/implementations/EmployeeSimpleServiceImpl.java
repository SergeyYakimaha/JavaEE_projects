package com.itvdn.persistence.dao.services.implementations;

import com.itvdn.persistence.dao.services.interfaces.EmployeeSimpleService;
import com.itvdn.persistence.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeSimpleServiceImpl implements EmployeeSimpleService {

//    @Autowired
//    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() throws InterruptedException {
        return null;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return null;
    }

    @Override
    public void removeById(long id) {

    }

}
