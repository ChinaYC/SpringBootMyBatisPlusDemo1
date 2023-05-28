package com.liulog.demo1.utils;

import com.alibaba.fastjson2.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Result {
    public static String okGetStiring(String code,String message){
        Map<String,Object> map = new HashMap<>();
        map.put("code",code);
        map.put("Message",message);
        String s = JSONObject.toJSONString(map);
        return s;
    }
    public static String okGetStiringByDate(String code,String message,Object Date){
        Map<String,Object> map = new HashMap<>();
        map.put("code",code);
        map.put("Message",message);
        map.put("date",Date);
        String s = JSONObject.toJSONString(map);
        return s;
    }
}
