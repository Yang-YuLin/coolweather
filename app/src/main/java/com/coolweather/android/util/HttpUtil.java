package com.coolweather.android.util;//package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Yangyulin on 2018/8/20.
 */
public class HttpUtil {

    //发起一条HTTP请求和服务器交互，服务器返回的数据都是json格式的
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
