package com.zheng;

import com.zheng.Domain.girl;
import com.zheng.Service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by 18362 on 2017/10/10.
 */
//单元测试使用方法
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlTest {
    @Autowired
    private GirlService girlService;
    @Test
    public void testFindone()
    {
        girl newgirl=girlService.findone(3);
        Assert.assertEquals(new Integer(23),newgirl.getAge());
       // System.out.println(newgirl.getCupsize());
    }
}
