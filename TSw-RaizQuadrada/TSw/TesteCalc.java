import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class TesteCalc {
	// criando um objeto c a apartir do metodo calc
	
	Calc c;

	// Instanciando objeto
	@Before
	public void LimparVariaveis(){
	new Calc();
	}
	
	@Test(expected=NullPointerException.class)
	public void TesteRaizQuadradaNullPoint() {
		//Arrumar 
		double num = 0.0;
		num = 2.2;
		double result;
		//Ação
		result = c.raizQuadrada(num);
		//Comparar
		assertEquals(4, result);
	}
	
	// limpar objeto
	@After
	public void Finalizar(){
	c = null;
	}
}
