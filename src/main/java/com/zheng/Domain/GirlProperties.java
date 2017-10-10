package com.zheng.Domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * Created by 18362 on 2017/10/10.
 */

@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
    private String cupsize;
    private Integer age;

    public String getCupsize() {
        return cupsize;
    }

    public void setCupsize(String cupsize) {
        this.cupsize = cupsize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
