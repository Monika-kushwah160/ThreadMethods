
package com.mycompany.multithreads;
public class GroupThreadConstructor implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
    
    public static void main(String[] args) 
    {
        GroupThreadConstructor gtc = new GroupThreadConstructor();
        ThreadGroup tg1 = new ThreadGroup("present thread");
        ThreadGroup tg2 = new ThreadGroup(tg1,null); 
        ThreadGroup tg3 = new ThreadGroup(tg2,"monikakushwah"); 
                
              
          Thread t1 = new Thread(tg1, gtc,"one");    
          t1.start();    
          Thread t2 = new Thread(tg1, gtc,"two");    
          t2.start();    
          Thread t3 = new Thread(tg1, gtc,"three");    
          t3.start();    
                 
          System.out.println("Thread Group Name: "+tg1.getName());    
         tg1.list(); 
    }
    
}
