package byteBank_heredado;

public class Contador extends Funcionario{
	
	
	
	public double getBonificacion() {
		// TODO Auto-generated method stub
		double boni = 200;
		System.out.println("EJECUTANDO DESDE EL CONTADOR");
		System.out.print("Bonificación del contador: " + boni);
		return boni;
	}

}
