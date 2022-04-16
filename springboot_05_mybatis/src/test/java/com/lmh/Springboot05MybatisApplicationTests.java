package com.lmh;

import com.lmh.dao.HotelDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot05MybatisApplicationTests {

    @Autowired
    private HotelDao hotel;

    @Test
    void contextLoads() {
        System.out.println(hotel.getById(1));

    }

}
