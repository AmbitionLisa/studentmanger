package com.qf.service;


import com.qf.entity.Classes;

import java.util.List;

public interface IClsService {


    List<Classes> getClsList();

    Integer addCls(Classes cls);

    Integer delCls(Integer cid);

    Classes getClsByCid(Integer cid);

    Integer udpCls(Classes cls);
}
