package com.qf.service;


import com.qf.entity.Student;

import java.util.List;

public interface StudentService {
      List<Student> list();

    Integer addStu(Student stu);

    Integer delStu(Integer id);

    Student getStuById(Integer id);

    Integer udpStu(Student stu);
}
