package excecao.personalizadaA;

import excecao.Aluno;

public class Validar {
	
	private Validar() {}
		
		public static void aluno(Aluno aluno) {
			
			if(aluno == null) {
				
				throw new IllegalAccessException("O aluno está nulo!");
			}
			
			
			
		}
	

}
