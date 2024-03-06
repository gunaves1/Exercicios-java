package exercicio0603;
import java.util.Scanner;
public class CalculadoraTemperatura {
	
	public static void main (String[] args) {
		double celsius,fahrenheit; 
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Qual a temperatura em fahrenheit?");
		fahrenheit = ler.nextDouble();
		
		celsius = ((fahrenheit-32)*5)/9;
		
		System.out.println("A temperatura em celsius é" + celsius);
		ler.close();
	}

}
