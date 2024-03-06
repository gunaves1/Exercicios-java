package exercicio0603;
import java.util.Scanner;
public class Fatorial {

	public static void main(String[] args) {
		double fatorial;
		Scanner ler = new Scanner (System.in);
		
		fatorial = 5*4*3*2*1;
		
		System.out.println("O fatorial de 5 é " + fatorial);
		ler.close();
	}

}
