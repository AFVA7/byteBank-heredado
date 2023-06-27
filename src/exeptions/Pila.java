package exeptions;

public class Pila {

	public static void main(String[] args)  {
		System.out.println("Inicio de main");
		metodo1();
		System.out.println("Fin main");
	}

	private static void metodo1()  {
		System.out.println("Inicio metodo 1");
		try {
			metodo2();
		} catch (Exception me) {
			me.printStackTrace();
		}	
		System.out.println("Fin metodo 1");
	}

	private static void metodo2() throws MiException {
		System.out.println("Inicio metodo 2");
		int resul = 10/0;
		Cuenta c = null;
		c.depositar();
		throw new MiException("Mi primera exception");
	}

}
