package com.zheng.Service;

import com.zheng.Dao.girlResponsity;
import com.zheng.Domain.girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 18362 on 2017/10/10.
 */
@Service
public class GirlService {
    @Autowired
    private girlResponsity girlResponsity;
    public girl findone(Integer id)
    {
        return girlResponsity.findOne(id);
    }
}
