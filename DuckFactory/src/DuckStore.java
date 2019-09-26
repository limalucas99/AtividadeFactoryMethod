import Danrley_Duck.Duck;

public abstract class DuckStore {
	
	//public abstract Duck createDuck(String type);
	public abstract Duck createDuck(String type);
	public abstract Duck createDuck();
	
	
	
	public final Duck orderDuck() {
		Duck duck = createDuck();
		duck.fly();
		duck.speak();
		return duck;
	}
	

}
