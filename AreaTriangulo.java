package exercicio0603;
import java.util.Scanner;
public class AreaTriangulo {

	public static void main(String[] args) {
		double base,altura,area;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Qual a altura do triângulo? ");
		altura = ler.nextDouble();
		
		System.out.println("Qual a base do triângulo? ");
		base = ler.nextDouble();
		
		area = (base*altura)/2;
		
		System.out.println("A área do triângulo é: " + area);
		ler.close();

	}

}
