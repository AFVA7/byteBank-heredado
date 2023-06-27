package byteBank_heredado;

public class SistemaInterno {
	
	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean autenticar(Autenticable autenticable) {
		
		boolean esAutenticable = autenticable.iniciarSesion(clave);
		if(esAutenticable)
		{
			System.out.println("Login exitoso");
			return true;
		}else {
			System.out.println("error en el Login");
			return false;
		}
		
		
	}

}
