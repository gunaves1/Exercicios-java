package exercicio0603;
import java.util.Scanner;
public class CalculadoraKm {

	public static void main(String[] args) {
		double Km,ValorLitro,ConsumoMedio,CustoTotal,ConsumoTotal;
		Scanner ler = new Scanner (System.in);

		System.out.println("Qual o valor do litro de gasolina?");
		ValorLitro = ler.nextDouble();

		System.out.println("Qual a distância total percorrida?");
		Km = ler.nextDouble();

		System.out.println("Qual o consumo médio do seu carro?");
		ConsumoMedio = ler.nextDouble();

		ConsumoTotal = Km/ConsumoMedio;
		CustoTotal = ConsumoTotal*ValorLitro;

		System.out.println("Seu custo total do trajeto será de " + CustoTotal);
		
		System.out.println("Seu consumo total foi de " + ConsumoTotal);
		ler.close();
	}

}
