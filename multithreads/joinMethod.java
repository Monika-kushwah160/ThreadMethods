
package com.mycompany.multithreads;


public class joinMethod extends Thread 
{ 
	public void run() 
	{ 
		for (int i = 0; i < 2; i++) 
		{ 
			try
			{ 
				Thread.sleep(1000); 
				System.out.println(Thread.currentThread().getName()); 
			} 

			catch(Exception e) 
			{ 
				System.out.println(e); 
			} 
			System.out.println(i); 
		} 
        } 
	public static void main (String[] args) 
	{ 
		joinMethod t1 = new joinMethod(); 
		joinMethod t2 = new joinMethod(); 
		joinMethod t3 = new joinMethod(); 

		
		t1.start(); 
		try
		{ 
			System.out.println( Thread.currentThread().getName()); 
			t1.join(); 
		} 

		catch(Exception e) 
		{ 
			System.out.println(e); 
		} 
		t2.start(); 
		try
		{ 
			System.out.println(Thread.currentThread().getName()); 
			t2.join(); 
		} 

		catch(Exception e) 
		{ 
			System.out.println(e); 
		} 

		t3.start(); 
	} 
} 


