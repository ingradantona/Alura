
public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira: "+ primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Segunda conta tem "+ segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Segunda conta tem "+ segundaConta.saldo);
		System.out.println("Primeira conta tem "+ primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
            System.out.println("é a mesma conta");                    
        } else {
            System.out.println("contas diferentes");
        }
	}
}
