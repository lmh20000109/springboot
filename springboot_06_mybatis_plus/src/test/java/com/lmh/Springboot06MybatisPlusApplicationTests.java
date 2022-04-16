package com.lmh;

import com.lmh.dao.BrandDao;
import com.lmh.dao.HotelDao;
import com.lmh.domain.brand;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Springboot06MybatisPlusApplicationTests {

    @Autowired
    private HotelDao hotelDao;


    @Autowired
    private BrandDao brandDao;

    @Test
    void contextLoads() {
        System.out.println(brandDao.selectById(2));
        System.out.println(brandDao.selectList(null));
    }

}
