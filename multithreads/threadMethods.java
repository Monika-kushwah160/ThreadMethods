
package com.mycompany.multithreads;


public class threadMethods  extends Thread
{

    public void start() 
    {
       System.out.println(Thread.currentThread().getName());
        System.out.println("present thread");
        
    }
  
    public static void main(String[] args)
    {
        threadMethods t1 = new threadMethods();
        System.out.println("this is main thread");
         t1.run();
        t1.start();
       
        System.out.println(Thread.currentThread().getName());
    }
}
