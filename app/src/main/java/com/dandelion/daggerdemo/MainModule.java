package com.dandelion.daggerdemo;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2016/12/28.
 */

@Module // 表明该类是Module类
public class MainModule {


    @PerActivity
    @Provides // 声明Module类中哪些方法是用来提供依赖对象
    @Named("red")
    public Cloth getRedCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("红色");
        return cloth;
    }


    @Provides
    @Named("blue")
    public Cloth getBlueCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("蓝色");
        return cloth;
    }

    @Provides
    public Clothes getClothes(@Named("red") Cloth cloth) {
        return new Clothes(cloth);
    }

}
