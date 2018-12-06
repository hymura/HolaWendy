
public class SumarNumeros {
	
	

	public int sumaNumero(int numero1, int numero2) {
				
		return numero1+numero2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SumarNumeros calcular =new  SumarNumeros();
		
		int numeroA=2;
		int numeroB=2;
        int sumaDosNumeros;
		
		
		sumaDosNumeros=calcular.sumaNumero(numeroA, numeroB);
		System.out.println("Suma: "+sumaDosNumeros);
		
		
		
		

	}

}
