package com.itvdn.controllers;

import com.itvdn.persistence.dao.services.interfaces.EmployeeSimpleService;
import com.itvdn.persistence.model.Employee;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by itvdn on 11.11.18.
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private static final Log LOG = LogFactory.getLog(EmployeeController.class);

//    @Autowired
//    private EmployeeSimpleService employeeSimpleService;

}
