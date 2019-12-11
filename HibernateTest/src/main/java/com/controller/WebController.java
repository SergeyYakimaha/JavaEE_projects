package com.controller;

import com.model.entities.Cause;
import com.model.entities.Document;
import com.service.CauseService;
import com.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class WebController {
    @Autowired
    private CauseService causeService;
    @Autowired
    private DocumentService documentService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getMainPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main");
        return modelAndView;
    }

    @RequestMapping(value = "/causes", method = RequestMethod.GET)
    public ModelAndView allCauses() {
        List<Cause> causes = causeService.allCauses();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("causes");
        modelAndView.addObject("causesList", causes);
        return modelAndView;
    }

    @RequestMapping(value = "/documents", method = RequestMethod.GET)
    public ModelAndView allDocuments() {
        List<Document> documents = documentService.allDocuments();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("documents");
        modelAndView.addObject("documentsList", documents);
        return modelAndView;
    }
}
