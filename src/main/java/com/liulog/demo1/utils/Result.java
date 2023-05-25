package com.liulog.demo1.utils;

import com.alibaba.fastjson2.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Result {
    public static String okGetStiring(){
        Map<String,Object> map = new HashMap<>();
        map.put("code",200);
        map.put("Message","OK");
//        map.put("date","");
        String s = JSONObject.toJSONString(map);
        return s;

    }
}
