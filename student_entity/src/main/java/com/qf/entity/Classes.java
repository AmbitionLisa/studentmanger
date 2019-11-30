package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Classes {

    private Integer cid;//课程id
    private String cname;//课程姓名
    private String tname;//授课老师姓名
}
