package com.interview;

public class Singleton {
	public static void main(String[] args){
		//get the instance created in singleton class
		SingletonObject object = SingletonObject.getObject();
		
		//show the message
		object.message();
		
		//since constructor is private no other object can be created except the defined single instance
		//SingletonObject object2 = new SingletonObject();
		// above instance gives a compilation error
	}
}
