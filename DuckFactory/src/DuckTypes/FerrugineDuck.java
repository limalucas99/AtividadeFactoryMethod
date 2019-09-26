package Danrley_Duck;

import Danrley_Behavior.QuackDuck;

public class FerrugineDuck extends Duck{
	

	

	@Override
	public void speak() {
			QuackDuck kd = new QuackDuck();
			kd.useDuck();
		
	}

	@Override
	public void fly() {
			System.out.println("FLYING....");
		
	}
	


	
}
