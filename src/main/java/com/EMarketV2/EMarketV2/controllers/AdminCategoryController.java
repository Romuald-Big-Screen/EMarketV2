package com.EMarketV2.EMarketV2.controllers;

import com.EMarketV2.EMarketV2.service.ICategoriesAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value ="/catAdmin")
public class AdminCategoryController {
    @Autowired
    public ICategoriesAdminService service;
    @RequestMapping(value ="/index")
    public String index(Model model){
         return "addCategories";
    }

}
