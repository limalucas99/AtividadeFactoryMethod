import java.util.ArrayList;
import java.util.Random;



public class TesteFactory {


	public static void main(String[] args) {
		 ArrayList<DuckStore> ducks = new ArrayList();
		 
		
		Random gerador = new Random ();
		 int numeroAtual;
		
		
		for (int i = 0; i < 100; i++) {
			numeroAtual = gerador.nextInt(2) + 1;
			
			if(numeroAtual == 1) {
				SouthDuck a = new SouthDuck();
				a.createDuck();
				ducks.add(a);
				a.orderDuck();
			}
			if(numeroAtual == 2) {
				NorthDuck b = new NorthDuck();
				b.createDuck();
				ducks.add(b);
				b.orderDuck();
				
			}
			
		}
		

	}

}
