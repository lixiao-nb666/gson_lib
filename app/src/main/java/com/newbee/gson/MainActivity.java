package com.newbee.gson;

import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import com.newbee.gson_lib.gson.MyGson;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DemoBean demoBean=new DemoBean();
        demoBean.setA("fjdksfjlsk");
        demoBean.setB(119);
        String gs=MyGson.getInstance().toGsonStr(demoBean);
        Log.i("kankanshuju","kankanshuju1:"+gs);

        demoBean= MyGson.getInstance().fromJson(gs,DemoBean.class);
        Log.i("kankanshuju","kankanshuju2:"+demoBean);

    }


}