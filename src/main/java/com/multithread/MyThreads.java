package com.multithread;

import java.util.concurrent.CompletableFuture;

public class MyThreads {

    public static void main(String[] args)
    {
        CompletableFuture<String> api1=CompletableFuture.supplyAsync(()->apiCall("API1"));
        CompletableFuture<String> api2=CompletableFuture.supplyAsync(()->apiCall("API2"));
        CompletableFuture<String> api3=CompletableFuture.supplyAsync(()->apiCall("API3"));

        CompletableFuture.allOf(api1,api2,api3).join();
        System.out.println("API1"+api1.join());
        System.out.println("API2"+api2.join());
        System.out.println("API3"+api3.join());

    }


    public static String apiCall(String apiName)
    {
        try
        {
            System.out.println("Thread is started");
            MyThread.sleep(2000);
            System.out.println("Thread is ended");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return apiName +" response";
    }
}
