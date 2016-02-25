package com.singleton;

public class Singleton {

	public static enum test {ON,OFF};
	private static Singleton singletonInstace;
	
	private Singleton(){
		
	}
	
	public static Singleton getSingletonInstance(){
		
		if(singletonInstace == null){
			/*synchronized (Singleton.class) {
				if(singletonInstace== null){
					singletonInstace = new Singleton();
				}
			}*/
			singletonInstace = new Singleton();
			System.out.println("Inside Singleton null check");
			System.out.println("================================");
		}
		return singletonInstace;
	}
	public void printLine(){
		System.out.println("Inside print singleton object "+singletonInstace.toString());
	}
}
