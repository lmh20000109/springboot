package com.lmh.impl;

import com.lmh.dao.BookDao;
import org.springframework.stereotype.Repository;


@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao is running....");
    }
}
