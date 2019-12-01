package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Student;

import com.qf.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class StuController {

    @Reference
    private StudentService stuService;

    @RequestMapping("/list")
    public String list(Model model){
        List<Student> list = stuService.list();
        model.addAttribute("stus", list);
        return "stulist";
    }
}