package com.DouBan;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


import java.io.IOException;

public class DouBan {
    public static void main(String[] args)throws IOException{
        CloseableHttpClient httpClient= HttpClients.createDefault();
        HttpGet httpGet=new HttpGet("http://www.douban.com");
        httpGet.setHeader("User-Agent"," Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/85.0.4183.121 Safari/537.36");
        CloseableHttpResponse response=httpClient.execute(httpGet);
        if(response.getStatusLine().getStatusCode()==200);
        HttpEntity httpEntity=response.getEntity();
        String content= EntityUtils.toString(httpEntity,"utf-8");
        System.out.println(content);

    }
}
