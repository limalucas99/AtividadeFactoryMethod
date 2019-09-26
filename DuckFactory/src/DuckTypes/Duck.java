package Danrley_Duck;

import Danrley_Behavior.DuckBehaviorFly;
import Danrley_Behavior.DuckBehaviorSpeak;

public abstract class Duck {
	DuckBehaviorSpeak duckbehavior;
	DuckBehaviorFly duckbehaviorfly;
	public  void fly(DuckBehaviorFly duckbehavior) {
			duckbehavior.useDuck();
	}
	public  void speak(DuckBehaviorSpeak duckbehavior) {
			duckbehavior.useDuck();
	}
	public abstract void speak();
	public abstract void fly();
}
