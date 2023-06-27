package byteBank_heredado;

public class Cliente implements Autenticable{
	
	private String nombre;
	private String documento;
	private String telefono;
	private AutenticacionUtil util;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
		System.out.println("Aquí se inicia un cliente");
		util = new AutenticacionUtil();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return this.util.iniciarSesion(clave);
	}
	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		this.util.setClave(clave);
	}
	public String getClave() {
		return util.getClave();
	}
	
	

}
