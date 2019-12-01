package com.qf.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Student extends BaseEntity {
    private String sname;//学生姓名
    private Integer age;//年龄
    private Integer cid;//课程id

    @TableField(exist = false)
    private Classes cls;//课程对象
}