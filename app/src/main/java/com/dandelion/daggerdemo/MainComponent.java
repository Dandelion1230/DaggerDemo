package com.dandelion.daggerdemo;

import dagger.Component;

/**
 * Created by Administrator on 2016/12/28.
 */

@PerActivity
@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
