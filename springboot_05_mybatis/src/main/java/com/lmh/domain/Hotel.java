package com.lmh.domain;

import org.springframework.stereotype.Component;

@Component
public class Hotel {
    private int id;
    private String name;
    private String type;
    private String num;


    public Hotel(int id, String name, String type, String num) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.num = num;
    }

    public Hotel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", num='" + num + '\'' +
                '}';
    }
}
