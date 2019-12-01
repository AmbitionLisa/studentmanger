package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Classes;
import com.qf.service.IClsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("cls")
public class ClsController {

    @Reference
    private IClsService clsService;
    @RequestMapping("list")
    public String getClsList(ModelMap map){

        List<Classes> clsList=clsService.getClsList();
        System.out.println(clsList);

        map.put("cls",clsList);
        return "clsList";
    }
}
