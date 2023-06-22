package byteBank_heredado;

public class Gerente extends Funcionario {
	
	private String clave;
	
	public void setClave(String clave){
		this.clave = clave;
	}
	
	public boolean iniciarSesion (String clave){

		return this.clave == clave;
	}
	
	public double getBonificación(){		
		return getSalrio();
	}

	
}
