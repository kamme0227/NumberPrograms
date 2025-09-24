package com.multithread;

import java.util.Comparator;
import java.util.concurrent.CompletableFuture;

//call the multiple different service API calls at a time by using Executer service //


public class ExecuterService {
    public static void main(String[] args)
    {
        CompletableFuture<String> api1=CompletableFuture.supplyAsync(()->callApi("API1")); // runs the given task in a separate background thread
        CompletableFuture<String> api2=CompletableFuture.supplyAsync(()->callApi("API2")); //supplyAsync is submitted the thread into ForkJoinPool.commonPool(a shared thread pool)
        CompletableFuture<String> api3=CompletableFuture.supplyAsync(()->callApi("API3"));

        CompletableFuture.allOf(api1,api2,api3).join();
        System.out.println("API1 Result"+api1.join());
        System.out.println("API2 Result"+api2.join());
        System.out.println("API3 Result" +api3.join());
    }

    public static String callApi(String apiName )
    {
        try
        {
            System.out.println(apiName +" started");
            Thread.sleep(2000);
            System.out.println(apiName+"stopped");
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return apiName + "response ";
    }
}
