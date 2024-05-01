
package com.mycompany.multithreads;

import static java.lang.Thread.sleep;

public class sleepMethod extends Thread
{
    public void run()
    {
         System.out.println(Thread.currentThread().getName());
         try
         {
             for(int i=1;i<=5;i++)
             {
             Thread.sleep(1000);
                 System.out.println(i);
             }
         }
         catch(Exception e)
         {
             System.out.println(e);
         }
    }
    public static void main(String[] args) {
        sleepMethod t1 = new sleepMethod ();
        
        t1.run();
        System.out.println(Thread.currentThread().getName());
        
        
    }
    
}
