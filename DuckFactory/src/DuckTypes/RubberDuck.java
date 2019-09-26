package Danrley_Duck;

import Danrley_Behavior.KuakDuck;

public class RubberDuck extends Duck {

	@Override
	public void speak() {
		//speak(duckbehavior);
		KuakDuck kd= new KuakDuck();
		kd.useDuck();
	}

	@Override
	public void fly() {
		System.out.println("Eu não posso voar");
		
	}

	



}
