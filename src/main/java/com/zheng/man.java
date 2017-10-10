package com.zheng;

import java.util.HashMap;

/**
 * Created by 18362 on 2017/9/28.
 */
public class man {
    private Integer age;
    private  Integer id;
    private HashMap<String,String>map=new HashMap<String,String>();

    public man() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
