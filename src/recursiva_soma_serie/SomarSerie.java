package recursiva_soma_serie;

public class SomarSerie {

	public static double somar(int n) {
		// condicao de parada quando n for 1, retornando 1
		if (n == 1) {
			return 1;
		}

		// soma 1/n ao resultado da chamada recursiva e chama a função novamente
		// passando n-1
		return 1.0 / n + somar(n - 1);
	}
}
