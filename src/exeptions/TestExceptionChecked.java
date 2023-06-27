package exeptions;

public class TestExceptionChecked {
	
	
	
	public static void main(String[] args) throws MiException {
		Cuenta c = new Cuenta();
		c.depositar();
		
		System.out.println("Hola");
	}

}
