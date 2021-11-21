package controle;

public class BreakRotulado {
	public static void main(String[] args) {
		
		//crianco rotulo para o parar o que eu determinar no caso o laço externo
		externo: for(int i =0; i <3; i++) {
			for (int j =0; j<3; j++) {
				if(j==1) {
					break externo;
				}
				System.out.printf("[%d %d]", i,j);
			}
			System.out.println();
		}
		System.out.println("FIM!! ");
	}

}
