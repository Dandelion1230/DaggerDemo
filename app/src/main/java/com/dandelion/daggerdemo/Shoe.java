package com.dandelion.daggerdemo;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/12/28.
 */

public class Shoe {

    @Inject
    public Shoe () {
    }

    @Override
    public String toString() {
        return "鞋子";
    }
}
