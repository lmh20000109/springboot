package com.lmh;

import com.lmh.dao.BrandDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot07DruidApplicationTests {


    @Autowired
    private BrandDao brandDao;

    @Test
    void contextLoads() {
        System.out.println(brandDao.selectList(null));

    }

}
