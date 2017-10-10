package com.zheng.Dao;
import java.util.List;

import com.zheng.Domain.girl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 18362 on 2017/7/10.
 */
public interface girlResponsity extends JpaRepository<girl, Integer>{
    public List<girl> findByAge(Integer age);

}
