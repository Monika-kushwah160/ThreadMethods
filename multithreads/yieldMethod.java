
package com.mycompany.multithreads;


public class yieldMethod extends Thread
{
     public void run()  
    {  
        for (int i=1; i<3 ; i++)  
            System.out.println(Thread.currentThread().getName() + " in control");  
    }  
    public static void main(String[]args)  
    {  
        yieldMethod t1 = new yieldMethod();  
        yieldMethod t2 = new yieldMethod();  
        t1.start();  
        t2.start();  
        for (int i=1; i<3; i++)  
        {  
            
            t1.yield();  
            System.out.println(Thread.currentThread().getName() + " in control");  
        }  
    }  
    
}
