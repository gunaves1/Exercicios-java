package exercicio0603;
import java.util.Scanner;
public class Moeda {

	public static void main(String[] args) {
		double real,euro;
		Scanner ler = new Scanner (System.in);

		System.out.println("Insira um valor em reais: ");
		real = ler.nextDouble();

		euro = real*0.19;
		
		System.out.println("O valor em euro é " + euro);
		ler.close();
	}

}
