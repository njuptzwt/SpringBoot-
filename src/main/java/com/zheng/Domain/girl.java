package com.zheng.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * Created by 18362 on 2017/7/10.
 */
@Entity
public class girl {
    @Id
    @GeneratedValue
    private Integer id;
    private String cupsize;
    @Min(value = 18, message = "未满18周岁不得入内")
    private Integer age;

    public girl() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCupsize(String cupsize) {
        this.cupsize = cupsize;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public String getCupsize() {
        return cupsize;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
