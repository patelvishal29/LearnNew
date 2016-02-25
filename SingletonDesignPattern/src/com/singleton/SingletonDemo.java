package com.singleton;

import com.singleton.Singleton.test;

public class SingletonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Singleton.getSingletonInstance().printLine();
		Singleton.getSingletonInstance().printLine();
		Singleton.getSingletonInstance().printLine();
		/*test[] t = Singleton.test.ON.valu();
		
		if(Singleton.test.ON.valueOf("OFf")){
			
		}*/
	}

}
