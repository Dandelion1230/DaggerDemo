package com.dandelion.daggerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    private TextView tvText;
    @Inject
    @Named("blue")
    Cloth blueCloth;

    @Inject
    @Named("red")
    Cloth redCloth;
    @Inject
    Shoe shoe;
    @Inject
    Clothes clothes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvText = (TextView) findViewById(R.id.tv_text);
        MainComponent build = DaggerMainComponent.builder().mainModule(new MainModule()).build();
        build.inject(this);
//        tvText.setText("我现在有"+redCloth+"和"+blueCloth+"和"+shoe+"和"+clothes);
        tvText.setText("cloth==clothes中的cloth吗:"+ (redCloth == clothes.getCloth()));
    }
}
