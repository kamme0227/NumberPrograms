package com.multithread;
class MyThread extends Thread {

    public void run() {
        System.out.println("Thread is running by using thread class ");
    }
}
    public class ThreadExample1
    {
        public static void main(String[] args)
        {
            MyThread t1=new MyThread();
            t1.start();
        }
    }


