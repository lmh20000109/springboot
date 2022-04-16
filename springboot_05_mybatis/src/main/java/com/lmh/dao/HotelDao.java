package com.lmh.dao;

import com.lmh.domain.Hotel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HotelDao {


    @Select("select * from test where id = #{id}")
    public Hotel getById(Integer id);
}
