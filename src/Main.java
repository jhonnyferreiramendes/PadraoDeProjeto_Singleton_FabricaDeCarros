
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FabricaDeCarros.getInstance().criarCarroFiat();
		FabricaDeCarros.getInstance().criarCarroFiat();
		FabricaDeCarros.getInstance().criarCarroFiat();
		
		FabricaDeCarros.getInstance().criarCarroFord();
		FabricaDeCarros.getInstance().criarCarroFord();
		FabricaDeCarros.getInstance().criarCarroFord();
		FabricaDeCarros.getInstance().criarCarroFord();
		
		FabricaDeCarros.getInstance().criarCarroAudi();
		FabricaDeCarros.getInstance().criarCarroAudi();
		FabricaDeCarros.getInstance().criarCarroAudi();
		FabricaDeCarros.getInstance().criarCarroAudi();
		FabricaDeCarros.getInstance().criarCarroAudi();
		FabricaDeCarros.getInstance().criarCarroAudi();
		
		
		FabricaDeCarros.getInstance().venderCarro("fiat");
		FabricaDeCarros.getInstance().venderCarro("fiat");
		
		FabricaDeCarros.getInstance().venderCarro("ford");
		FabricaDeCarros.getInstance().venderCarro("ford");
		FabricaDeCarros.getInstance().venderCarro("ford");
		FabricaDeCarros.getInstance().venderCarro("ford");
		
		FabricaDeCarros.getInstance().venderCarro("AUDI");
		FabricaDeCarros.getInstance().venderCarro("AUDI");
		FabricaDeCarros.getInstance().venderCarro("AUDI");
		FabricaDeCarros.getInstance().venderCarro("AUDI");
		FabricaDeCarros.getInstance().venderCarro("AUD");
		
		System.out.println("\n");
		FabricaDeCarros.getInstance().mostarRelatorio();
		
		System.out.println("\n" + FabricaDeCarros.getInstance());
		
		

	}

}
