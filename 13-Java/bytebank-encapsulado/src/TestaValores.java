
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		Conta conta2 = new Conta(1337, 24226);
		
		
		conta.deposita(90);
		
		System.out.println(Conta.getTotal());
	}
}
