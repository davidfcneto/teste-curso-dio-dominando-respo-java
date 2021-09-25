package br.com.dio.model;

import java.util.Objects;

public class Gato {
	private String nome;
	private String cor;
	private String idade;

	public Gato() {}
	
	public Gato(String nome, String cor, String idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}

	/*	 Crtl + D apaga a linha Crtl + 3 - abre o painel de pesquisa alt + seta pra
	 cima muda a classe selecionada de lugar 
	 crtl + shift + f - reorganiza as linhas para melhor identação 
	 crtl + shift + o - importa as classes para o main
	 public Gato (String nome, String cor, Integer
	 idade) { this.name = name; this.cor = cor; this.idade = idade; }	 */

}
