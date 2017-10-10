package com.zheng.Controller;

import com.zheng.Domain.girl;
import com.zheng.Dao.girlResponsity;
import com.zheng.Service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by 18362 on 2017/7/10.
 */
@RestController
public class girlController {
    @Autowired
    private girlResponsity girlresponsity;
    @Autowired
    private GirlService girlService;
    @GetMapping(value ="/girls")
    public List<girl> getGirlsList()
    {
     return girlresponsity.findAll();
    }

   // @PostMapping(value ="/girls")
@PostMapping("/girls")
//进行表单验证需要对对象的属性进行验证
    public  girl addGirl(@Valid girl girl1, BindingResult bindingResult)
{
    if(bindingResult.hasErrors())
    {
     System.out.println(bindingResult.getFieldError().getDefaultMessage());
     return null;
    }
    girl1.setAge(girl1.getAge());
    girl1.setCupsize(girl1.getCupsize());
     return girlresponsity.save(girl1);
    }
    @GetMapping(value="/girls/{id}")
    public girl getGirl(@PathVariable("id")Integer id)
    {
        return girlService.findone(id);
    }
    @PutMapping(value="/girls/{id}")
    public girl updategril(@PathVariable("id")Integer id,@RequestParam("cupsize")String cupsize,@RequestParam("age")Integer age)
    {
        girl newgirl=new girl();
        newgirl.setId(id);
        newgirl.setCupsize(cupsize);
        newgirl.setAge(age);
        return  girlresponsity.save(newgirl);
    }
    @DeleteMapping(value="/girls/delete/{id}")
    public void deletegirl(@PathVariable("id") Integer id)
    {
        girlresponsity.delete(id);
    }
    @GetMapping(value = "/girls/fingbyage/{age}")
    public List<girl> findbyage(@PathVariable("age") Integer age)
    {
        return girlresponsity.findByAge(age);
    }
}
