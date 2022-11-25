
public class FabricaDeCarros {

	private static FabricaDeCarros instancia;
	private int totalDeCarrosFiat;
	private int totalDeCarrosFord;
	private int totalDeCarrosAudi;
	private int totalDeCarrosFiatVendidos;
	private int totalDeCarrosFordVendidos;
	private int totalDeCarrosAudiVendidos;

	private FabricaDeCarros() {

	}

	public static synchronized FabricaDeCarros getInstance() {
		if (instancia == null) {
			instancia = new FabricaDeCarros();

		}
		return instancia;
	}

	public int criarCarroFiat() {
		totalDeCarrosFiat++;
		System.out.println("Carro fiat criado com sucesso");
		return totalDeCarrosFiat;
	}

	public int criarCarroFord() {
		totalDeCarrosFord++;
		System.out.println("Carro FORD criado com sucesso");
		return totalDeCarrosFord;
	}

	public int criarCarroAudi() {
		totalDeCarrosAudi++;
		System.out.println("Carro AUDI criado com sucesso");
		return totalDeCarrosAudi;
	}

	public int venderCarro(String marca) {
		if (marca.equals("Fiat")|| marca.equals("fiat") || marca.equals("FIAT")) {
			System.out.println("Carros FIAT vendido com sucesso");
			return totalDeCarrosFiatVendidos ++;
		}
		else if (marca.equals("Ford")|| marca.equals("ford") || marca.equals("FORD")) {
			System.out.println("Carros FORD vendido com sucesso");
			return totalDeCarrosFordVendidos ++;
		}
		else if (marca.equals("Audi")|| marca.equals("audi") || marca.equals("AUDI")) {
			System.out.println("Carros AUDI vendido com sucesso");
			return totalDeCarrosAudiVendidos ++;
		} else {
			System.out.println("ERRO NA VENDA DE CARROS");
		}
	
		return 0;
	}

	public void mostarRelatorio() {
		System.out.println("Total de carros FIAT criado: " + totalDeCarrosFiat);
		System.out.println("Total de carros Ford criado: " + totalDeCarrosFord);
		System.out.println("Total de carros AUDI criado: " + totalDeCarrosAudi);
		
		System.out.println("\n");
		
		System.out.println("Total de carros FIAT vendidos: " + totalDeCarrosFiatVendidos);
		System.out.println("Total de carros Ford vendidos: " + totalDeCarrosFordVendidos);
		System.out.println("Total de carros AUDI vendidos: " + totalDeCarrosAudiVendidos);

	}

	public static FabricaDeCarros getInstancia() {
		return instancia;
	}

	public static void setInstancia(FabricaDeCarros instancia) {
		FabricaDeCarros.instancia = instancia;
	}

	public int getTotalDeCarrosFiat() {
		return totalDeCarrosFiat;
	}

	public void setTotalDeCarrosFiat(int totalDeCarrosFiat) {
		this.totalDeCarrosFiat = totalDeCarrosFiat;
	}

	public int getTotalDeCarrosFord() {
		return totalDeCarrosFord;
	}

	public void setTotalDeCarrosFord(int totalDeCarrosFord) {
		this.totalDeCarrosFord = totalDeCarrosFord;
	}

	public int getTotalDeCarrosAudi() {
		return totalDeCarrosAudi;
	}

	public void setTotalDeCarrosAudi(int totalDeCarrosAudi) {
		this.totalDeCarrosAudi = totalDeCarrosAudi;
	}

	@Override
	public String toString() {
		return "FabricaDeCarros [totalDeCarrosFiat=" + totalDeCarrosFiat + ", totalDeCarrosFord=" + totalDeCarrosFord
				+ ", totalDeCarrosAudi=" + totalDeCarrosAudi + ", totalDeCarrosFiatVendidos="
				+ totalDeCarrosFiatVendidos + ", totalDeCarrosFordVendidos=" + totalDeCarrosFordVendidos
				+ ", totalDeCarrosAudiVendidos=" + totalDeCarrosAudiVendidos + "]";
	}

	

}
