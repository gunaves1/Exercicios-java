package exercicio0603;
import java.util.Scanner;
public class QuatroOperações {

	public static void main(String[] args) {
		double a,b,soma,divi,multi,sub;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Insira o primeiro valor: ");
		a = ler.nextDouble();
		
		System.out.println("Insira o segundo valor: ");
		b = ler.nextDouble();
		
		soma = a+b;
		divi = a/b;
		multi = a*b;
		sub = a-b;
		
		System.out.println("Resultado da soma: " + soma);
		System.out.println("Resultado da subtração: " + sub);
		System.out.println("Resultado da divisão: " + divi);
		System.out.println("Resultado da multiplicação: " + multi);
		ler.close();
	}

}
