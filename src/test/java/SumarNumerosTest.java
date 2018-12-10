import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumarNumerosTest {

	@Test
	public void testSuma() {
	 	int numeroA=5;
	 	int numeroB=6;
	 	
	 	SumarNumeros  sumaNum=new SumarNumeros();
	 	
	 	int calcula=sumaNum.sumaNumero(numeroA, numeroB);
	 	
	 	assertEquals(11, calcula);
	 	
	}

}
