package byteBank_heredado;

public class ControlBonificacion {
	
	private double suma;
	
	public double registrarSalario(Funcionario funcionario){
		this.suma += funcionario.getBonificacion();
		System.out.println("suma actual: " + this.suma);
		return this.suma;
	}
	
	public double getSuma() {
		return suma;
	}

}
