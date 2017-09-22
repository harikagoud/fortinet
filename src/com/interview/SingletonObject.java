package com.interview;

public class SingletonObject {
	//creating the single object
		private static SingletonObject instance = new SingletonObject();
		
		//private constructor so class cant be instantiated
		private SingletonObject(){}
		
		//get the only object created
		public static SingletonObject getObject(){
			return instance;
		}
		
		public void message(){
			System.out.println("This is a singleton object is created");
			
		}
}
