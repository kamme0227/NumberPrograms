package com.multithread;

public class MyThreadLamda {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{System.out.println("Thread is started by using lamda");});
        t1.start();
    }
}
