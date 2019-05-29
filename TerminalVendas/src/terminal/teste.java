package terminal;
import java.util.Random;

public class teste {

	public static void main(String [] args) {
	
	Random gerador = new Random();
	
	for (int i=0; i<4; i++) {
		System.out.println(gerador.nextInt(9999));
	}

	}
	}
