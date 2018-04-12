package Examen_UF2;

public class CalculadoraTest {

	public static boolean residu(int numero) {
		return numero % 2 == 0;
	}
	
	public static int potencia(int numero1, int numero2) {
		int resultat = 0;
		for(int i=0; i <numero2; i++) {
			if(i==0) {
				resultat=numero1;
			}
		resultat = resultat*numero1;
		}
		
		return resultat;
	}
	

}
