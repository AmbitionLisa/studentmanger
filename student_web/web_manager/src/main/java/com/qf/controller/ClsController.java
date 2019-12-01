package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Classes;
import com.qf.service.IClsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/cls")
public class ClsController {

    @Reference
    private IClsService clsService;

    @RequestMapping("/list")
    public String getClsList(Model model){

        List<Classes> clsList=clsService.getClsList();
        model.addAttribute("clsList",clsList);
        return "clsList";
    }

    //添加课程

    @RequestMapping("/toAddCls")
    public String toAddCls(){
        return "addCls";
    }
    @RequestMapping("/addCls")
    public String addCls(Classes cls){
        Integer i=clsService.addCls(cls);
        return "redirect:/cls/list";
    }

    //删除课程
    @RequestMapping("delCls/{cid}")
    public String delCls(@PathVariable("cid") Integer cid){
        System.out.println(cid);
        Integer i=clsService.delCls(cid);
        System.out.println(i);
        return "redirect:/cls/list";
    }

    //根据id查询课程对象
    @RequestMapping("getClsByCid/{cid}")
    public String getClsByCid(@PathVariable("cid") Integer cid,Model model){
        Classes cls=clsService.getClsByCid(cid);
        model.addAttribute("cls",cls);
        return "updCls";
    }
    //修改课程
    @RequestMapping("updCls")
    public String udpCls(Classes cls){
        Integer i=clsService.udpCls(cls);
        return "redirect:/cls/list";
    }

}
