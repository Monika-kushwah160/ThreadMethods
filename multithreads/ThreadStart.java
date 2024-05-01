
package com.mycompany.multithreads;


public class ThreadStart implements Runnable
{
    
    public void run()
    {
        System.out.println("this is thread");
    }
    public static void main(String[] args) {
        ThreadStart t1 = new ThreadStart();
        Thread th = new Thread(t1);
        th.start();
        t1.run();
    }
}
