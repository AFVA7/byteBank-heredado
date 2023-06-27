package byteBank_heredado;

public class TestAutenticacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SistemaInterno sistemaInterno = new SistemaInterno();
		Administrador administrador = new Administrador();
		sistemaInterno.setClave("Admin");
		
		sistemaInterno.autenticar(administrador);
	}

}
