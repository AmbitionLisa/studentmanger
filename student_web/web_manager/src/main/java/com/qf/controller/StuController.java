package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Student;
import com.qf.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

    //添加学生
    @RequestMapping("/toAddStu")
    public String toAddStu(){
        return "addStu";
    }
    @RequestMapping("/addStu")
    public String addStu(Student Stu){
        Integer i=stuService.addStu(Stu);
        return "redirect:/stu/list";
    }

    //删除学生
    @RequestMapping("delStu/{id}")
    public String delStu(@PathVariable("id") Integer id){
        System.out.println(id);
        Integer i=stuService.delStu(id);
        System.out.println(i);
        return "redirect:/stu/list";
    }

    //根据id查询学生对象
    @RequestMapping("getStuByCid/{id}")
    public String getStuByCid(@PathVariable("id") Integer id,Model model){
        Student Stu=stuService.getStuById(id);
        model.addAttribute("stu",Stu);
        return "updStu";
    }
    //修改学生
    @RequestMapping("updStu")
    public String udpStu(Student Stu){
        Integer i=stuService.udpStu(Stu);
        return "redirect:/stu/list";
    }

}
