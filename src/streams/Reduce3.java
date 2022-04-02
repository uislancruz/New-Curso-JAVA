package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		List<Aluno> aluno = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, Double> apenasNota = a -> a.nota;
		
//		Porque colocar o adicionar para retornar o Media, 
//		para colocar toda essa expressão na mesma linha.
		
		BiFunction<Media, Double, Media> calcularMedia = 
				(media, nota) -> media.adicionar(0);
		
		aluno.stream()
		.filter(aprovado)
		.map(apenasNota);
		
		
	}
}