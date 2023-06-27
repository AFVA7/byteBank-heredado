package byteBank_heredado;

public class AutenticacionUtil {
	
	private String clave;
	
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return this.clave == clave;
	}
	
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		this.clave = clave;
	}
	public String getClave() {
		return clave;
	}

}
