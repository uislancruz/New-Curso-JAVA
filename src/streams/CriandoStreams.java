package streams;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		Stream<String> langs = Stream.of("Java", " Lua", " JS\n");
		langs.forEach(print);
		
		
		String[] maisLangs = {"Phython", " Lisp", " Perl", " Go\n"};
		
		Stream.of(maisLangs).forEach(print);
	}

}
