package com.selecon.practise;

public class BMW extends Car {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		start();
		accelerate();
		applyGear();
		steering();
		stop();
		smartLock();

	}
	
	public static void start(){
		System.out.println("BMW Start of the car...");
	}
	
	public static void smartLock(){
		System.out.println("Lock the car automatically");
	}
	


}
