	package com.coding_interview;

	/*
	 There are three threads in a process. The first thread prints 1 1 1 �, the second one prints 2 2
2 �, and the third one prints 3 3 3 � endlessly. How do you schedule these three threads in order to print 1 2
3 1 2 3 ?	 
	 */
	
	class th extends Thread {
		
		int var;
		
		public th(int val) {
			// TODO Auto-generated constructor stub
			var=val;
			
		}
		
		public void run() {			
			while(true){
				synchronized (this) {					
					
					try{
					wait();
					System.out.println(getName()+"="+var);
					}catch(Exception e){
						System.out.println(e);
					}
					
				}
			
			}
			
		}
	}
	
	public class _2_19  {
			
		public static void main(String[] args) throws Exception {
			
			try{
			th t[]=new th[3];
			
			for(int i=0; i<3;i++){
				t[i]=new th(i+1);
				t[i].start();
			}
			
			Thread.currentThread().sleep(1000);
			System.out.println("wakeup");
			
			for(int i=0; i<3;i=i%3){
				
				synchronized(t[i]) {
				t[i].notify();
				}
				++i;
				
				Thread.sleep(10);
			}
			
				
			}catch(Exception e){
				e.printStackTrace();
			}
			
			
		}
	
	}
