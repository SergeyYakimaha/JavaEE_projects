package com.itvdn.controllers;

import com.itvdn.users.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloITVDNController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String HelloITVDN() {
        return "index.jsp";
    }

    @GetMapping(value = "/bye")
    public String ByeITVDN() {
        return "bye.jsp";
    }

    @GetMapping(value = "/pass-data")
    public String passDataFromUser() {
        return "pass-data.jsp";
    }

    @GetMapping(value = "/pv/{name}/{surname}/{years}")
    public ModelAndView parsePathVariable(
            @PathVariable(value = "name") String name,
            @PathVariable(value = "surname") String surname,
            @PathVariable(value = "years") Integer years) {
        ModelAndView modelAndView = new ModelAndView();

        User user = new User();
        user.setName(name);
        user.setSurname(surname);
        user.setYears(years);

        modelAndView.setViewName("forward:/pathVariable.jsp");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @PostMapping(value = "/pass-data")
    public ModelAndView passDataFromUser(@ModelAttribute("user") User user, ModelAndView modelAndView) {
        System.out.println(user);
        modelAndView.setViewName("forward:summary.jsp");
        modelAndView.addObject("user", user);
        return modelAndView;
    }
}
