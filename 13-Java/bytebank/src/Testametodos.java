public class Testametodos {

	public static void main(String[] args) {
		
		Conta contadoPaulo = new Conta();
		
		contadoPaulo.deposita(200);
		
		System.out.println(contadoPaulo.saldo);
		
		contadoPaulo.saca(50);
		
		System.out.println(contadoPaulo.saldo);
		
		
		Conta contadaMarcela = new Conta();
		contadaMarcela.deposita(1000);
		
		contadaMarcela.tranfere(300, contadoPaulo);
		
		System.out.println(contadoPaulo.saldo);
		System.out.println(contadaMarcela.saldo);
		
	}
	
}
