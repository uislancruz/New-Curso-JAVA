package classe;

public class EqualsHashcode {
	public static void main(String[] args) {
		
		Usuario variavelUsuario1 = new Usuario();
		variavelUsuario1.nome = "Pedro Silva";
		variavelUsuario1.email = "pedro.silva@ezemail.com.br";
		
		Usuario variavelUsuario2 = new Usuario();
		variavelUsuario2.nome = "Pedro Silva";
		variavelUsuario2.email = "pedro.silva@ezemail.com.br";
		
		System.out.println(variavelUsuario1 == variavelUsuario2);
		System.out.println(variavelUsuario1.equals(variavelUsuario2));
		System.out.println(variavelUsuario2.equals(variavelUsuario1));
		
		
	}

}
