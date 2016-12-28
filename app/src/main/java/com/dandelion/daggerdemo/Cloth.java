package com.dandelion.daggerdemo;

/**
 * Created by Administrator on 2016/12/28.
 */

/**
 * 布料类
 */
public class Cloth {

    private String color;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color + "布料";
    }
}
