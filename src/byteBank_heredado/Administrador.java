package byteBank_heredado;

public class Administrador extends Funcionario implements Autenticable{
	
	private AutenticacionUtil util;
	
	public Administrador() {
		// TODO Auto-generated constructor stub
		System.out.println("Aquí se inicia un Admin");
		util = new AutenticacionUtil();
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		this.util.setClave(clave);
	}
	
	public String getClave() {
		return this.util.getClave();
	}
	
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return this.getSalrio();
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return this.util.iniciarSesion(clave);
	}

}
