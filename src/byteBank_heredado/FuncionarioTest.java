package byteBank_heredado;

public class FuncionarioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario funcionario = new Gerente();
		
		funcionario.setNombre("Andrés");
		funcionario.setDocumento("13473895");
		funcionario.setSalrio(2000);
	
		System.out.println(funcionario.getSalrio());
		System.out.println(funcionario.getBonificacion());
	}

}
