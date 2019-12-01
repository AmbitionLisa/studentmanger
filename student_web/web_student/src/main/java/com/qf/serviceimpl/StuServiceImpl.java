package com.qf.serviceimpl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.StuMapper;
import com.qf.entity.Student;
import com.qf.service.IClsService;
import com.qf.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class StuServiceImpl implements StudentService {

    @Autowired
    private StuMapper stuMapper;

    @Reference
    private IClsService clsService;

    @Override
    public List<Student> list() {
        List<Student> students = stuMapper.selectList(null);

        for (Student student : students) {
            //当前学生的所属班级
            Integer cid = student.getCid();
            //获得班级信息
            //Classes classes = clsService.queryById(cid);
            //student.setCls(classes);
        }

        return students;
    }
}
