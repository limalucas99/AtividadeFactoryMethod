import Danrley_Duck.Duck;
import Danrley_Duck.FerrugineDuck;

public class SouthDuck extends DuckStore {

	@Override
	public Duck createDuck() {
		
		return new FerrugineDuck();
	}

	@Override
	public Duck createDuck(String type) {
		if (type.equalsIgnoreCase("Ferrugine")) 
			return new FerrugineDuck();
		
		
		return null;
	}
	
	
}
