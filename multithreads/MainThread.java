
package com.mycompany.multithreads;
 class MainThread1 extends Thread
{
    public void run()  
     {    
        int a= 10;  
        int b=12;  
        int ans = a*b;    
        System.out.println("Multiple of "+a+" and "+b+" is: "+ ans);  
     }
}
 class MainThread2 extends Thread
{
    public void run()  
     {    
        int a= 50;  
        int b=10;  
        int ans = a-b;  
        System.out.println("subtraction of "+a+" and "+b+" is: "+ ans);  
     }
}
public class MainThread extends Thread 
{

	   public static void main(String[] args) 
           {
               MainThread1 m1 = new MainThread1();
               Thread t = new Thread(m1);
               t.start();
               MainThread2 m2 = new MainThread2();
               Thread t2 = new Thread(m2);
               t2.start();
               System.out.println("This is main thread");
        
    }
}

