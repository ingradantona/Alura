
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1377, 184);
		
		Cliente paulo = new Cliente();
		
		paulo.setNome("paulo");
		
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
	}
}
