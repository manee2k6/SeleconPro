package com.selecon.practise;

public class Audi extends BMW {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start();
		accelerate();
		applyGear();
		steering();
		cruiseControl();
		stop();
		smartLock();
	}
	
	public static void cruiseControl(){
		System.out.println("control acceleration and applying gear...");
	}
	
	public static void sensorDetection(){
		System.out.println("Detect any obstacles nearby 100mts on the road..");
	}

}
