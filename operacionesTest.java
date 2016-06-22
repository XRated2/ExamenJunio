import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
/**
 * 
 * @author samruima
 *
 */
@RunWith(Parameterized.class)
public class operacionesTest {
	operaciones op1;
	operaciones op2;
	operaciones resultado;
	/**
	 * Constructor por defecto
	 * @param op1
	 * @param op2
	 * @param resultado
	 */
	public operacionesTest(operaciones op1, operaciones op2, operaciones resultado){
		this.op1 =  op1;
		this.op2 =op2;
		this.resultado= resultado;
	}
	
	/**
	 * Crea un objeto operaciones antes de cada vez que se realiza el testeo. 
	 */
	@Before
	public void crear() {
		operaciones op1 = new operaciones();
	}
	/**
	 * Define el array sobre el que se va a realizar el testeo.
	 * 
	 */
	@Parameters
	public static ArrayList<operaciones[]> datos()
	{
		ArrayList<operaciones[]> datos=new  ArrayList<operaciones[]>();
		operacionesTest op1= new operacionesTest(2,3,6);
		operaciones op2=new operaciones(5,2,10);
		operaciones[] dato1={op1,op2};
		
		datos.add(dato1);
		return datos;
		}
	
	/**
	 * Compara el resultado obtenido al multiplicar dos numeros con el resultado esperado.
	 */
	@Test
	public void testmultiplicacion() {
		assertEquals();
	}
	
	
}
