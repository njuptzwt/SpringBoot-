package com.zheng.Controller;

import com.zheng.Domain.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 18362 on 2017/10/10.
 */
@RestController//这个注解等同于Controller+ResponseBody
public class HelloController {
    @Autowired
    private GirlProperties girlProperties;
    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "id",required = false,defaultValue = "8") Integer id)
    {
        return "id"+" "+id;
    }
}
