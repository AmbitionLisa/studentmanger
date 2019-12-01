package com.qf.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.IClsMapper;
import com.qf.entity.Classes;
import com.qf.service.IClsService;
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
