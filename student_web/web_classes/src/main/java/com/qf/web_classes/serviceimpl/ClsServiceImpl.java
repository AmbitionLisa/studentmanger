package com.qf.web_classes.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.entity.Classes;
import com.qf.service.IClsService;
import com.qf.web_classes.dao.IClsMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ClsServiceImpl implements IClsService {

    @Autowired
    private IClsMapper clsMapper;
    @Override
    public List<Classes> getClsList() {

        return clsMapper.selectList(null);
    }
}
