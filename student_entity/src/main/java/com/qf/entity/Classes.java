package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Classes implements Serializable {

    private Integer cid;//课程id
    private String cname;//课程姓名
    private String tname;//授课老师姓名
}
