package com.ubtrobot.facevisual.utils;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * ================================================
 * 作    者：jeasonlzy（廖子尧）Github地址：https://github.com/jeasonlzy
 * 版    本：1.0
 * 创建日期：16/9/28
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class Convert {

    private static Gson create() {
        return GsonHolder.gson;
    }

    private static class GsonHolder {
        private static Gson gson = new Gson();
    }

    public static <T> T fromJson(String json, Class<T> type) throws JsonIOException, JsonSyntaxException {
        return create().fromJson(json, type);
    }

    public static <T> T fromJson(String json, Type type) {
        return create().fromJson(json, type);
    }

    public static <T> T fromJson(JsonReader reader, Type typeOfT) throws JsonIOException, JsonSyntaxException {
        return create().fromJson(reader, typeOfT);
    }

    public static <T> T fromJson(Reader json, Class<T> classOfT) throws JsonSyntaxException, JsonIOException {
        return create().fromJson(json, classOfT);
    }

    public static <T> T fromJson(Reader json, Type typeOfT) throws JsonIOException, JsonSyntaxException {
        return create().fromJson(json, typeOfT);
    }

    public static String toJson(Object src) {
        return create().toJson(src);
    }

    public static String toJson(Object src, Type typeOfSrc) {
        return create().toJson(src, typeOfSrc);
    }
    
    public static String getRaw(Context context, int RawId) {

        try {
            InputStream is = context.getResources().openRawResource(RawId);
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(is));
            // StringBuffer线程安全；StringBuilder线程不安全  
            StringBuffer sb = new StringBuffer();
            for (String str = null; (str = reader.readLine()) != null;) {
                sb.append(str);
            }
            return sb.toString();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getAsset(Context context, String fileName) {

        try {
            InputStream is = context.getResources().getAssets().open(fileName);
            // StringBuffer线程安全；StringBuilder线程不安全  
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(is));
            StringBuffer sb = new StringBuffer();
            for (String str = null; (str = reader.readLine()) != null;)  {
                sb.append(str);
            }
            return sb.toString();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void JsonObject2HashMap(JSONObject jsonObject, Map<String, String> map) {
        Iterator<String> iterator = jsonObject.keys();

        while (iterator.hasNext()) {
            try {
                String key = iterator.next();
                String value = String.valueOf(jsonObject.getInt(key));
                
                if(key.equals("bandId")) key = "brandId";
                
                map.put(key, value);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void JsonObject2HashMap(JSONObject jo, List<Map<?, ?>> rstList) {
        for (Iterator<String> keys = jo.keys(); keys.hasNext();) {
            try {
                String key1 = keys.next();
                System.out.println("key1---" + key1 + "------" + jo.get(key1)
                        + (jo.get(key1) instanceof JSONObject) + jo.get(key1)
                        + (jo.get(key1) instanceof JSONArray));
                if (jo.get(key1) instanceof JSONObject) {

                    JsonObject2HashMap((JSONObject) jo.get(key1), rstList);
                    continue;
                }
                if (jo.get(key1) instanceof JSONArray) {
                    JsonArray2HashMap((JSONArray) jo.get(key1), rstList);
                    continue;
                }
                System.out.println("key1:" + key1 + "----------jo.get(key1):"
                        + jo.get(key1));
                json2HashMap(key1, jo.get(key1), rstList);

            } catch (JSONException e) {
                e.printStackTrace();
            }

        }

    }

    public static void JsonArray2HashMap(JSONArray joArr,
                                         List<Map<?, ?>> rstList) {
        for (int i = 0; i < joArr.length(); i++) {
            try {
                if (joArr.get(i) instanceof JSONObject) {

                    JsonObject2HashMap((JSONObject) joArr.get(i), rstList);
                    continue;
                }
                if (joArr.get(i) instanceof JSONArray) {

                    JsonArray2HashMap((JSONArray) joArr.get(i), rstList);
                    continue;
                }
                System.out.println("Excepton~~~~~");

            } catch (JSONException e) {
                e.printStackTrace();
            }

        }

    }

    public static void json2HashMap(String key, Object value,
                                    List<Map<?, ?>> rstList) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put(key, value);
        rstList.add(map);
    }

    public static Map<String,String> jsonStr2Map(String jsonStr){
        Map<String,String> map = new HashMap<>();
        try {
            JSONObject jsonObject = new JSONObject(jsonStr);
            Iterator<String> iterator = jsonObject.keys();
            while (iterator.hasNext()) {
                String key = iterator.next();
                String value = jsonObject.getString(key);
                map.put(key,value);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return map;
    }
}