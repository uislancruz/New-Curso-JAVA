package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		String faixa = "vermelha";
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Shasam");
		case "verde":
			System.out.println("Sei o Capitão mavel");
		case "laranja":
			System.out.println("Sei o tsubasa");
		case "vermelha":
			System.out.println("Sei o Tekki ");
		}
	}

}
