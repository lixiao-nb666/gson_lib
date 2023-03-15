package com.newbee.gson_lib.gson.util;

import android.text.TextUtils;

import com.newbee.gson_lib.gson.MyGson;
import com.newbee.gson_lib.gson.bean.Msg;


public class NetToGet {
    private static NetToGet get;
    private final String tag = this.getClass().toString() + ">>>"; // LOG信息
    private final int netDataOk=0;
    private final int netDataErr=1;


    private NetToGet() {

    }

    public static NetToGet getInstance() {
        if (get == null)
            get = new NetToGet();
        return get;
    }

    public Msg getMessageBean(String gsonStr) {
        Msg msg=null;
        if(TextUtils.isEmpty(gsonStr)){
            msg= new Msg("",netDataErr,"str is null");
        }else{
            msg= MyGson.getInstance().fromJson(gsonStr,Msg.class);
            if(msg==null)
                msg=new Msg("",netDataErr,"data is err!");
        }
        return msg;
    }





}
