package com.itvdn.controllers;

import com.itvdn.persistence.dao.services.interfaces.EmployeeSimpleService;
import com.itvdn.persistence.model.Employee;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeSimpleService employeeSimpleService;

    @PostMapping(value = "/add")
    public String HelloITVDN() {
        employeeSimpleService.addEmployee(new Employee());
        return "redirect:/employee/all";
    }

    @GetMapping(value = "/all")
    public ModelAndView listAllEmployee(ModelAndView modelAndView) throws InterruptedException {
        modelAndView.addObject("employees", employeeSimpleService.findAll());
        modelAndView.setViewName("employees.jsp");
        return modelAndView;
    }

}
