public class Utilidad {

	/**
	 * @author Pablo Ladron Ordoyo
	 * @see Raúl Bonachía
	 * @since 01/03/2022
	 * @version 4.21.0
	 * @
	 */
	
	
	/**
	 * 
	 * @param a
	 * @return Devuelve un entero
	 */
	public int ejercicioD(int a) {
		return (a==0) ? 0: a+factorial(a);
	}
	
	/**
	 * 
	 * @param n
	 * @return Devuelve un entero
	 */
	public int factorial(int n) {
		if (n==1) {
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
	
	/**
	 * 
	 * @param enteroUno
	 * @param enteroDos
	 * @return Devuelve un boolean de si es primo o no
	 */
	
	public boolean refactorizacionD(int enteroUno, int enteroDos) {
		// Calculo único
		 final int enteroC = enteroUno + enteroDos;
		// Calculo único
		 final int enteroD = enteroC + 34;
		
		boolean esPrimo = esPrimo(enteroD);
		
		boolean resultado = !esPrimo;
		return (resultado);
	}
	/**
	 * 
	 * @param d
	 * @return Devuelve un boolean
	 */

	public boolean esPrimo(final int d) {
		//Calculo si d es primo
		boolean esPrimo = true;
		for (int i=2;i<d;i++) {
			if (d%i==0) {
				esPrimo = false;
			}
		}
		return esPrimo;
	}
	
}

	