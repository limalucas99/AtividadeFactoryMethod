import Danrley_Duck.Duck;
import Danrley_Duck.RubberDuck;

public class NorthDuck extends DuckStore {

	@Override
	public Duck createDuck(String type) {
		if (type.equalsIgnoreCase("Rubber"))
			return new RubberDuck();
		
		return null;
	}

	@Override
	public Duck createDuck() {
		
		return new RubberDuck();
	}
	

	
}
