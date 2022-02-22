package oo.composicao;

import java.util.List;
import java.util.ArrayList;


public class Aluno {
	
	final String nome;
	final List<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	public String toString() {// sou obrigado a usar o public por conta da heran�a
		return nome;
	}

}
