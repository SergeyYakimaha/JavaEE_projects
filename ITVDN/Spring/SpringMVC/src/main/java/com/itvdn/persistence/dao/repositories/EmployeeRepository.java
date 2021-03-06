package com.itvdn.persistence.dao.repositories;

import com.itvdn.persistence.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
