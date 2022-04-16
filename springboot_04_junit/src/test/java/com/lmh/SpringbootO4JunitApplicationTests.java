package com.lmh;

import com.lmh.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootO4JunitApplicationTests {

    //注入你要测试的对象
    @Autowired
    private BookDao bookDao;




    @Test
    void contextLoads() {
        //执行要测试的对象的方法

       bookDao.save();
    }

}
