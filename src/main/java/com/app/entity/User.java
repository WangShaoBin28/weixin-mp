package com.app.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Package com.app.entity
 * @ClassName User
 * @Author shaobin.wang
 * @Date 2019/01/03 18:53
 * @Version 1.0
 * @Description: 用户表
 **/
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 760207893267952940L;

    private Long id;

    private String name;


}
